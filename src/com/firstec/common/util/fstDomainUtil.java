package com.firstec.common.util;

import com.fst.applet.common.util.PropUtil;
import com.matrixone.apps.domain.DomainObject;
import com.matrixone.apps.domain.util.EnoviaResourceBundle;
import com.matrixone.apps.domain.util.MapList;
import matrix.db.Context;
import matrix.util.StringList;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class fstDomainUtil extends DomainUtil{
    private static org.slf4j.Logger logger= LoggerFactory.getLogger("SHP");

    public static String getObjectIdByTNR(Context context, String type, String name, String rev, String where) {
        String objectId = "";

        try {
            MapList foundObject = DomainObject.findObjects(context,
                    type,
                    name,
                    rev,
                    "*",//owner
                    "*",//vault
                    where,
                    null,
                    true,
                    new StringList("id"),
                    (short)0);

            if(foundObject.isEmpty()) {
                if(logger.isDebugEnabled()) {
                    logger.warn(String.format("No business object '%s %s %s' found", type, name, rev));
                }
                return "";
            }

            if(foundObject.size() > 1) {
                throw new RuntimeException("More than one object result. Please clearly enter the type name revision.");
            }
            return (String) ((Map) foundObject.get(0)).get("id");
        } catch(Exception ex) {
            logger.error("Fail to access object - '" + type + "' '" + name + "' '" + rev + "'.", ex);
        }

        return objectId;
    }
    public static Map getInfoByTNR(Context context, String type, String name, String rev, String... params) {
        try {
            StringList slSelector = new StringList(params);

            return getInfoByTNR(context, type, name, rev, slSelector);
        } catch(Exception ex) {
            logger.error("Fail to access business object({} {} {}) info.", type, name ,rev);
            return null;
        }
    }
    public static String getInfoByTNR(Context context, String type, String name, String rev, String select) {
        String strRetVel = "";

        try {
            DomainObject dObj = getObjectByTNR(context, type, name, rev);

            if(dObj != null)
                strRetVel = dObj.getInfo(context, select);

        } catch(Exception ex) {
            logger.error("Fail to access business object({} {} {}) info({}).", type, name ,rev, select);
            return null;
        }

        return strRetVel;
    }
    public static Map getInfoByTNR(Context context, String type, String name, String rev, StringList selector) {
        Map mReturnMap = new HashMap();

        try {
            DomainObject dObj = getObjectByTNR(context, type, name, rev);

            if(dObj != null) {
                mReturnMap = dObj.getInfo(context, selector);
            }
        } catch(Exception ex) {
            logger.error("Fail to access business object({} {} {}) info.", type, name ,rev);
            return null;
        }

        return mReturnMap;
    }
    public static DomainObject getObjectByTNR(Context context, String type, String name, String rev) {
        return getObjectByTNR(context, type, name ,rev, "");
    }
    public static DomainObject getObjectByTNR(Context context, String type, String name, String rev, String where) {
        DomainObject dObj = null;

        try {
            String strObjectId = getObjectIdByTNR(context, type, name, rev, where);

            dObj = DomainObject.newInstance(context, strObjectId);

        } catch(Exception ex) {
            // do nothing
        }

        return dObj;
    }
    private static String getCustomProperties(String key) {
        return PropUtil.getPropValue("emxFrameworkCustom.properties", key);
    }
    /**
     * Context 획득
     * @throws Exception
     * @return Context
     */
    public static Context getContext() throws Exception {
        String sAdminUser = getCustomProperties("fstConfig.System.MATRIX.ADMIN.USER");
        String sAdminPassword = getCustomProperties( "fstConfig.System.MATRIX.ADMIN.PASSWORD");
        return getContext( sAdminUser,sAdminPassword);
    }

    public static Context getContext( String sUser, String sPasswd ) throws Exception {
        String sMatrixIp= getCustomProperties( "fstConfig.System.MATRIX.IP");
        return getContext( sMatrixIp, sUser, sPasswd );
    }

    public static Context getContext( String sIP, String sUser, String sPasswd ) throws Exception {
        String sMatrixHost= getCustomProperties( "fstConfig.System.MATRIX.HOST");
        return getContext( sMatrixHost, sIP, sUser, sPasswd );
    }

    public static Context getContext( String sHOST, String sIP, String sUser, String sPasswd ) throws Exception {
        Context context = new Context( null, null ); // 둘다 Null이어야 함....
//		context.setLocale( Locale.US );
        context.setUser( sUser );
        context.setPassword( sPasswd );
        context.connect();
        return context;
    }

    /**
     * Context Close
     * @param context Context
     * @throws Exception
     */
    public static void closeContext( Context context ) throws Exception {
        context.disconnect();
    }

}
