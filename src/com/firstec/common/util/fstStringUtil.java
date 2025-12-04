package com.firstec.common.util;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Vector;

import org.apache.commons.lang3.math.NumberUtils;

import com.matrixone.apps.domain.DomainObject;
import com.matrixone.apps.domain.util.ContextUtil;
import com.matrixone.apps.domain.util.FrameworkUtil;
import com.matrixone.apps.domain.util.MapList;
import com.matrixone.apps.domain.util.MqlUtil;
import com.matrixone.apps.framework.ui.UIUtil;

import matrix.db.Context;
import matrix.util.SelectList;
import matrix.util.StringList;

public class fstStringUtil extends org.apache.commons.lang3.StringUtils {

    public static final String EMPTY_STRING_ARRAY[] = new String[0];

    public static boolean isEmptyString(String str) {
        return equalsIgnoreCase("null", str) || isBlank(str);
    }

    public static boolean isNotEmptyString(String str) {
        return !equalsIgnoreCase("null", str) && isNotBlank(str);
    }

    public static String defaultBooleanString(String str, boolean bool) {
        if (isEmptyString(str))
            return Boolean.toString(bool);
        else
            return str;
    }
    public static boolean isNotNullAndNotEmpty(String arg) {
        return !isNullString(arg);
    }
    public static String defaulutEmptyString(String str, String defaultStr) {
        if (isNullString(str))
            return defaultStr;
        else
            return str;
    }

    public static String defaultString(Map map, String key) {
        return defaultString(map, key, EMPTY);
    }

