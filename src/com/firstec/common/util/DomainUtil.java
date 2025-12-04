package com.firstec.common.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.matrixone.apps.domain.DomainConstants;
import com.matrixone.apps.domain.DomainObject;
import com.matrixone.apps.domain.DomainRelationship;
import com.matrixone.apps.domain.util.ContextUtil;
import com.matrixone.apps.domain.util.FrameworkException;
import com.matrixone.apps.domain.util.FrameworkUtil;
import com.matrixone.apps.domain.util.MapList;
import com.matrixone.apps.domain.util.MqlUtil;
import com.matrixone.apps.domain.util.PersonUtil;

import matrix.db.BusinessObjectWithSelect;
import matrix.db.BusinessObjectWithSelectItr;
import matrix.db.Context;
import matrix.db.ExpansionIterator;
import matrix.db.File;
import matrix.db.FileList;
import matrix.db.MQLCommand;
import matrix.db.Query;
import matrix.db.RelationshipWithSelect;
import matrix.util.MatrixException;
import matrix.util.StringList;

public class DomainUtil {

    private static final Logger log = LoggerFactory.getLogger(DomainUtil.class);

    private static DomainObject tempDomainObject;

    /**
     * 주어진 정보를 가지고 Object를 생성한다.
     *
     * @param context       eMatix Context
     * @param type          Type
     * @param name          Name
     * @param revision      Revision
     * @param policy        Policy명
     * @param vault         Vault명
     * @param description
     * @param attributesMap Attribute에 등록할 내용, Key: Attribute Name, value: Attrubute value;
     * @return 생성된 Object의 DomainObject
     * @throws FrameworkException
     */
    public static DomainObject createObjectCommon(Context context, String type, String name, String revision, String policy, String vault, String description, Map<String, String> attributesMap) throws FrameworkException {
        try {
            if (vault == null)
                vault = "eService Production";

            String objectID = null;
            DomainObject obj = new DomainObject();
            obj.createObject(context, type, name, revision, policy, vault);

            obj.open(context);
            objectID = obj.getObjectId(context);
            obj.close(context);

            DomainObject domainObject = new DomainObject(objectID);
            domainObject.open(context);
            if (attributesMap != null)
                domainObject.setAttributeValues(context, attributesMap);
            if (description != null)
                domainObject.setDescription(context, description);

            return domainObject;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            throw new FrameworkException(ex);
        }
    }

    public static MapList getToList(Context context, DomainObject domainObject, String relationship, String type, String whereClause) throws FrameworkException {
        StringList busSelects = new StringList(5);
        busSelects.add(DomainConstants.SELECT_ID);
        busSelects.add(DomainConstants.SELECT_TYPE);
        busSelects.add(DomainConstants.SELECT_NAME);
        busSelects.add(DomainConstants.SELECT_REVISION);
        busSelects.add(DomainConstants.SELECT_CURRENT);
        StringList relSelects = new StringList(1);
        relSelects.add(DomainConstants.SELECT_RELATIONSHIP_ID);
        return domainObject.getRelatedObjects(context, relationship, type, busSelects, relSelects, false, true, (short) 1, whereClause, DomainConstants.EMPTY_STRING, 0);
    }

    public static void connect(Context context, String fromId, String toId, String relName) throws Exception {
        DomainRelationship.connect(context, fromId, relName, toId, true);
    }


    /**
     * <pre>
     *     오브젝트 검색.
     * </pre>
     *
     * @param context          the eMatrix <code>Context</code> object
     * @param type             Type Name.
     * @param selectStatements selects
     * @return
     * @throws FrameworkException
     */
    public static MapList find(Context context, String type, StringList selectStatements) throws FrameworkException {
        boolean isActiveTransaction = false;
//        List<BusinessObjectWithSelect> results = new ArrayList<>();
        MapList mapList = new MapList();
        try {
            if (!ContextUtil.isTransactionActive(context)) {
                isActiveTransaction = true;
            }

            if (isActiveTransaction) {
                ContextUtil.startTransaction(context, false);
            }

            if (type == null) {
                type = DomainConstants.QUERY_WILDCARD;
            }

            if (selectStatements == null) {
                selectStatements = DomainConstants.EMPTY_STRINGLIST;
            }

            Query query = new Query();
            query.open(context);
            query.setBusinessObjectType(type);
            query.setBusinessObjectName(DomainConstants.QUERY_WILDCARD);
            query.setBusinessObjectRevision(DomainConstants.QUERY_WILDCARD);
            query.setOwnerPattern(DomainConstants.QUERY_WILDCARD);
            query.setVaultPattern(DomainConstants.QUERY_WILDCARD);
            query.setWhereExpression(DomainConstants.EMPTY_STRING);
            query.setExpandType(true);
            query.setObjectLimit((short) 0);
            query.setSearchFormat(DomainConstants.QUERY_WILDCARD);
            query.setSearchText(DomainConstants.EMPTY_STRING);
            PersonUtil.setLastQuery(context, query);
            mapList = FrameworkUtil.toMapList(query.getIterator(context, selectStatements, (short) 0), new StringList(0));
            query.close(context);
            if (isActiveTransaction) {
                ContextUtil.commitTransaction(context);
            }
            return mapList;
        } catch (Exception e) {
            if (isActiveTransaction) {
                ContextUtil.abortTransaction(context);
            }
            throw new FrameworkException(e);
        }
    }

