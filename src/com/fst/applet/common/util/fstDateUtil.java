package com.fst.applet.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class fstDateUtil {

    public static String convertMarixDateToYYYYMMDD(String date) throws Exception {
        String strDate = "";
        Date d = null;
        SimpleDateFormat sdf1 = null;
        SimpleDateFormat sdf2 = null;

        try {
            if (date != null && !"".equals(date)) {
                sdf1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a", Locale.US);
                d = sdf1.parse(date);
                sdf2 = new SimpleDateFormat(" yyyy-MM-dd", Locale.US);
                strDate = sdf2.format(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return strDate;
    }

    public static String convertYYYYMMDDToMarixDate(String date) throws Exception {
        String strDate = "";
        Date d = null;
        SimpleDateFormat sdf1 = null;
        SimpleDateFormat sdf2 = null;

        try {
            if (date != null && !"".equals(date)) {
                sdf1 = new SimpleDateFormat("yyyy-M-d", Locale.US);
                d = sdf1.parse(date);
                sdf2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a", Locale.US);
                strDate = sdf2.format(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return strDate;
    }
}