    public static String defaultString(Map map, String key, String defaultString) {
        return defaulutEmptyString((String) map.get(key), defaultString);
    }

    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0)
            return true;
        for (int i = 0; i < strLen; i++)
            if (!Character.isWhitespace(str.charAt(i)))
                return false;

        return true;
    }

    /**
     * String을 Empty 처리를 한다.
     * null일경우는 ""를 리턴하고, 그렇지 않을 경우는 양쪽 스페이스를 없애고 리턴한다.
     *
     * @param str String 원본 String
     * @return String 원본 String가 null일 경우 "" 그렇지 않을 경우 trim 된 String
     */
    public static String setEmpty(String str) {
        String ret = "";
        if (str != null) {
            ret = str.trim();
        }
        return ret;
    }

    /**
     * String을 Empry 처리를 한다.
     * null일경우와 "0"일 경우는 ""를 리턴하고, 그렇지 않을 경우는 양쪽 스페이스를 없애고 리턴한다.
     *
     * @param str
     * @return
     */
    public static String setEmptyIncludeZero(String str) {
        String ret = "";
        if (str != null && (Integer.parseInt(str) > 0 || Integer.parseInt(str) < 0)) {
            ret = str.trim();
        }
        return ret;
    }

    /**
     * String을 Empty 처리를 한다.
     * null일경우는 ""를 리턴하고, 그렇지 않을 경우는 양쪽 스페이스를 없애고 리턴한다.
     *
     * @param pParam          String 원본 String
     * @return String 원본 String가 null일 경우 "" 그렇지 않을 경우 trim 된 String
     */
    public static String NVL(Object pParam) {
        return NVL(pParam, "");

    }

    /**
     * String을 Empty 처리를 한다.
     * null일경우는 strDefaultValue를 리턴하고, 그렇지 않을 경우는 양쪽 스페이스를 없애고 리턴한다.
     *
     * @param pParam          object
     * @param strDefaultValue pParam이 null일시 대체될 값
     * @return String 원본 String가 null일 경우 "" 그렇지 않을 경우 trim 된 String
     */
    public static String NVL(Object pParam, String strDefaultValue) {
        String ret = "";


        if (pParam != null) {
            if (pParam instanceof String) {
                ret = (String) pParam;
            } else {
                ret = pParam.toString();
            }

            ret = ret.trim();
            if (isEmptyString(ret)) {
                ret = strDefaultValue;
            }
        } else {
            ret = strDefaultValue;
        }
        return ret;
    }

    /**
     * String 타입 변수가 아무 값을 가지지 않는지를 체크한다.
     * 아무 값을 가지지 않는 다는 경우는 null, "", "null" 인 경우를 포함한다.
     *
     * @param arg 체크할 String 타입 변수
     * @return String 타입 변수가 아무 값을 가지지 않는 경우 true, 아니면 false
     */
    public static boolean isNullString(String arg) {
        if (arg == null || arg.equals("") || arg.equalsIgnoreCase("null"))
            return true;
        else
            return false;
    }

    /**
     * setEmpty() 메소드와 유사한 기능을 제공하는데, 값이 null인 경우 외에 "null"인 경우도
     * 포함하여 처리한다. 단, trim() 기능은 제공하지 않는다.
     *
     * @param str String 원본 String
     * @return String 원본 String가 null일 경우 "" 그렇지 않을 경우 trim 된 String
     */
    public static String setEmptyExt(String str) {
        if (isNullString(str)) {
            return "";
        } else {
            return setEmpty(str);
        }
    }

    /**
     *
     * @param str String
     * @param len int
     * @return String
     */
    /*
    public static String header( String str, int len ) {
        return header( str, len, " " );
    }
    */

    /**
     *
     * @param str String
     * @param len int
     * @return String
     */
    /*
    public static String header( String str, int len, String sFillPost ) {
        str = setEmptyExt( str );
        str += getFillString( sFillPost, len );

        if( str.length() > len ) {
            str = str.substring( 0, len );
        }
        return str;
    }
    */

    /**
     *
     * @param str String
     * @param len int
     * @return String
     */
    /*
    public static String tail( String str, int len ) {
        return tail( str, len, " " );
    }

    public static String tail( String str, int len, String sFillPre ) {
        str = getFillString( sFillPre, len ) + setEmptyExt( str );

        if( str.length() > len ) {
            len = str.length() - len;
            str = str.substring( len );
        }
        return str;
    }
    

    public static String getFillString( String sFill, int len ) {
        String sRet = "";
        if( sFill != null && !sFill.equals( "" ) ) {
            for( int i = 0; i < len; i++ ) {
                sRet += sFill;
            }
        }
        return sRet;
    }
    */

    /**
     * sSource 문자열을 len만큼 잘라서 StringList에 담아 Return한다.
     * 이때 한글이나 특수 문자가 썩여 있을 경우, 정확하게 len길이만큼 짤린다고 보장할 수 없다.
     * @param sSource String
     * @param len int
     * @return StringList
     */
    /*
    public static StringList slice( String sSource, int len ) {
        StringList slRet = new StringList();
        String sTmp = "";

        while( sSource.length() > 0 ) {
            sTmp = sSource.substring( 0, sSource.length() < len ? sSource.length() : len );
            while( sTmp.getBytes().length > len ) {
                sTmp = sTmp.substring( 0, sTmp.length() - 1 );
            }
            slRet.add( sTmp );
            sSource = sSource.substring( sTmp.length() );
        }


//      sSource.getBytes()

        return slRet;
    }
    */


    /**
     * 공백을 리턴한다.
     *
     * @return String
     */
    /*
    public static String SPACE( int iLen ) {
        return header( " ", iLen );
    }

    public static String SPACE( int iLen, String sFill ) {
        return header( sFill, iLen, sFill );
    }
    */
    public static String replaceFirst(String sSource, String sTarget, String sReplace) {
        String sRet = sSource;
        int iIdx = sSource.indexOf(sTarget);

        //2015.03.25 lss 0이면 첫자 인식 못함
        if (iIdx > -1) {
            String sTmp = sSource.substring(0, iIdx);
            sTmp += sReplace;
            sTmp += sSource.substring(iIdx + sTarget.length());
            sRet = sTmp;
        }
        return sRet;
    }

    public static boolean isNotNullString(String arg) {
        return (!isNullString(arg));
    }

    public static String replace(String original, String oldstr, String newstr) {
        if (!isNullString(original)) {
            String convert = new String();
            int dsk = 0;
            int begin = 0;
            dsk = original.indexOf(oldstr);

            if (dsk == -1)
                return original;

            while (dsk != -1) {
                convert = convert + original.substring(begin, dsk) + newstr;
                begin = dsk + oldstr.length();
                dsk = original.indexOf(oldstr, begin);
            }
            convert = convert + original.substring(begin);

            return convert;
        } else {
            return "";
        }
    }

    public static String restoreHtmlchars(String convertStr) {

        String restore = new String();
        restore = replace(convertStr, "\n", "<br>");
        return restore;
    }

    public static String getDecimalString(Object decimalObj, String decimalPattern) {

        DecimalFormat df = new DecimalFormat(decimalPattern);
        double decimalDouble = Double.parseDouble(String.valueOf(decimalObj));
        return String.valueOf(df.format(decimalDouble));
    }

    public static String getDecimalString(Object decimalObj) {
        return getDecimalString(decimalObj, "0.00");
    }

    public static synchronized String E2K(String english) {
        String korean = "";
        if (english == null) return "";
        try {
            korean = new String(english.getBytes("8859_1"), "KSC5601");
        } catch (UnsupportedEncodingException e) {
            korean = new String(english);
        }
        return korean;
    }

    public static synchronized String E2U(String english) {
        String korean = "";
        if (english == null) return "";
        try {
            korean = new String(english.getBytes("8859_1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            korean = new String(english);
        }
        return korean;
    }

    public static synchronized String U2E(String english) {
        String korean = "";
        if (english == null) return "";
        try {
            korean = new String(english.getBytes("UTF-8"), "8859_1");
        } catch (UnsupportedEncodingException e) {
            korean = new String(english);
        }
        return korean;
    }

    public static synchronized String U2K(String english) {
        String korean = "";
        if (english == null) return "";
        try {
            korean = new String(english.getBytes("UTF-8"), "EUC-KR");
        } catch (UnsupportedEncodingException e) {
            korean = new String(english);
        }
        return korean;
    }

    public static synchronized String K2E(String korean) {
        String english = "";
        if (korean == null) return "";
        try {
            english = new String(korean.getBytes("KSC5601"), "8859_1");
        } catch (UnsupportedEncodingException e) {
            english = new String(korean);
        }
        return english;
    }

    public static String arrayToString(String[] arr) {
        return arrayToStringSplit(arr, ",");
    }

    public static String arrayToStringSplit(String[] arr, String split) {
        String arrStr = "";
        StringBuffer sb = new StringBuffer();

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                // arrStr += ","+arr[i];
                sb.append(split + arr[i]);
            }
            arrStr = sb.toString();
            arrStr = arrStr.substring(1);
        }
        return arrStr;
    }

    public static boolean equals(String srcString, String[] arrayCompare) {
        boolean bResult = false;
        for (String sCompare : arrayCompare) {
            if (equals(srcString, sCompare)) {
                bResult = true;
                break;
            }
        }
        return bResult;
    }

    public static String NULL(String s) {
        String rtnS = "";
        if (s == null || "null".equalsIgnoreCase(s)) {
            rtnS = "";
        } else {
            rtnS = s.trim();
        }
        return rtnS;
    }


    public static String commaSplit(String srcStr) {
        // null check한 후 ','제거
        String s = NULL(srcStr).replaceAll(",", "");

        try {
            if (isNumeric(s)) {
                int num1 = s.length();//숫자의 길이를 구한다.
                if (num1 > 0) {
                    String src1 = s.substring(0, 1);
                    String src2 = s.substring(1);

                    // 앞에 있는 '0'을 모두 제거
                    while ("0".equals(src1) && num1 > 0) {
                        src1 = src2.substring(0, 1);
                        src2 = src2.substring(1);
                        num1 = src2.length();
                    }
                    s = src1 + src2;
                }
            } else {
                throw new Exception("Not Number");
            }

            // 3자리 마다 ,찍기
            // "."이 있는 경우에 정수부분과 소수부분 분리하기
            String strJungSu = "";
            String strSosu = "";
            if (s.indexOf(".") > -1) {
                strJungSu = s.substring(0, s.indexOf("."));
                strSosu = s.substring(s.indexOf("."));

            } else {
                strJungSu = s;
            }

            String strTemp = reverseString(strJungSu);
            String strResult = "";

            int strTempLen = strTemp.length();
            for (int i = 0; i < strTempLen; i += 3) {
                if (i + 3 < strTempLen) {
                    strResult += strTemp.substring(i, i + 3) + ",";
                } else {
                    strResult += strTemp.substring(i);
                }
            }
            s = reverseString(strResult);
            s += strSosu;

        } catch (Exception e) {
            fstLogger.debug("commaSplit ERROR >> " + e.toString());
            s = srcStr;
        }
        return s;
    }

    /*
    public static StringList splitTrim(String strSource, String strSeperator) throws Exception {
        try {
            if( strSource == null )
                return new StringList(0);

            if( strSeperator == null )
                strSeperator = ",";

            String[] strArr = split(strSource, strSeperator);

            if( strArr == null )
                return new StringList(0);

            StringList sl = new StringList(strArr.length);
            for(String str: strArr){
                sl.add(trim(str));
            }

            return sl;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    */

    public static String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    // 요구사항, Risk, Issue, Punch 오브젝트 채번로직
    public static String getProjectRelatedCode(Context context, String projectid, String middleCode, int sequencyNumCnt) throws Exception {

        String nextCode = "";
        ContextUtil.pushContext(context);
        try {

            String strCurrentMaxCode = "";
            String strLastSequecy = "1";         // 초기 Seq값은 모두 1부터 시작함
            String strProjectName = "";

            try {
                DomainObject projobj = DomainObject.newInstance(context, projectid);
                // strProjectName = projobj.getAttributeValue(context, PropertyUtil.getSchemaProperty(context, "attribute_hwProjectUniqueCode"));
                strProjectName = projobj.getInfo(context, "name");
            } catch (Exception ex) {
                strProjectName = NULL(projectid).trim();
            }

            SelectList sListObjSelStmts = new SelectList(1);
            sListObjSelStmts.add("name");

            // 22012-02-14 이슈를 채번할 때 ActionItem과 같은 sequency값을 사용하도록 수정되어 아래 추가함.
            // middleCode로 ISS가 들어오면 데이터 검색하는 조건을 "ISS,INA"로 변경
            String strNamewhere = "";
            if ("ISS".equalsIgnoreCase(middleCode)) {
                strNamewhere = strProjectName + "-" + middleCode + "-*,"
                        + strProjectName + "-INA-*";
            } else {
                strNamewhere = strProjectName + "-" + middleCode + "-*";
            }


            MapList mlObjs = DomainObject.findObjects(context,              // [String]Context
                    "*",                  // [String]Type
                    strNamewhere,         // [String]Name
                    "*",                  // [String]Rev
                    "*",                  // [String]Owner
                    "*",                  // [String]Vault
                    "",                   // [String]Where Expression
                    false,                // [boolean]expand Type
                    sListObjSelStmts      // [StringList]ObjectSelects
            );
            // System.out.println("mlObjs >>> "+mlObjs);

            if (!mlObjs.isEmpty()) {
                mlObjs.sort("name", "descending", "String");
                // System.out.println("mlObjs sort>>> "+mlObjs);

                Map map = (Map) mlObjs.get(0);
                strCurrentMaxCode = (String) map.get("name");

                strLastSequecy = strCurrentMaxCode.substring(strCurrentMaxCode.lastIndexOf("-") + 1);
                // System.out.println("strLastSequecy ....> " + strLastSequecy);

                int intSequecy = Integer.parseInt(strLastSequecy);
                intSequecy++;
                strLastSequecy = Integer.toString(intSequecy);
            }

            // 마지막 Sequency Number의 자릿수 맞추기
            int intSequecyNumCnt = strLastSequecy.length();
            while (intSequecyNumCnt < sequencyNumCnt) {
                strLastSequecy = "0" + strLastSequecy;
                intSequecyNumCnt++;
            }
            nextCode = strProjectName + "-" + middleCode + "-" + strLastSequecy;
            // System.out.println("nextCode >>>> "+nextCode);

            // 생성된 코드의 데이터가 있는지 최종 검사 후 중복이 없을 때 까지 반복
            String isExistingData = MqlUtil.mqlCommand(context, "temp query bus * '" + nextCode + "' * select name dump ");

            // 22012-02-14 이슈를 채번할 때 ActionItem과 같은 sequency값을 사용하도록 수정되어 아래 추가함.
            // middleCode로 ISS가 들어오면 데이터 검색하는 조건을 "ISS,INA"로 변경
            if ("ISS".equalsIgnoreCase(middleCode)) {
                nextCode = strProjectName + "-INA-" + strLastSequecy;
                isExistingData += MqlUtil.mqlCommand(context, "temp query bus * '" + nextCode + "' * select name dump ");
            }

            int isExistingDataSize = isExistingData.length();
            while (isExistingDataSize > 1) {
                int intSequecy = Integer.parseInt(strLastSequecy);
                intSequecy++;
                strLastSequecy = Integer.toString(intSequecy);

                intSequecyNumCnt = strLastSequecy.length();
                while (intSequecyNumCnt < sequencyNumCnt) {
                    strLastSequecy = "0" + strLastSequecy;
                    intSequecyNumCnt++;
                }
                nextCode = strProjectName + "-" + middleCode + "-" + strLastSequecy;

                isExistingData = MqlUtil.mqlCommand(context, "temp query bus * '" + nextCode + "' * select name dump ");

                // 22012-02-14 이슈를 채번할 때 ActionItem과 같은 sequency값을 사용하도록 수정되어 아래 추가함.
                // middleCode로 ISS가 들어오면 데이터 검색하는 조건을 "ISS,INA"로 변경
                if ("ISS".equalsIgnoreCase(middleCode)) {
                    nextCode = strProjectName + "-INA-" + strLastSequecy;
                    isExistingData += MqlUtil.mqlCommand(context, "temp query bus * '" + nextCode + "' * select name dump ");
                }

                isExistingDataSize = isExistingData.length();

            }
        } catch (Exception e) {
            fstLogger.debug("Error >> " + e.toString());
        } finally {
            ContextUtil.popContext(context);
        }
        return nextCode;
    }


    public static String replaceAll(String s, String s1, String s2) {
        return s.replaceAll(s1, s2);
    }

    public static boolean startsWith(String str, String prefix) {
        return startsWith(str, prefix, false);
    }

    public static boolean startsWithIgnoreCase(String str, String prefix) {
        return startsWith(str, prefix, true);
    }

    private static boolean startsWith(String str, String prefix, boolean ignoreCase) {
        if (str == null || prefix == null)
            return str == null && prefix == null;
        if (prefix.length() > str.length())
            return false;
        else
            return str.regionMatches(ignoreCase, 0, prefix, 0, prefix.length());
    }

    public static boolean containsIgnoreCase(String str, String searchStr) {
        if (str == null || searchStr == null)
            return false;
        int len = searchStr.length();
        int max = str.length() - len;
        for (int i = 0; i <= max; i++)
            if (str.regionMatches(true, i, searchStr, 0, len))
                return true;

        return false;
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {
        return str1 != null ? str1.equalsIgnoreCase(str2) : str2 == null;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean equals(String str1, String str2) {
        return str1 != null ? str1.equals(str2) : str2 == null;
    }

    public static boolean isNumeric(String str) {
        if (str == null)
            return false;
        int sz = str.length();
        for (int i = 0; i < sz; i++)
            if (!Character.isDigit(str.charAt(i)))
                return false;

        return true;
    }

    public static boolean isNumericIncludeReal(String str) {
        if (str == null) return false;

        int sz = str.length();
        for (int i = 0; i < sz; i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c) && c != '.' && c != '+' && c != '-') return false;
        }

        return true;
    }

    public static String trim(String str) {
        return str != null ? str.trim() : null;
    }

    public static String splitFirstWord(String string, String separator) {
        String result = "";
        if (isNotNullString(string))
        {
            List<String> temp = new ArrayList<>();
            String[] array = string.split(separator);
            if (array != null && array.length > 0) {
                for (String str : array) {
                    if (isNotNullString(str)) {
                        temp.add(str);
                    }
                }
            }
            if (!temp.isEmpty()) {
                result = temp.get(0);
            }
        }
        return result;
    }

    public static String[] split(String str) {
        return split(str, null, -1);
    }

    public static String[] split(String str, char separatorChar) {
        return splitWorker(str, separatorChar, false);
    }

    public static String[] split(String str, String separatorChars) {
        return splitWorker(str, separatorChars, -1, false);
    }

    public static String[] split(String str, String separatorChars, int max) {
        return splitWorker(str, separatorChars, max, false);
    }

    private static String[] splitWorker(String str, char separatorChar, boolean preserveAllTokens) {
        if (str == null)
            return null;
        int len = str.length();
        if (len == 0)
            return EMPTY_STRING_ARRAY;
        List list = new ArrayList();
        int i = 0;
        int start = 0;
        boolean match = false;
        boolean lastMatch = false;
        while (i < len)
            if (str.charAt(i) == separatorChar) {
                if (match || preserveAllTokens) {
                    list.add(str.substring(start, i));
                    match = false;
                    lastMatch = true;
                }
                start = ++i;
            } else {
                lastMatch = false;
                match = true;
                i++;
            }
        if (match || preserveAllTokens && lastMatch)
            list.add(str.substring(start, i));
        return (String[]) (String[]) list.toArray(new String[list.size()]);
    }

    public static String[] splitPreserveAllTokens(String str, String separatorChars) {
        return splitWorker(str, separatorChars, -1, true);
    }

    public static String[] splitPreserveAllTokens(String str, String separatorChars, int max) {
        return splitWorker(str, separatorChars, max, true);
    }

    private static String[] splitWorker(String str, String separatorChars, int max, boolean preserveAllTokens) {
        if (str == null)
            return null;
        int len = str.length();
        if (len == 0)
            return EMPTY_STRING_ARRAY;
        List list = new ArrayList();
        int sizePlus1 = 1;
        int i = 0;
        int start = 0;
        boolean match = false;
        boolean lastMatch = false;
        if (separatorChars == null)
            while (i < len)
                if (Character.isWhitespace(str.charAt(i))) {
                    if (match || preserveAllTokens) {
                        lastMatch = true;
                        if (sizePlus1++ == max) {
                            i = len;
                            lastMatch = false;
                        }
                        list.add(trim(str.substring(start, i)));
                        match = false;
                    }
                    start = ++i;
                } else {
                    lastMatch = false;
                    match = true;
                    i++;
                }
        else if (separatorChars.length() == 1) {
            char sep = separatorChars.charAt(0);
            while (i < len)
                if (str.charAt(i) == sep) {
                    if (match || preserveAllTokens) {
                        lastMatch = true;
                        if (sizePlus1++ == max) {
                            i = len;
                            lastMatch = false;
                        }
                        // 파일내용을 읽어 행분리시 공백문자 제거 추가.
                        list.add(trim(remove(str.substring(start, i), "\r")));
                        match = false;
                    }
                    start = ++i;
                } else {
                    lastMatch = false;
                    match = true;
                    i++;
                }
        } else {
            while (i < len)
                if (separatorChars.indexOf(str.charAt(i)) >= 0) {
                    if (match || preserveAllTokens) {
                        lastMatch = true;
                        if (sizePlus1++ == max) {
                            i = len;
                            lastMatch = false;
                        }
                        list.add(trim(str.substring(start, i)));
                        match = false;
                    }
                    start = ++i;
                } else {
                    lastMatch = false;
                    match = true;
                    i++;
                }
        }
        if (match || preserveAllTokens && lastMatch)
            list.add(trim(str.substring(start, i)));
        return (String[]) (String[]) list.toArray(new String[list.size()]);
    }

    public static String[] splitByCharacterType(String str) {
        return splitByCharacterType(str, false);
    }

    public static String[] splitByCharacterTypeCamelCase(String str) {
        return splitByCharacterType(str, true);
    }

    private static String[] splitByCharacterType(String str, boolean camelCase) {
        if (str == null)
            return null;
        if (str.length() == 0)
            return EMPTY_STRING_ARRAY;
        char c[] = str.toCharArray();
        List list = new ArrayList();
        int tokenStart = 0;
        int currentType = Character.getType(c[tokenStart]);
        for (int dsk = tokenStart + 1; dsk < c.length; dsk++) {
            int type = Character.getType(c[dsk]);
            if (type == currentType)
                continue;
            if (camelCase && type == 2 && currentType == 1) {
                int newTokenStart = dsk - 1;
                if (newTokenStart != tokenStart) {
                    list.add(new String(c, tokenStart, newTokenStart - tokenStart));
                    tokenStart = newTokenStart;
                }
            } else {
                list.add(new String(c, tokenStart, dsk - tokenStart));
                tokenStart = dsk;
            }
            currentType = type;
        }

        list.add(new String(c, tokenStart, c.length - tokenStart));
        return (String[]) (String[]) list.toArray(new String[list.size()]);
    }

    /*
    public String getI18NCheckboxAttribute(Context context, String adminType,String attValue,String sLanguage) throws Exception {
        String strCheckbox = "";
        try {
            String actualTYpe = PropertyUtil.getSchemaProperty(context, adminType);

            strCheckbox = MatrixUIUtil.displayCheckbox(context, actualTYpe, attValue, "edit", sLanguage, "");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return strCheckbox;
    }
    */


    /**
     * Description : 멀리라인 스트링을 화면출력용 스트링으로 변환
     *
     * @param str 멀티라인 스트링
     * @return 화면출력 스트링
     * @throws Exception
     * @author : jkpark
     */
    public static String getDisplayMultiLine(String str) throws Exception {
        String displayStr = str;
        displayStr = FrameworkUtil.findAndReplace(displayStr, " ", "&nbsp;");
        displayStr = FrameworkUtil.findAndReplace(displayStr, "\n", "<br />");
        displayStr = FrameworkUtil.findAndReplace(displayStr, "\t", "&nbsp;&nbsp;&nbsp;&nbsp;");

        return displayStr;
    }

    /**
     * Description : 문자열에 천단위 콤마세팅한다.
     *
     * @param n
     * @param showInteger
     * @return
     * @author : jkpark
     */
    public static String setComma(String n, boolean showInteger) {
        try {
            String showFormat = "#,##0.00";
            if (showInteger) {
                showFormat = "#,##0";
            }

            java.text.DecimalFormat df = new java.text.DecimalFormat(showFormat);
            return df.format(new Double(n).doubleValue());
        } catch (Exception e) {
            //e.printStackTrace();
            return n;
        }
    }

    //added by swkimdsk01 start
    public static String getStringForInputingByTextArea(String str) throws Exception {
        fstLogger.debug("==>dskStringUtils.getStringForInputingByTextArea()");
        String result = "";
        if (str != null) {
            char arrayChar[] = str.toCharArray();
            for (int i = 0; i < arrayChar.length; i++) {
                if (arrayChar[i] == '\n') {
                    result = result + "<br>";
                } else {
                    result = result + arrayChar[i];
                }
            }
        }
        return result;
    }
    //added by swkimdsk01 end

    /**
     * ArrayList에 있는 텍스트를 ', '로 구분해서 Strng으로 리턴한다.
     *
     * @param param
     * @return
     */
    public static String arrayListToString(ArrayList<String> param) {
        return arrayListToString(param, ",");
    }

    /**
     * ArrayList에 있는 텍스트를 splitchar로 구분해서 String으로 리턴한다.
     *
     * @param param
     * @param splitChar
     * @return
     */
    public static String arrayListToString(ArrayList<String> param, String splitChar) {
        if (param == null)
            return "";
        String[] aryText = new String[param.size()];
        if (param != null) {
            for (int i = 0; i < param.size(); i++) {
                aryText[i] = (String) param.get(i);
            }
        }

        String str = new String();

        if (aryText != null) {
            for (int i = 0; i < aryText.length; i++) {
                if (i != aryText.length - 1)
                    str += aryText[i] + splitChar;
                else
                    str += aryText[i];
            }
        }
        return str;
    }

    /**
     * StringList에 있는 텍스트를 ','로 구분해서 String으로 리턴한다.
     *
     * @param param
     * @return
     */
    public static String stringListToString(StringList param) {
        return stringListToString(param, ",");
    }

    /**
     * StringList에 있는 텍스트를 splitchar로 구분해서 String으로 리턴한다.
     *
     * @param param
     * @param splitChar
     * @return
     */
    public static String stringListToString(StringList param, String splitChar) {
        if (param == null)
            return "";
        String[] aryText = new String[param.size()];
        if (param != null) {
            for (int i = 0; i < param.size(); i++) {
                aryText[i] = (String) param.get(i);
            }
        }

        return arrayToStringSplit(aryText, "|");
    }

    public static String toJavascriptArray(String[] arr) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append("\"").append(arr[i]).append("\"");
            if (i + 1 < arr.length) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * @param str String
     * @param len int
     * @return String
     */
    public static String tail(String str, int len) {
        return tail(str, len, " ");
    }

    public static String tail(String str, int len, String sFillPre) {
        str = getFillString(sFillPre, len) + (UIUtil.isNullOrEmpty(str) ? "" : str);

        if (str.length() > len) {
            len = str.length() - len;
            str = str.substring(len);
        }
        return str;
    }

    public static String getFillString(String sFill, int len) {
        String sRet = "";
        if (sFill != null && !sFill.equals("")) {
            for (int i = 0; i < len; i++) {
                sRet += sFill;
            }
        }
        return sRet;
    }

    public static String formatFileSize(String fileSize) {
        String retStr = "";
        try {
            double dblFileSize = Double.parseDouble(fileSize);
            DecimalFormat decFormat = new DecimalFormat("0.00");
            if (dblFileSize <= 512) {
                retStr = fileSize + " B";
            } else if (dblFileSize > 512 && dblFileSize <= (1024 * 512)) {
                retStr = decFormat.format(dblFileSize / 1024) + " KB";
            } else if (dblFileSize > (1024 * 512) && dblFileSize <= (1024 * 1024 * 512)) {
                retStr = decFormat.format(dblFileSize / (1024 * 1024)) + " MB";
            } else if (dblFileSize > (1024 * 1024 * 512)) {
                retStr = decFormat.format(dblFileSize / (1024 * 1024 * 1024)) + " GB";
            } else {
                retStr = fileSize;
            }
        } catch (NumberFormatException ex) {
            retStr = fileSize;
        }
        return retStr;
    }

    /**
     * 배열에 해당 문자열이 요소로 포함되어 있는지 여부를 확인한다. (대/소문자 구분)
     *
     * @param strArray 문자열 배열
     * @param strValue 포함되어 있는지 여부를 확인할 문자열
     * @return 문자열이 포함되어 있으면 true, 그렇지 않으면 false
     * @throws
     */
    public static boolean contains(String[] strArray, String strValue) {
        if (strValue == null) {
            throw new NullPointerException("value is null");
        }

        boolean contained = false;

        if (strArray != null) {
            List<String> list = Arrays.asList(strArray);
            contained = list.contains(strValue);
        }

        return contained;
    }

    /**
     * @param s
     * @param split
     * @return
     */
    public static String arrayToString(String[] s, String split) {
        String str = new String();

        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                if (i != s.length - 1)
                    str += s[i] + split;
                else
                    str += s[i];
            }
        }

        return str.trim();
    }

    /**
     * 입력된 스트링에서 구분자(delimiter)에 나열된 모든 문자를 기준으로 문자열을 분리하고 분리된 문자열을 배열에 할당하여 반환한다.
     * <p/>
     * <pre>
     *
     * [사용 예제]
     *
     * split2Array("ABCDEABCDE", "BE")
     * ===> A
     *         CD
     *         A
     *         CD
     *
     * </pre>
     *
     * @param strTarget
     * @param delimiter
     * @return java.lang.String[]
     */
    public static String[] split2Array(String strTarget, String delimiter) {
        if (strTarget == null) return null;

        StringTokenizer st = new StringTokenizer(strTarget, delimiter);
        String[] names = new String[st.countTokens()];
        for (int i = 0; i < names.length; i++) {
            names[i] = st.nextToken().trim();
        }

        return names;
    }

    /**
     * 입력된 스트링에서 구분자(delimiter)를 하나의 단어로 인식하고 이 단어를 기준으로 문자열을 분리, 분리된 문자열을 배열에 할당하여 반환한다.
     * <p/>
     * <pre>
     *
     * [사용 예제]
     *
     * split2Array("AA-BBB--DDDD", "-",true)
     * ===>    AA
     *         BBB
     *
     *         DDDD
     *
     * split2Array("AA-BBB--DDDD", "-", false);
     * ===>    AA
     *         BBB
     *         DDDD
     *
     * split2Array("ABCDEABCDE", "BE", true)
     * ===> ABCDEABCDE
     *
     * </pre>
     *
     * @param strTarget
     * @param strDelimiter   구분자(delimiter)로 인식할 단어로서 결과 문자열에는 포함되지 않는다.
     * @param isIncludedNull 구분자로 구분된 문자열이 Null일 경우 결과값에 포함여부 ( true : 포함, false : 포함하지 않음. )
     * @return java.lang.String[]
     */
    public static String[] split2Array(String strTarget, String strDelimiter, boolean isIncludedNull) {

        int intIdx = 0;
        String[] aryResultStrArray = null;

        try {
            Vector vecTempValues = new Vector();

            String strCheck = new String(strTarget);
            while (strCheck.length() != 0) {
                int intBegin = strCheck.indexOf(strDelimiter);
                if (intBegin == -1) {
                    vecTempValues.add(strCheck);
                    break;
                } else {
                    int intEnd = intBegin + strDelimiter.length();
                    //	StringTokenizer는 구분자가 연속으로 중첩되어 있을 경우 공백 문자열을 반환하지 않음.
                    // 따라서 아래와 같이 작성함.
                    if (isIncludedNull) {
                        vecTempValues.add(strCheck.substring(0, intBegin));
                        strCheck = strCheck.substring(intEnd);
                        if (strCheck.length() == 0) {
                            vecTempValues.add(strCheck);
                            break;
                        }
                    } else {
                        if (!isEmpty(strCheck.substring(0, intBegin))) {
                            vecTempValues.add(strCheck.substring(0, intBegin));
                        }
                        strCheck = strCheck.substring(intEnd);
                    }

                }
            }

            String[] aryTempStr = new String[0];
            aryResultStrArray = (String[]) vecTempValues.toArray(aryTempStr);

        } catch (Exception e) {
            return aryResultStrArray;
        }

        return aryResultStrArray;
    }

    public static String getRandomString() {
        StringBuffer buffer = new StringBuffer();

        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            if (rnd.nextBoolean()) {
                buffer.append((char) ((int) (rnd.nextInt(26)) + 97));
            } else {
                buffer.append((rnd.nextInt(10)));
            }
        }

        return buffer.toString();
    }

    public static String arrayListToStringWithAmp(ArrayList<String> a) {
        String[] s = new String[a.size()];
        if (a != null) {
            for (int i = 0; i < a.size(); i++) {
                s[i] = (String) a.get(i);
            }
        }

        String str = new String();

        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                if (i != s.length - 1)
                    str += "'" + s[i] + "',";
                else
                    str += "'" + s[i] + "'";
            }
        }
        return str;
    }

    public static String removeTag(String html) throws Exception {
        String result = "";
        if (fstStringUtil.isNotEmptyString(html)) {
            result = html.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", "");
        }

        return result;
    }

    public static String removeFrontSlash(String txt) {
        if (fstStringUtil.defaultString(txt).indexOf("/") > -1 && fstStringUtil.defaultString(txt).substring(0, 1).equals("/")) {
            txt = txt.substring(1);
        }
        return txt;
    }

    /**
     * <p>Converts a String to a boolean (optimised for performance).</p>
     * <p/>
     * <p>{@code 'true'}, {@code 'on'} or {@code 'yes'}
     * (case insensitive) will return {@code true}. Otherwise,
     * {@code false} is returned.</p>
     * <p/>
     * <p>This method performs 4 times faster (JDK1.4) than
     * {@code Boolean.valueOf(String)}. However, this method accepts
     * 'on' and 'yes' as true values.
     * <p/>
     * <pre>
     *   BooleanUtils.toBoolean(null)    = false
     *   BooleanUtils.toBoolean("true")  = true
     *   BooleanUtils.toBoolean("TRUE")  = true
     *   BooleanUtils.toBoolean("tRUe")  = true
     *   BooleanUtils.toBoolean("on")    = true
     *   BooleanUtils.toBoolean("yes")   = true
     *   BooleanUtils.toBoolean("false") = false
     *   BooleanUtils.toBoolean("x gti") = false
     * </pre>
     *
     * @param str the String to check
     * @return the boolean value of the string, {@code false} if no match or the String is null
     */
    public static boolean isTrue(String str) {
        if (isNullString(str)) {
            return false;
        }
        return toBooleanObject(str) == Boolean.TRUE;
    }

    public static Boolean toBooleanObject(String str) {
        if (equals("true", str)) {
            return Boolean.TRUE;
        }
        if (str == null) {
            return null;
        }
        switch (str.length()) {
            case 1: {
                char ch0 = str.charAt(0);
                if (ch0 == 'y' || ch0 == 'Y' || ch0 == 't' || ch0 == 'T') {
                    return Boolean.TRUE;
                }
                if (ch0 == 'n' || ch0 == 'N' || ch0 == 'f' || ch0 == 'F') {
                    return Boolean.FALSE;
                }
                break;
            }
            case 2: {
                char ch0 = str.charAt(0);
                char ch1 = str.charAt(1);
                if ((ch0 == 'o' || ch0 == 'O') && (ch1 == 'n' || ch1 == 'N')) {
                    return Boolean.TRUE;
                }
                if ((ch0 == 'n' || ch0 == 'N') && (ch1 == 'o' || ch1 == 'O')) {
                    return Boolean.FALSE;
                }
                break;
            }
            case 3: {
                char ch0 = str.charAt(0);
                char ch1 = str.charAt(1);
                char ch2 = str.charAt(2);
                if ((ch0 == 'y' || ch0 == 'Y') && (ch1 == 'e' || ch1 == 'E') && (ch2 == 's' || ch2 == 'S')) {
                    return Boolean.TRUE;
                }
                if ((ch0 == 'o' || ch0 == 'O') && (ch1 == 'f' || ch1 == 'F') && (ch2 == 'f' || ch2 == 'F')) {
                    return Boolean.FALSE;
                }
                break;
            }
            case 4: {
                char ch0 = str.charAt(0);
                char ch1 = str.charAt(1);
                char ch2 = str.charAt(2);
                char ch3 = str.charAt(3);
                if ((ch0 == 't' || ch0 == 'T') && (ch1 == 'r' || ch1 == 'R') && (ch2 == 'u' || ch2 == 'U') && (ch3 == 'e' || ch3 == 'E')) {
                    return Boolean.TRUE;
                }
                break;
            }
            case 5: {
                char ch0 = str.charAt(0);
                char ch1 = str.charAt(1);
                char ch2 = str.charAt(2);
                char ch3 = str.charAt(3);
                char ch4 = str.charAt(4);
                if ((ch0 == 'f' || ch0 == 'F') && (ch1 == 'a' || ch1 == 'A') && (ch2 == 'l' || ch2 == 'L') && (ch3 == 's' || ch3 == 'S') && (ch4 == 'e' || ch4 == 'E')) {
                    return Boolean.FALSE;
                }
                break;
            }
        }

        return null;
    }

    public static int toInt(String string, int iDef) {
        return NumberUtils.toInt(string, iDef);
    }

    public static int toInt(String string) {
        return toInt(string, 0);
    }

    /**
     * 파일명 체크 (특수문자 제거)
     *
     * @param txt String file name
     * @return 특수문자 제거된 파일명 return
     * @throws
     */
    public static String replaceFileName(String txt) {
        String[] invalidName = {"\\\\", "/", ":", "[*]", "[?]", "\"", "<", ">", "[|]"};

        for (int i = 0; i < invalidName.length; i++)
            txt = txt.replaceAll(invalidName[i], "_"); // 언더바로 치환
        return txt;
    }

    public static String replaceFileName(String txt, String newtxt) {
        String[] invalidName = {"\\\\", "/", ":", "[*]", "[?]", "\"", "<", ">", "[|]"};

        for (int i = 0; i < invalidName.length; i++)
            txt = txt.replaceAll(invalidName[i], newtxt); // 언더바로 치환
        return txt;
    }

    public static String[] split2(String strTarget, String delimiter) {
        return split2Array(strTarget, delimiter, true);
    }
    
    public static final StringList splitStringList(String paramString1, String paramString2) {
        if (paramString1 == null) {
            return new StringList(0);
        }

        if (paramString2 == null) {
            paramString2 = "~";
        }

        StringTokenizer localStringTokenizer = new StringTokenizer(paramString1, paramString2, true);
        StringList localStringList = new StringList(localStringTokenizer.countTokens());

        Object localObject = null;

        while (localStringTokenizer.hasMoreTokens()) {
            String str = localStringTokenizer.nextToken();

            if (paramString2.equals(str)) {
                if (paramString2.equals(localObject))
                    localStringList.addElement("");
            } else {
                localStringList.addElement(str);
            }

            localObject = str;
        }

        if (paramString2.equals(localObject)) {
            localStringList.addElement("");
        }

        return localStringList;
    }

    
    /**
     * String, StringList,... 라스트만 넘겨줌
     * @param oValue
     * @return
     */
    public static String getLastIndexValue(Object oValue){
    	String sResult = "";
    	try{
    		if(oValue instanceof StringList){
    			StringList slValue = (StringList)oValue;
				String strValue = (String) slValue.get((slValue.size())-1);
				sResult = strValue;
			}else if (oValue instanceof String){
				oValue = ((String) oValue).substring( ((String) oValue).lastIndexOf("|")+1);
				sResult = (String)oValue;
			}
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
		return sResult ;
    }
}
