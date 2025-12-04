package com.firstec.common.helper;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.matrixone.apps.domain.DomainObject;
import com.matrixone.apps.domain.util.FrameworkException;
import com.matrixone.apps.domain.util.MapList;
import com.matrixone.apps.domain.util.MqlUtil;
import com.matrixone.apps.domain.util.PersonUtil;

import matrix.db.BusinessObject;
import matrix.db.Context;
import matrix.util.MatrixException;
import matrix.util.SelectList;
import matrix.util.StringList;

public class PersontUtils {
    /**
     * 사용자이름으로 DomainObject를 반환한다.
     *
     * @param conext EV6 context
     * @param name Business Object Name
     * @return Business Object가 존재하는 경우 true, 존재하지 않는 경우 false
     * @throws Exception 조회 실패 시 Error시 발행
     */
    public static DomainObject getPersonDomainObject(Context conext, String name) throws Exception {
        BusinessObject bo = new BusinessObject("Person", name, "-", "eService Production");
        if (bo.exists(conext)) return new DomainObject(bo);
        else {
            throw new MatrixException("해당 Department가 존재하지 않습니다.");
        }
    }


    public static String getDeptObjectId(Context context) throws Exception {
        return getDeptObjectId(context, getDeptCode(context));
    }

    public static String getDeptObjectId(Context context, String deptCd) throws Exception {
        String deptObjectId = "";
        String type = "Department";
        String name = deptCd;

        SelectList objSelect = new SelectList();
        objSelect.addElement("id");
        objSelect.addElement("name");

        MapList mapListResult = DomainObject.findObjects(context, type, name, "*", "*", "eService Production", null, null, true, objSelect, (short) 0);

        if (mapListResult.size() > 0) {
            Map mapID = (Map) mapListResult.get(0);
            deptObjectId = (String) mapID.get("id");
        }
        return deptObjectId;
    }

    /**
     * 로그인한 사용자의 부서코드를 리턴한다 (예 : Q210)
     *
     * @param context
     * @return
     * @throws Exception
     */
    public static String getDeptCode(Context context) throws Exception {
        return getDeptCode(context, context.getUser());
    }

    /**
     * Person Name에 해당되는 부서코드를 리턴한다.
     *
     * @param context
     * @param personName
     * @return
     * @throws Exception
     */
    public static String getDeptCode(Context context, String personName) throws Exception {
        Map mapDepartment = getDeptInfo(context, personName);
        // 부서코드(조직코드)
        String deptCode = (String) mapDepartment.get("deptCode") == null ? "" : (String) mapDepartment.get("deptCode");
        return deptCode;
    }

    /**
     * Person Name에 해당되는 부서명를 리턴한다.
     *
     * @param context
     * @param personName
     * @return
     * @throws Exception
     */
    public static String getDeptName(Context context, String personName) throws Exception {
        Map mapDepartment = getDeptInfo(context, personName);
        // 부서코드(조직코드)
        String deptName = (String) mapDepartment.get("deptName") == null ? personName : (String) mapDepartment.get("deptName");
        return deptName;
    }

    /**
     * Person Name에 해당되는 부서정보를 Map으로 리턴한다.
     *
     * @param context
     * @param personName
     * @return
     * @throws Exception
     */
    public static Map getDeptInfo(Context context, String personName) throws Exception {
        Map<String, String> orgMap = new HashMap<String, String>();
        // BusinessUnit Info
        DomainObject doPerson = PersonUtil.getPersonObject(context, personName);
        String personObjId = doPerson.getObjectId();

        // Department Empoloyee인경우 반환
        //
        String sMQL = "print bus "+personObjId+" select to[Member].from[Department].id dump |";
        String personDepartmentId = MqlUtil.mqlCommand(context, sMQL);


        if (StringUtils.isNotEmpty(personDepartmentId)) {
            personDepartmentId = personDepartmentId.replace("|40004.18679.57393.2157|", "");
            personDepartmentId = personDepartmentId.replace("40004.18679.57393.2157|", "");
            personDepartmentId = personDepartmentId.replace("|40004.18679.57393.2157", "");
            personDepartmentId = personDepartmentId.replace("40004.18679.57393.2157", "");
            return getOrgNameAndCode(context, personDepartmentId);
        } else {
            String personBusinessUnittId = MqlUtil.mqlCommand(context, "print bus "+personObjId+" select to[Business Unit Employee].from.id dump |");

            if (StringUtils.isNotEmpty(personBusinessUnittId)) {
                return getOrgNameAndCode(context, personBusinessUnittId);
            } else {
                return new HashMap();
            }
        }
    }

    /**
     * 부서의 명칭과 objectId값을 반환한다.
     * @param context
     * @param orgId
     * @throws FrameworkException
     */
    private static Map<String, String> getOrgNameAndCode(Context context, String orgId) throws FrameworkException {
        Map<String, String> orgMap = new HashMap();
        DomainObject org = DomainObject.newInstance(context, orgId);
        StringList infoList = new StringList();
        infoList.add("attribute[Organization ID]");
        infoList.add("attribute[Organization Name]");
        Map deptMap = org.getInfo(context, infoList);

        orgMap.put("deptCode", (String) deptMap.get("attribute[Organization ID]"));//부서코드
        orgMap.put("deptName", (String) deptMap.get("attribute[Organization Name]"));//부서명

        return orgMap;
    }

}
