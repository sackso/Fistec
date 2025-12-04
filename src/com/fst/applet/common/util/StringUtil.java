package com.fst.applet.common.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.Vector;

import com.matrixone.util.Security;

import matrix.util.Mime64;
import matrix.util.StringList;

public class StringUtil {

    private static final String EMPTY =  "";

    private static final String NULL_STRING =  "";

    /*
     *  입력 문자가 null인 경우 blank 처리.
     *
     * <pre>
     *
     * [사용 예제]
     *
     * </pre>
     *
    * @param str
    * @return java.lang.String
     */
    public static String setEmpty(String str) {
        String ret = "";
        if (str != null) {
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
            if (isNullString(ret)) {
                ret = strDefaultValue;
            }
        } else {
            ret = strDefaultValue;
        }
        return ret;
    }

    /*
     *  입력된 스트링(strTarget)에서 모든 space를 제거하여 Return한다.
     *
     * <pre>
     *
     * [사용 예제]
     *
     * </pre>
     *
    * @param strTarget
    * @return java.lang.String
     */
    public static String removeBlank(String strTarget) {
        String resultStr = "";
        int index = 0;

        for (int strLen = strTarget.length(); index < strLen; index++) {
            if (strTarget.charAt(index) != ' ' && strTarget.charAt(index) != '　') resultStr += strTarget.charAt(index);
        }

        return resultStr;
    }