    public static MapList findLatest(Context context, String type, String name, String revision, StringList selectStatements) throws FrameworkException {
        return find(context, type, name, revision, null, "(latest==True)", selectStatements, null);
    }

    public static MapList find(Context context, String type, String where, StringList selectStatements, StringList multiValues) throws FrameworkException {
        return find(context, type, null, null, null, where, selectStatements, multiValues);
    }

    public static MapList find(Context context, String type, String name, String where, StringList objectSelects, StringList multiValues) throws FrameworkException {
        return find(context, type, name, null, null, where, objectSelects, multiValues);
    }

    public static MapList find(Context context, String type, String name, String vault, String where, StringList selectStatements, StringList multiValues) throws FrameworkException {
        return find(context, type, name, null, vault, where, selectStatements, multiValues);
    }

    public static MapList find(Context context, String type, String name, String revision, String vault, String where, StringList selectStatements, StringList multiValues) throws FrameworkException {
        boolean isActiveTransaction = false;
        MapList mapList = new MapList();
        try {
            if (!ContextUtil.isTransactionActive(context)) {
                isActiveTransaction = true;
            }

            if (isActiveTransaction) {
                ContextUtil.startTransaction(context, false);
            }

            if (type == null) {
                type = DomainConstants.QUERY_WILDCARD;
            }

            if (name == null) {
                name = DomainConstants.QUERY_WILDCARD;
            }

            if (revision == null) {
                revision = DomainConstants.QUERY_WILDCARD;
            }

            if (vault == null) {
                vault = DomainConstants.QUERY_WILDCARD;
            }

            if (where == null) {
                where = DomainConstants.EMPTY_STRING;
            }

            if (selectStatements == null) {
                selectStatements = DomainConstants.EMPTY_STRINGLIST;
            }

            if (multiValues == null) {
                multiValues = DomainConstants.EMPTY_STRINGLIST;
            }

            Query query = new Query();
            query.open(context);
            query.setBusinessObjectType(type);
            query.setBusinessObjectName(name);
            query.setBusinessObjectRevision(revision);
            query.setOwnerPattern(DomainConstants.QUERY_WILDCARD);
            query.setVaultPattern(vault);
            query.setWhereExpression(where);
            query.setExpandType(true);
            query.setObjectLimit((short) 0);
            query.setSearchFormat(DomainConstants.QUERY_WILDCARD);
            query.setSearchText(DomainConstants.EMPTY_STRING);
            PersonUtil.setLastQuery(context, query);
            mapList = FrameworkUtil.toMapList(query.getIterator(context, selectStatements, (short) 0), multiValues);
            query.close(context);
            if (isActiveTransaction) {
                ContextUtil.commitTransaction(context);
            }
            return mapList;
        } catch (Exception e) {
            if (isActiveTransaction) {
                ContextUtil.abortTransaction(context);
            }
            throw new FrameworkException(e);
        }
    }

    public static String[] getObjectIds(MapList mapList) {
        if (mapList != null&&mapList.size()>0) {
            String[] array = new String[mapList.size()];
            int ix = 0;
            for (Map map : (List<Map>) mapList)
            {
                array[ix++] = (String) map.get(DomainConstants.SELECT_ID);
            }
            return array;
        } else {
            return null;
        }
    }

    public static MapList getSelectBusinessObjectData(Context context, MapList mapList, StringList selectStatements) {
        return getSelectBusinessObjectData(context, mapList, selectStatements, DomainConstants.MULTI_VALUE_LIST);
    }

    public static MapList getSelectBusinessObjectData(Context context, MapList mapList, StringList selectStatements, java.util.Collection multiValues) {
        return getSelectBusinessObjectData(context, getObjectIds(mapList), selectStatements, multiValues);
    }