    /**
     * <p>Deletes all whitespaces from a String as defined by
     * {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.deleteWhitespace(null)         = null
     * StringUtils.deleteWhitespace("")           = ""
     * StringUtils.deleteWhitespace("abc")        = "abc"
     * StringUtils.deleteWhitespace("   ab  c  ") = "abc"
     * </pre>
     *
     * @param str  the String to delete whitespace from, may be null
     * @return the String without whitespaces, {@code null} if null String input
     */
    public static String deleteWhitespace(final String str) {
        if (isNullString(str)) {
            return str;
        }
        final int sz = str.length();
        final char[] chs = new char[sz];
        int count = 0;
        for (int i = 0; i < sz; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                chs[count++] = str.charAt(i);
            }
        }
        if (count == sz) {
            return str;
        }
        return new String(chs, 0, count);
    }

    /**
     * <p>Joins the elements of the provided {@code Iterator} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list. Null objects or empty
     * strings within the iteration are represented by empty strings.</p>
     *
     * <p>See the examples here: {@link #join(Object[],char)}. </p>
     *
     * @param iterator  the {@code Iterator} of values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null iterator input
     * @since 2.0
     */
    public static String join(final Iterator<?> iterator, final char separator) {

        // handle null, zero and one elements before building a buffer
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return EMPTY;
        }
        final Object first = iterator.next();
        if (!iterator.hasNext()) {
            return first == null ? "" : String.valueOf(first);
        }

        // two or more elements
        final StringBuilder buf = new StringBuilder(256); // Java default is 16, probably too small
        if (first != null) {
            buf.append(first);
        }

        while (iterator.hasNext()) {
            buf.append(separator);
            final Object obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            }
        }

        return buf.toString();
    }

    /**
     * <p>Joins the elements of the provided {@code Iterator} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").</p>
     *
     * <p>See the examples here: {@link #join(Object[],String)}. </p>
     *
     * @param iterator  the {@code Iterator} of values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null iterator input
     */
    public static String join(final Iterator<?> iterator, final String separator) {

        // handle null, zero and one elements before building a buffer
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return EMPTY;
        }
        final Object first = iterator.next();
        if (!iterator.hasNext()) {
            return first == null ? "" : String.valueOf(first);
        }

        // two or more elements
        final StringBuilder buf = new StringBuilder(256); // Java default is 16, probably too small
        if (first != null) {
            buf.append(first);
        }

        while (iterator.hasNext()) {
            if (separator != null) {
                buf.append(separator);
            }
            final Object obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            }
        }
        return buf.toString();
    }

    /**
     * <p>Joins the elements of the provided {@code Iterable} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list. Null objects or empty
     * strings within the iteration are represented by empty strings.</p>
     *
     * <p>See the examples here: {@link #join(Object[],char)}. </p>
     *
     * @param iterable  the {@code Iterable} providing the values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null iterator input
     * @since 2.3
     */
    public static String join(final Iterable<?> iterable, final char separator) {
        if (iterable == null) {
            return null;
        }
        return join(iterable.iterator(), separator);
    }

    /**
     * <p>Joins the elements of the provided {@code Iterable} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").</p>
     *
     * <p>See the examples here: {@link #join(Object[],String)}. </p>
     *
     * @param iterable  the {@code Iterable} providing the values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null iterator input
     * @since 2.3
     */
    public static String join(final Iterable<?> iterable, final String separator) {
        if (iterable == null) {
            return null;
        }
        return join(iterable.iterator(), separator);
    }

    /**
     * 전달받은 Object Array를 String으로 변환하여 return한다.
     *
     * @param objArr Object []
     * @return java.lang.String
     */
    public static String convertArrayToString(Object[] objArr) {
        if (objArr == null)
            return "null";
        String ret = "";
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0)
                ret += ",";
            ret += objArr[i];
        }
        return ret;
    }

    /**
     * 입력된 스트링(strTarget)에서 임의의 위치(index)에 지정문자열(strInsert)을 추가한 문자열을 반환한다.
     * <p/>
     * <pre>
     *
     * [사용 예제]
     *
     * insert("abcdefg",0,"11")		===> 11abcdefg
     * insert("abcdefg",3,"11")		===> abc11defg
     * insert("abcdefg",-1,"11")	===> abcde11fg
     * </pre>
     *
     * @param strTarget
     * @param index     지정문자열을 추가할 위치, 대상문자열의 첫문자 위치는 0 부터 시작
     *                  if ( index < 0 ) then 대상문자열의 끝자리를 0으로 시작한 상대적 위치
     * @param strInsert
     * @return java.lang.String
     */
    public static String insert(String strTarget, int index, String strInsert) {
        String result = null;
        try {
            StringBuffer strBuf = new StringBuffer();
            String tempString = null;
            int lengthSize = strTarget.length();
            if (index >= 0) {
                if (lengthSize < index) {
                    index = lengthSize;
                }
                strBuf.append(strTarget.substring(0, index));
                strBuf.append(strInsert);
                strBuf.append(strTarget.substring(index));

            } else {
                if (lengthSize < Math.abs(index)) {
                    index = lengthSize * (-1);
                }
                tempString = strTarget.substring((lengthSize - 1) + index);
                strBuf.append(strTarget.substring(0, (lengthSize - 1) + index));
                strBuf.append(strInsert);
                strBuf.append(tempString);
            }
            result = strBuf.toString();
        } catch (Exception e) {
            return null;
        }
        return result;
    }

    /**
     * 입력된 스트링(strTarget)에서 임의의 위치(index)에 지정문자열(strReplace)로 대체한 문자열을 반환한다.
     * <p/>
     * <pre>
     *
     * [사용 예제]
     *
     * replace("abcdefg",0,"11")		===> 11cdefg
     * replace("abcdefg",-1,"11") 	===> abcde11
     *
     * </pre>
     *
     * @param strTarget
     * @param index      지정문자열을 추가할 위치, 대상문자열의 첫문자 위치는 0 부터 시작
     *                   if ( index < 0 ) then 대상문자열의 끝자리를 0으로 시작한 상대적 위치
     * @param strReplace
     * @return java.lang.String
     */
    public static String replace(String strTarget, int index, String strReplace) {

        if (strTarget == null) {
            return strTarget;
        }

        String result = null;
        try {
            StringBuffer strBuf = new StringBuffer();
            int lengthSize = strTarget.length();
            if (index >= 0) {
                if (lengthSize < index) {
                    index = lengthSize;
                }
                strBuf.append(strTarget.substring(0, index));
                strBuf.append(strReplace);
                strBuf.append(strTarget.substring(index + strReplace.length()));
            } else {
                if (lengthSize < Math.abs(index)) {
                    index = lengthSize * (-1);
                }
                strBuf.append(strTarget.substring(0, (lengthSize - 1) + index));
                strBuf.append(strReplace);
                strBuf.append(
                        strTarget.substring((lengthSize - 1) + index + strReplace.length()));
            }
            result = strBuf.toString();
        } catch (Exception e) {
            return null;
        }
        return result;
    }

    /**
     * 입력된 스트링(strTarget)에서 특정문자열(from)을 찾아 지정문자열(strReplace)로 대체한 문자열을 반환한다.
     * <p/>
     * <pre>
     *
     * [사용 예제]
     *
     * replace("abcdefgcd", "cd", "xx")	===> abxxefgxx
     * replace("abcdefgcd","cd","")			===> abefg
     *
     * </pre>
     *
     * @param strTarget
     * @param from
     * @param strReplace
     * @return java.lang.String
     */
    public static String replace(String strTarget, String from, String strReplace) {

        if (strTarget == null || from == null || strReplace == null) {
            return strTarget;
        }

        try {
            int i = strTarget.indexOf(from);
            int start = 0;
            while (i >= 0) {
                String h = strTarget.substring(0, i);
                String t = strTarget.substring(h.length() + from.length());
                strTarget = h + strReplace + t;
                start = h.length() + strReplace.length();
                i = strTarget.indexOf(from, start);
            }
            return strTarget;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 입력된 스트링(strTarget)에서 지정문자열(strSearch)이 검색된 횟수를 반환한다.
     * <p/>
     * <pre>
     *
     * [사용 예제]
     *
     * search("abcdefd","d")		===> 2
     * search("abc1def2d","12")	===> 0
     * </pre>
     *
     * @param strTarget
     * @param strSearch
     * @return 지정문자열이 검색되었으면 검색된 횟수를, 검색되지 않았으면 0 을 반환한다.
     */
    public static int search(String strTarget, String strSearch) {
        int result = 0;
        try {
            String strCheck = new String(strTarget);
            for (int i = 0; i < strTarget.length(); ) {
                int loc = strCheck.indexOf(strSearch);
                if (loc == -1) {
                    break;
                } else {
                    result++;
                    i = loc + strSearch.length();
                    strCheck = strCheck.substring(i);
                }
            }
        } catch (Exception e) {
            return 0;
        }
        return result;
    }

    /**
     * 입력된 스트링에서 cutLength 만큼 글자를 잘라준다.
     * <p/>
     * <pre>
     *
     * [사용 예제]
     *
     * shortCutString("하나둘셋넷",6)			===> 하나둘
     * shortCutString("abcdefghijklmn",6)	===> abcdef
     *
     * </pre>
     *
     * @param strTarget
     * @param cutLength
     * @return java.lang.String
     */
    public static String shortCutString(String strTarget, int cutLength) {
        try {
            //if (strTarget == null || limit < 4)
            if (strTarget == null)
                return strTarget;
            int len = strTarget.length();
            int cnt = 0, index = 0;
            while (index < len && cnt < cutLength) {
                if (strTarget.charAt(index++) < 256) // 1바이트 문자라면...
                    cnt++; // 길이 1 증가
                else // 2바이트 문자라면...
                    cnt += 2; // 길이 2 증가
                //	<gnoopy> 왜냐하면 자바의 String에서 모든 문자는 2byte처리하기 때문에.
            }
            if (index < len)
                strTarget = strTarget.substring(0, index);
        } catch (Exception e) {
            return null;
        }
        return strTarget;
    }

    /**
     * 입력된 스트링에서 제거할 문자(elimination)에 나열한 모든 문자를 제거한다.
     * <p/>
     * <pre>
     *
     * [사용 예제]
     *
     * split("02)2344-5555", "-# /)(:;")	===> 0223445555
     * split("ABCDEABCDE", "BE")		===> ACDACD
     *
     * </pre>
     *
     * @param strTarget
     * @param elimination
     * @return java.lang.String
     */
    public static String split(String strTarget, String elimination) {
        if (strTarget == null || strTarget.length() == 0 || elimination == null)
            return strTarget;
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(strTarget, elimination);
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
        }
        return sb.toString();
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
     * ===> AA
     *         BBB
     *
     *         DDDD
     *
     * split2Array("AA-BBB--DDDD", "-", false);
     * ===> AA
     *         BBB
     *         DDDD
     *
     * split2Array("ABCDEABCDE", "BE", true)
     * ===> ABCDEABCDE
     *
     * </pre>
     *
     * @param strTarget
     * @param delimiter      구분자(delimiter)로 인식할 단어로서 결과 문자열에는 포함되지 않는다.
     * @param isIncludedNull 구분자로 구분된 문자열이 Null일 경우 결과값에 포함여부 ( true : 포함, false : 포함하지 않음. )
     * @return java.lang.String[]
     */
    public static String[] split2Array(String strTarget, String delimiter, boolean isIncludedNull) {

        int index = 0;
        String[] resultStrArray = null;

        try {
            Vector v = new Vector();

            String strCheck = new String(strTarget);
            while (strCheck.length() != 0) {
                int begin = strCheck.indexOf(delimiter);
                if (begin == -1) {
                    v.add(strCheck);
                    break;
                } else {
                    int end = begin + delimiter.length();
                    //	StringTokenizer는 구분자가 연속으로 중첩되어 있을 경우 공백 문자열을 반환하지 않음.
                    // 따라서 아래와 같이 작성함.
                    if (isIncludedNull) {
                        v.add(strCheck.substring(0, begin));
                        strCheck = strCheck.substring(end);
                        if (strCheck.length() == 0) {
                            v.add(strCheck);
                            break;
                        }
                    } else {
                        if (!CommonUtil.isEmpty(strCheck.substring(0, begin))) {
                            v.add(strCheck.substring(0, begin));
                        }
                        strCheck = strCheck.substring(end);
                    }

                }
            }

            String[] tempString = new String[0];
            resultStrArray = (String[]) v.toArray(tempString);

        } catch (Exception e) {
            return resultStrArray;
        }

        return resultStrArray;
    }

    public static String[] split2(String strTarget, String delimiter) {
        return split2Array(strTarget, delimiter, true);
    }

    /**
     * 입력한 문자열 앞뒤에  특정문자를 Left Padding한 문자열을 반환한다.
     * <p/>
     * <pre>
     *
     * [사용 예제]
     *
     * lpadding("AAAAAA", 'Z', 4) )	===> ZZZZAAAAAA
     *
     * </pre>
     *
     * @param value
     * @param padValue
     * @param length
     * @param value
     * @return java.lang.String
     */
    public static String lpadding(String value, char padValue, int length) {

        if (value == null) value = "";

        byte[] orgByte = value.getBytes();
        int orglength = orgByte.length;

        if (orglength < length) //add Padding character
        {
            byte[] paddedBytes = new byte[length];

            int padlength = length - orglength;

            for (int i = 0; i < padlength; i++) {
                paddedBytes[i] = (byte) padValue;
            }

            System.arraycopy(orgByte, 0, paddedBytes, padlength, orglength);

            return new String(paddedBytes);
        } else if (orglength > length) //주어진 길이보다 남는다면, 주어진 길이만큼만 잘른다.
        {
            byte[] paddedBytes = new byte[length];
            System.arraycopy(orgByte, 0, paddedBytes, 0, length);
            return new String(paddedBytes);
        }

        return new String(orgByte);
    }

    /**
     * 입력한 문자열 앞뒤에  특정문자를 Right Pading한 문자열을 반환한다.
     * <p/>
     * <pre>
     *
     * [사용 예제]
     *
     * rpadding("AAAAAA", 'Z', 4) )	===> AAAAAAZZZZ
     *
     * </pre>
     *
     * @param value
     * @param padValue
     * @param length
     * @param value
     * @return java.lang.String
     */
    public static String rpadding(String value, char padValue, int length) {

        if (value == null) value = "";

        byte[] orgByte = value.getBytes();
        int orglength = orgByte.length;

        if (orglength < length) //add Padding character
        {
            byte[] paddedBytes = new byte[length];

            System.arraycopy(orgByte, 0, paddedBytes, 0, orglength);
            while (orglength < length) {
                paddedBytes[orglength++] = (byte) padValue;
            }
            return new String(paddedBytes);
        } else if (orglength > length) //주어진 길이보다 남는다면, 주어진 길이만큼만 잘른다
        {
            byte[] paddedBytes = new byte[length];
            System.arraycopy(orgByte, 0, paddedBytes, 0, length);
            return new String(paddedBytes);
        }

        return new String(orgByte);
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
     * <p>Checks if a CharSequence is empty ("") or null.</p>
     *
     * <pre>
     * StringUtils.isEmpty(null)      = true
     * StringUtils.isEmpty("")        = true
     * StringUtils.isEmpty(" ")       = false
     * StringUtils.isEmpty("bob")     = false
     * StringUtils.isEmpty("  bob  ") = false
     * </pre>
     *
     * <p>NOTE: This method changed in Lang version 2.0.
     * It no longer trims the CharSequence.
     * That functionality is available in isBlank().</p>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is empty or null
     * @since 3.0 Changed signature from isEmpty(String) to isEmpty(CharSequence)
     */
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * String 타입에 값이 존재 하는지 체크 (!null, !"", !"null")<br>
     *
     * @param arg 체크할 String 타입 변수
     * @return String 타입에 값이 존재시 true, 아니면 false
     */
    public static boolean isNotNullAndNotEmpty(String arg) {
        return !isNullString(arg);
    }

    public static String removeDoubleQuotation(String repText) {
        if (repText != null && !"".equals(repText)) {
            if (repText.substring(0, 1).equals("\"")) {
                repText = repText.substring(1);
            }
            if (repText.substring(repText.length() - 1).equals("\"")) {
                repText = repText.substring(0, repText.length() - 1);
            }
        }
        return repText;
    }

    public static final StringList splitStringList(String paramString1, String paramString2) {
        if (paramString1 == null) {
            return new StringList(0);
        }

        if (paramString2 == null) {
            paramString2 = "~";
        }

        StringTokenizer localStringTokenizer = new StringTokenizer(
                paramString1, paramString2, true);
        StringList localStringList = new StringList(
                localStringTokenizer.countTokens());

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
     * <p>Compares two CharSequences, returning {@code true} if they represent
     * equal sequences of characters.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.equals(null, null)   = true
     * StringUtils.equals(null, "abc")  = false
     * StringUtils.equals("abc", null)  = false
     * StringUtils.equals("abc", "abc") = true
     * StringUtils.equals("abc", "ABC") = false
     * </pre>
     *
     * @see Object#equals(Object)
     * @param cs1  the first CharSequence, may be {@code null}
     * @param cs2  the second CharSequence, may be {@code null}
     * @return {@code true} if the CharSequences are equal (case-sensitive), or both {@code null}
     * @since 3.0 Changed signature from equals(String, String) to equals(CharSequence, CharSequence)
     */
    public static boolean equals(final CharSequence cs1, final CharSequence cs2) {
        if (cs1 == cs2) {
            return true;
        }
        if (cs1 == null || cs2 == null) {
            return false;
        }
        if (cs1 instanceof String && cs2 instanceof String) {
            return cs1.equals(cs2);
        }
        return regionMatches(cs1, false, 0, cs2, 0, Math.max(cs1.length(), cs2.length()));
    }

    /**
     * <p>Checks if CharSequence contains a search character, handling {@code null}.
     * This method uses {@link String#indexOf(int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.contains(null, *)    = false
     * StringUtils.contains("", *)      = false
     * StringUtils.contains("abc", 'a') = true
     * StringUtils.contains("abc", 'z') = false
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @return true if the CharSequence contains the search character,
     *  false if not or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from contains(String, int) to contains(CharSequence, int)
     */
    public static boolean contains(final CharSequence seq, final int searchChar) {
        if (isEmpty(seq) || equals(NULL_STRING, seq)) {
            return false;
        }
        return indexOf(seq, searchChar, 0) >= 0;
    }

    /**
     * <p>Checks if CharSequence contains a search CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.contains(null, *)     = false
     * StringUtils.contains(*, null)     = false
     * StringUtils.contains("", "")      = true
     * StringUtils.contains("abc", "")   = true
     * StringUtils.contains("abc", "a")  = true
     * StringUtils.contains("abc", "z")  = false
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @return true if the CharSequence contains the search CharSequence,
     *  false if not or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from contains(String, String) to contains(CharSequence, CharSequence)
     */
    public static boolean contains(final CharSequence seq, final CharSequence searchSeq) {
        if (seq == null || searchSeq == null) {
            return false;
        }
        return indexOf(seq, searchSeq, 0) >= 0;
    }

    /**
     * <p>Check if a CharSequence starts with a specified prefix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.startsWith(null, null)      = true
     * StringUtils.startsWith(null, "abc")     = false
     * StringUtils.startsWith("abcdef", null)  = false
     * StringUtils.startsWith("abcdef", "abc") = true
     * StringUtils.startsWith("ABCDEF", "abc") = false
     * </pre>
     *
     * @see String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @return {@code true} if the CharSequence starts with the prefix, case sensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from startsWith(String, String) to startsWith(CharSequence, CharSequence)
     */
    public static boolean startsWith(final CharSequence str, final CharSequence prefix) {
        return startsWith(str, prefix, false);
    }

    /**
     * <p>Check if a CharSequence starts with a specified prefix (optionally case insensitive).</p>
     *
     * @see String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @param ignoreCase indicates whether the compare should ignore case
     *  (case insensitive) or not.
     * @return {@code true} if the CharSequence starts with the prefix or
     *  both {@code null}
     */
    private static boolean startsWith(final CharSequence str, final CharSequence prefix, final boolean ignoreCase) {
        if (str == null || prefix == null) {
            return str == null && prefix == null;
        }
        if (prefix.length() > str.length()) {
            return false;
        }
        return regionMatches(str, ignoreCase, 0, prefix, 0, prefix.length());
    }

    public static String defaultEmptyString(String str) {
        return defaultEmptyString(str, "");
    }

    public static String defaultEmptyString(String str, String defaultStr) {
        if (isNullString(str))
            return defaultStr;
        else
            return str;
    }

    /**
     * Green implementation of regionMatches.
     *
     * @param cs the {@code CharSequence} to be processed
     * @param ignoreCase whether or not to be case insensitive
     * @param thisStart the index to start on the {@code cs} CharSequence
     * @param substring the {@code CharSequence} to be looked for
     * @param start the index to start on the {@code substring} CharSequence
     * @param length character length of the region
     * @return whether the region matched
     */
    static boolean regionMatches(final CharSequence cs, final boolean ignoreCase, final int thisStart,
                                 final CharSequence substring, final int start, final int length)    {
        if (cs instanceof String && substring instanceof String) {
            return ((String) cs).regionMatches(ignoreCase, thisStart, (String) substring, start, length);
        } else {
            int index1 = thisStart;
            int index2 = start;
            int tmpLen = length;

            while (tmpLen-- > 0) {
                char c1 = cs.charAt(index1++);
                char c2 = substring.charAt(index2++);

                if (c1 == c2) {
                    continue;
                }

                if (!ignoreCase) {
                    return false;
                }

                // The same check as in String.regionMatches():
                if (Character.toUpperCase(c1) != Character.toUpperCase(c2)
                        && Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                    return false;
                }
            }

            return true;
        }
    }

    /**
     * <p>Finds the first index in the {@code CharSequence} that matches the
     * specified character.</p>
     *
     * @param cs  the {@code CharSequence} to be processed, not null
     * @param searchChar  the char to be searched for
     * @param start  the start index, negative starts at the string start
     * @return the index where the search char was found, -1 if not found
     */
    static int indexOf(final CharSequence cs, final int searchChar, int start) {
        if (cs instanceof String) {
            return ((String) cs).indexOf(searchChar, start);
        } else {
            final int sz = cs.length();
            if (start < 0) {
                start = 0;
            }
            for (int i = start; i < sz; i++) {
                if (cs.charAt(i) == searchChar) {
                    return i;
                }
            }
            return -1;
        }
    }

    /**
     * Used by the indexOf(CharSequence methods) as a green implementation of indexOf.
     *
     * @param cs the {@code CharSequence} to be processed
     * @param searchChar the {@code CharSequence} to be searched for
     * @param start the start index
     * @return the index where the search sequence was found
     */
    static int indexOf(final CharSequence cs, final CharSequence searchChar, final int start) {
        return cs.toString().indexOf(searchChar.toString(), start);
    }

    /**
     * <p>Converts a String to upper case as per {@link String#toUpperCase()}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.upperCase(null)  = null
     * StringUtils.upperCase("")    = ""
     * StringUtils.upperCase("aBc") = "ABC"
     * </pre>
     *
     * <p><strong>Note:</strong> As described in the documentation for {@link String#toUpperCase()},
     * the result of this method is affected by the current locale.
     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}
     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).</p>
     *
     * @param str  the String to upper case, may be null
     * @return the upper cased String, {@code null} if null String input
     */
    public static String upperCase(final String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    // Trim
    //-----------------------------------------------------------------------
    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String, handling {@code null} by returning
     * {@code null}.</p>
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #strip(String)}.</p>
     *
     * <p>To trim your choice of characters, use the
     * {@link #strip(String, String)} methods.</p>
     *
     * <pre>
     * StringUtils.trim(null)          = null
     * StringUtils.trim("")            = ""
     * StringUtils.trim("     ")       = ""
     * StringUtils.trim("abc")         = "abc"
     * StringUtils.trim("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed string, {@code null} if null String input
     */
    public static String trim(final String str) {
        return str == null ? null : str.trim();
    }

    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String returning an empty String ("") if the String
     * is empty ("") after the trim or if it is {@code null}.
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #stripToEmpty(String)}.</p>
     *
     * <pre>
     * StringUtils.trimToEmpty(null)          = ""
     * StringUtils.trimToEmpty("")            = ""
     * StringUtils.trimToEmpty("     ")       = ""
     * StringUtils.trimToEmpty("abc")         = "abc"
     * StringUtils.trimToEmpty("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed String, or an empty String if {@code null} input
     * @since 2.0
     */
    public static String trimToEmpty(final String str) {
        return str == null ? EMPTY : str.trim();
    }

    public static String[] trim(final String... strings) {
        if (strings != null && strings.length > 0) {
            String[] array = new String[strings.length];
            int i = 0;
            for (String str : strings) {
                array[i++] = trimToEmpty(str);
            }
            return array;
        } else {
            return null;
        }
    }

    public static String decrypt(String string) throws IOException {
        return new String(Security.deCrypt(Mime64.decode(string)));
    }
    
    /***
     * String 배열 내용중 Vertical bar에 Index를 넘긴다
     * @param sValues
     * @return
     */
    public static ArrayList<String> getStringVerticalbarIndexValue(String[] sValues, int IndexValue){
    	ArrayList<String> sResult = new ArrayList<String>();
    	try{
    		for(String sValue: sValues){
    			String[] sTemps = split2(sValue, "|");
    			sResult.add(sTemps[IndexValue]);
    		}
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    	return sResult;
    }
    
    /***
     * String 배열 내용중 Vertical bar에 라스트를 넘긴다
     * @param sValues
     * @return
     */
    public static ArrayList<String> getStringVerticalbarLastValue(String[] sValues){
    	ArrayList<String> sResult = new ArrayList<String>();
    	try{
    		for(String sValue: sValues){
    			sResult.add(getStringVerticalbarLastValue(sValue));
    		}
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    	return sResult;
    }
    
    /***
     * String 배열 내용중 Vertical bar에 라스트를 넘긴다
     * @param sValue
     * @return
     */
    public static String getStringVerticalbarLastValue(String sValue){
    	String sResult = sValue;
    	try{
    		sResult = sValue.substring( sValue.lastIndexOf("|")+1);
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    	return sResult;
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
    
    /**
     * @param str String
     * @param len int
     * @return String
     */
    public static String tail(String str, int len) {
        return tail(str, len, " ");
    }

    public static String tail(String str, int len, String sFillPre) {
        str = getFillString(sFillPre, len) + (StringUtil.isNullString(str) ? "" : str);

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

}