    public static MapList getSelectBusinessObjectData(Context context, String[] objectIds, StringList selectStatements) {
        return getSelectBusinessObjectData(context, objectIds, selectStatements, DomainConstants.MULTI_VALUE_LIST);
    }

    public static MapList getSelectBusinessObjectData(Context context, String[] objectIds, StringList selectStatements, java.util.Collection multiValues) {
        MapList mResults = new MapList();
        try {
            if (!selectStatements.contains(DomainConstants.SELECT_ID)) {
                selectStatements.add(DomainConstants.SELECT_ID);
            }
            BusinessObjectWithSelectItr businessObjectWithSelectItr = new BusinessObjectWithSelectItr(DomainObject.getSelectBusinessObjectData(context, objectIds, selectStatements));
            while (businessObjectWithSelectItr.next()) {
                BusinessObjectWithSelect select = businessObjectWithSelectItr.obj();
                Vector vc = select.getSelectKeys();
                Map mData = new HashMap();
                for (String string : (List<String>) vc)
                {
                    StringList selectDataList = select.getSelectDataList(string);

                    if (multiValues.contains(string)) {
                        if (selectDataList != null && selectDataList.size() > 0) {
                            mData.put(string, selectDataList);
                        } else {
                            mData.put(string, new StringList());
                        }
                    }else{
                        if (selectDataList != null && selectDataList.size() > 0) {
                            mData.put(string, selectDataList.size() == 1 ? selectDataList.get(0) : fstStringUtil.join(selectDataList, ","));
                        } else {
                            mData.put(string, "");
                        }
                    }
                }
                if (!vc.contains(DomainConstants.SELECT_ID)) {
                    mData.put(DomainConstants.SELECT_ID, select.getObjectId());
                }
                mResults.add(mData);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return mResults;
    }

    public static MapList getAllExpands(Context context, DomainObject domainObject, String relationship, String type, StringList busSelects, StringList relSelects, StringList multiValues) throws MatrixException {
        ExpansionIterator expItr = domainObject.getExpansionIterator(context, relationship, type, busSelects, relSelects, true, true, (short) 1, DomainConstants.EMPTY_STRING, DomainConstants.EMPTY_STRING, (short) 0, true, false, (short) 1000, true);
        MapList mapList = new MapList();
        if (multiValues == null) {
            multiValues = new StringList();
        }
        while (expItr.hasNext())
        {
            Map map = new HashMap();
            RelationshipWithSelect relationshipWithSelect = expItr.next();
            for (String key : (List<String>) busSelects) {
                StringList selDataList = relationshipWithSelect.getTargetSelectDataList(key);
                if (selDataList == null) {
                    selDataList = new StringList();
                }
                if (multiValues.contains(key)) {
                    map.put(key, selDataList);
                } else {
                    map.put(key, fstStringUtil.join(selDataList, ","));
                }
            }
            mapList.add(map);
        }
        return mapList;
    }

    public static int count(Context context, String type) throws FrameworkException {
        return count(context, type, null, null, null);
    }

    public static int count(Context context, String type, String whereClause) throws FrameworkException {
        return count(context, type, null, null, whereClause);
    }

    public static int count(Context context, String type, String name, String revision, String where) throws FrameworkException {
        if (name == null) {
            name = DomainConstants.QUERY_WILDCARD;
        }

        if (revision == null) {
            revision = DomainConstants.QUERY_WILDCARD;
        }

        StringBuffer sbMQL = new StringBuffer(100);
        sbMQL.append("eval expression $1 on temp query bus $2 $3 $4");
        if (fstStringUtil.isNotNullString(where)) {
            sbMQL.append(" where $5");
            return NumberUtils.toInt(MqlUtil.mqlCommand(context, sbMQL.toString(), "count(true)", type, name, revision, where));
        } else {
            return NumberUtils.toInt(MqlUtil.mqlCommand(context, sbMQL.toString(), "count(true)", type, name, revision));
        }
    }

    public static boolean exists(Context context, String type, String name, String revision, String where) {
        try {
            MQLCommand mqlCommand = new MQLCommand();
            String mql = "temp query bus $1 $2 $3 where $4 select exists dump";
            String[] params = new String[4];
            params[0] = type;
            params[1] = name;
            params[2] = revision;
            params[3] = where;
            boolean b = mqlCommand.executeCommand(context, false, false, mql, params);
            if( b ) {
                String result = mqlCommand.getResult();
                System.out.println(result);
            }
            return false;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String hasTo(String relationship) {
        return hasTo(relationship, null);
    }

    public static String hasTo(String relationship, String where) {
        if (fstStringUtil.isNotNullString(where)) {
            return "from[" + relationship + "|" + where + "]";
        } else {
            return "from[" + relationship + "]";
        }
    }

    public static String getSelectToId(String relationship) {
        return getSelectToId(relationship, null);
    }

    public static String getSelectToId(String relationship, String where) {
        if (fstStringUtil.isNotNullString(where)) {
            return "from[" + relationship + "|" + where + "].to.id";
        } else {
            return "from[" + relationship + "].to.id";
        }
    }

    public static String getInfo(Context context, String objectId, String select) {
        if (fstStringUtil.isNotNullString(objectId)) {
            try {
                if (tempDomainObject == null) {
                    tempDomainObject = DomainObject.newInstance(context);
                }
                tempDomainObject.setId(objectId);
                return tempDomainObject.getInfo(context, select);
            } catch (Exception e) {
                return "";
            }
        } else {
            return "";
        }
    }

    public static Map getInfo(Context context, String objectId, StringList infoSelects) throws FrameworkException {
        return getInfo(context, DomainObject.newInstance(context, objectId), infoSelects);
    }

    public static Map getInfo(Context context, DomainObject domainObject, StringList infoSelects) throws FrameworkException {
        return domainObject.getInfo(context, infoSelects);
    }

    public static Map getInfo(Context context, DomainObject domainObject, StringList infoSelects, StringList multiSelects) throws FrameworkException {
        boolean isOpen = domainObject.openObject(context);
        Map map = new HashMap();
        try {
            BusinessObjectWithSelect boSelects = domainObject.select(context, infoSelects);
            Vector<String> keys = boSelects.getSelectKeys();
            for (String key : keys) {
                if (multiSelects != null && multiSelects.contains(key)) {
                    map.put(key, boSelects.getSelectDataList(key));
                } else {
                    map.put(key, boSelects.getSelectData(key));
                }
            }
        } catch (Exception e) {
            throw new FrameworkException(e);
        } finally {
            domainObject.closeObject(context, isOpen);
        }
        return map;
    }

    /**
     * <p>
     *     오브젝트의 모든 파일을 체크아웃 받는다.
     * </p>
     * @param context mx context.
     * @param objectId 오브젝트 OID.
     * @param outputDirectory 체크아웃 받을 디렉토리.
     * @return 체크아웃 파일 이름 목록.
     * @throws MatrixException
     */
    public static StringList checkoutAll(Context context, String objectId, String outputDirectory) throws MatrixException {
        return checkoutAll(context, DomainObject.newInstance(context, objectId), outputDirectory);
    }

    /**
     * <p>
     *     오브젝트의 모든 파일을 체크아웃 받는다.
     * </p>
     * @param context mx context.
     * @param domainObject mx domain object.
     * @param outputDirectory 체크아웃 받을 디렉토리.
     * @return 체크아웃 파일 이름 목록.
     * @throws MatrixException
     */
    public static StringList checkoutAll(Context context, DomainObject domainObject, String outputDirectory) throws MatrixException {
        StringList fileNames = new StringList();
        java.io.File dir = new java.io.File(outputDirectory);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        FileList fileList = domainObject.getFiles(context);

        if (fileList != null && fileList.size() > 0) {
            int iCount = fileList.size();
            for (int i = 0; i < iCount; i++) {
                File mxFile = (File) fileList.get(i);
                String sFileName = mxFile.getName();
                String sFormat = mxFile.getFormat();
                domainObject.checkoutFile(context, false, sFormat, sFileName, outputDirectory);
                fileNames.add(sFileName);
            }
        }
        return fileNames;
    }

    /**
     * <p>
     *     Project Space 정보 조회.
     * </p>
     * @param context matrix.db.context
     * @param name 'Project Space' name.
     * @return project info map
     * @throws FrameworkException
     */
    public static Map getProjectMap(Context context, String name) throws FrameworkException {
        StringList busSelect = new StringList(1);
        busSelect.add(DomainConstants.SELECT_ID);
        busSelect.add(DomainConstants.SELECT_NAME);
        busSelect.add(DomainObject.getAttributeSelect(DomainConstants.ATTRIBUTE_TITLE));
        MapList mapList = DomainObject.findObjects(context, DomainConstants.TYPE_PROJECT_SPACE, name, "*", "*", "*", "", true, busSelect);
        if (mapList != null && mapList.size() > 0) {
            return (Map) mapList.get(0);
        } else {
            return null;
        }
    }

    public static String getProjectID(Context context, String name) throws FrameworkException {
        Map mProject = getProjectMap(context, name);
        return mProject != null ? (String) mProject.get(DomainConstants.SELECT_ID) : "";
    }
}
