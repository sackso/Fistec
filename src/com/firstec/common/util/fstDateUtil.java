package com.firstec.common.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import com.firstec.constants.FSTConstants;
import com.matrixone.apps.common.WorkCalendar;
import com.matrixone.apps.domain.util.eMatrixDateFormat;
import com.matrixone.apps.framework.ui.UIUtil;

import matrix.db.BusinessObject;
import matrix.db.Context;
import matrix.db.JPO;

public class fstDateUtil {

	// ////////////////////////////////////////////////////////////////////////////////////////////////
	// yyyy-MM-dd HH:mm:ss
	// ////////////////////////////////////////////////////////////////////////////////////////////////

	public static final String DATE_EMATRIX_FORMAT = "yyyy. M. d";

	public static final String DATE_FORMAT = "MM/dd/yyyy";
	public static final String DATETIME_FORMAT = "MM/dd/yyyy hh:mm:ss";
	public static final String DATETIME_FORMAT_24 = "MM/dd/yyyy HH:mm:ss";
	public static final String DATETIME_FORMAT_A = "MM/dd/yyyy hh:mm:ss a";

	public static final String DATE_FORMAT_DASH = "yyyy-MM-dd";
	public static final String DATETIME_FORMAT_DASH = "yyyy-MM-dd hh:mm:ss";
	public static final String DATETIME_FORMAT_DASH_24 = "yyyy-MM-dd HH:mm:ss";
	public static final String DATETIME_FORMAT_DASH_A = "yyyy-MM-dd hh:mm:ss a";

	public static void main(String[] args) {
		try {
			int days = getDayBetweenDays("2015-03-02", "2014-02-12");
			DecimalFormat df = new DecimalFormat("#,##0.0");
			Double mh = days / 30.5;
			System.out.println(days);
			System.out.println(mh);
			System.out.println(df.format(mh));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 현재 날짜에서 지정한 수만큼 더한 날짜를 리턴한다. (예 : 2014. 8. 13)
	 * 
	 * @param intDeleteDay 더한 날짜 수
	 * @return
	 */
	public static String getAddDay(int intAddDay) {

		String month, day;
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		cal.add(Calendar.DATE, intAddDay);
		StringBuffer buf = new StringBuffer();
		buf.append(Integer.toString(cal.get(Calendar.YEAR)));
		buf.append(". ");
		month = Integer.toString(cal.get(Calendar.MONTH) + 1);
		day = Integer.toString(cal.get(Calendar.DATE));
		buf.append(month);
		buf.append(". ");
		buf.append(day);
		return buf.toString();

	}

	public static String getAddDay(String date, int intAddDay) throws Exception {

		String month, day;
		String dateFormat = "yyyy. M. d";
		SimpleDateFormat sd = new SimpleDateFormat(dateFormat, Locale.US);
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		cal.setTime(sd.parse(date));
		cal.add(Calendar.DATE, intAddDay);
		StringBuffer buf = new StringBuffer();
		buf.append(Integer.toString(cal.get(Calendar.YEAR)));
		buf.append(". ");
		month = Integer.toString(cal.get(Calendar.MONTH) + 1);
		day = Integer.toString(cal.get(Calendar.DATE));
		buf.append(month);
		buf.append(". ");
		buf.append(day);
		return buf.toString();

	}

	/**
	 * 현재 날짜를 리턴한다. (예 : 2014. 8. 13)
	 * 
	 * @return
	 */
	public static String getCurrentDate() {
		String month, day;
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		StringBuffer buf = new StringBuffer();
		buf.append(Integer.toString(cal.get(Calendar.YEAR)));
		buf.append(". ");
		month = Integer.toString(cal.get(Calendar.MONTH) + 1);
		day = Integer.toString(cal.get(Calendar.DATE));
		buf.append(month);
		buf.append(". ");
		buf.append(day);
		return buf.toString();
	}

	/**
	 * 현재 날짜를 리턴한다. (예 : 2014. 8. 13)
	 * 
	 * @return
	 */
	public static String getCurrentDateTime() {
		String month, day, hh, mm, ss;
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		Date date = cal.getTime();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmss");

		String nowDateTime = dateformat.format(date);
		return nowDateTime;
	}

	public static String getCurrentEMatrixDate() {
		SimpleDateFormat sdformat = new SimpleDateFormat(eMatrixDateFormat.getEMatrixDateFormat(), Locale.US);
		Date today = new Date();
		try {
			Calendar calToday = Calendar.getInstance();
			// calToday.set(Calendar.HOUR_OF_DAY, 0);
			// calToday.set(Calendar.MINUTE, 0);
			// calToday.set(Calendar.SECOND, 0);
			// calToday.set(Calendar.MILLISECOND, 0);
			today = calToday.getTime();
		} catch (Exception ex) {
		}

		return sdformat.format(today).trim();
	}

	/**
	 * 입력받은 날짜를 MatrixDateFormat으로 변경한다.
	 * 
	 * @param context
	 * @param date
	 * @param dateFormat
	 * @return
	 * @throws Exception
	 */
	public static String convertInputDateToMatrix(Context context, String date) throws Exception {
		String strDate = "";
		String dateFormat = "yyyy. M. d";
		Date d;
		SimpleDateFormat sd;

		try {
			// if date is null, return empty
			if (date != null && !"".equals(date)) {
				try {
					sd = new SimpleDateFormat(dateFormat, Locale.US);
					d = sd.parse(date);
				} catch (Exception e) {
					try
					{
						sd = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
						d = sd.parse(date);
					}
					catch(Exception ex)
					{
						sd = new SimpleDateFormat("yyyyMMdd", Locale.US);
						d = sd.parse(date);
					}
				}

				String eMatrixFormat = eMatrixDateFormat.getEMatrixDateFormat();
				sd.applyPattern(eMatrixFormat);
				strDate = sd.format(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return strDate;
	}
	
	/**
	 * 입력받은 날짜를 MatrixDateFormat으로 변경한다.
	 * (ex : 'MM/dd/yyyy hh:mm:ss a')
	 * 
	 * @param context
	 * @param date
	 * @param dateFormat
	 * @return
	 * @throws Exception
	 */
	public static String convertInputDateToManualMatrix(Context context, String date, String sMatrixFormat) throws Exception {
		String strDate = "";
		String dateFormat = "yyyy. M. d";
		Date d;
		SimpleDateFormat sd;

		try {
			// if date is null, return empty
			if (date != null && !"".equals(date)) {
				try {
					sd = new SimpleDateFormat(dateFormat, Locale.US);
					d = sd.parse(date);
				} catch (Exception e) {
					try {
						sd = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
						d = sd.parse(date);
					} catch(Exception ex) {
						sd = new SimpleDateFormat("yyyyMMdd", Locale.US);
						d = sd.parse(date);
					}
				}

				if(UIUtil.isNullOrEmpty(sMatrixFormat)){
					sMatrixFormat = "MM/dd/yyyy hh:mm:ss a";
				}
				sd.applyPattern(sMatrixFormat);
				strDate = sd.format(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return strDate;
	}
	
	/***
	 * from 검색시 입력받은 날짜를 Matrix 포멧으로 변경 한다.
	 * @param context
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static String convertInputDateToMatrixFrom(Context context, String date) throws Exception {
		String strDate = "";
		
		if(UIUtil.isNotNullAndNotEmpty(date)){
			strDate = convertInputDateToManualMatrix(context, date, DATE_FORMAT);
			if(UIUtil.isNotNullAndNotEmpty(strDate)){
				strDate += " 00:00:00";
			}
		}
		return strDate;
	}
	
	/***
	 * to 검색시 입력받은 날짜를 Matrix 포멧으로 변경 한다.
	 * @param context
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static String convertInputDateToMatrixTo(Context context, String date) throws Exception {
		String strDate = "";
		
		if(UIUtil.isNotNullAndNotEmpty(date)){
			strDate = convertInputDateToManualMatrix(context, date, DATE_FORMAT);
			if(UIUtil.isNotNullAndNotEmpty(strDate)){
				strDate += " 23:59:59";
			}
		}
		return strDate;
	}

	/**
	 * 입력된 Date를 Calendar Date로 변환
	 * 
	 * @param context
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static String convertInputDateToCalendarDate(Context context, String date) throws Exception {
		String calendarDate = "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy. M. d", Locale.US);
		try {
			if (fstStringUtil.isNotEmptyString(date)) {
				Date dateInput = new java.util.Date(date);
				calendarDate = formatter.format(dateInput);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return calendarDate;

	}

	public static Date toDate(Context context, String date) throws Exception {
		return toDate(context, date, "yyyy. M. d");
	}

	public static Date toDate(Context context, String date, String format) throws Exception {
		Date dateTemp = null;
		SimpleDateFormat formatter = new SimpleDateFormat(format, Locale.US);
		try {
			if (fstStringUtil.isNotEmptyString(date)) {
				// dateTemp = new java.util.Date(date);
				dateTemp = formatter.parse(date);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return dateTemp;

	}

	/**
	 * Matrix Date를 'YYYY-MM-DD' 포맷으로 변경한다.
	 * 
	 * @param context
	 * @param date
	 * @return
	 */
	public static String convertMarixDateToYYYYMMDD(String date) throws Exception {
		String format = "yyyy-MM-dd";
		return convertMarixDateToYYYYMMDD(date, format);
	}

	/**
	 * Matrix Date를 'YYYY-MM-DD' 포맷으로 변경한다.
	 * 
	 * @param context
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static String convertMarixDateToYYYYMMDD(String date, String format) throws Exception {
		String strDate = "";
		String dateFormat = "yyyy. M. d";
		try {
			// if date is null, return empty
			if (date != null && !"".equals(date)) {
				String eMatrixFormat = eMatrixDateFormat.getEMatrixDateFormat();
				SimpleDateFormat sd = new SimpleDateFormat(eMatrixFormat, Locale.US);
				Date d = sd.parse(date);

				sd.applyPattern(format);
				strDate = sd.format(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return strDate;

	}

	public static String convertDateFormatChange(String date, String inputFormat, String outputFormat) throws Exception {
		String strDate = "";

		try {
			// if date is null, return empty
			if (date != null && !"".equals(date)) {
				SimpleDateFormat sd = new SimpleDateFormat(inputFormat, Locale.US);
				Date d = sd.parse(date);

				sd.applyPattern(outputFormat);
				strDate = sd.format(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return strDate;
	}

	public static String currentToYYYYMMDD() throws Exception {
		String strDate = "";
		try {
			// if date is null, return empty
			Calendar ca = Calendar.getInstance();
			int year = ca.get(Calendar.YEAR);
			int month = (ca.get(Calendar.MONTH) + 1);
			int day = ca.get(Calendar.DAY_OF_MONTH);
			int date = year + month + day;
			strDate = String.valueOf(date);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return strDate;

	}
	
	public static String currentToYYYYMMDD_fix() throws Exception {
		try {
			// if date is null, return empty
			Calendar ca = Calendar.getInstance();
			int year = ca.get(Calendar.YEAR);
			int month = (ca.get(Calendar.MONTH) + 1);
			int day = ca.get(Calendar.DAY_OF_MONTH);
			return year + " " + month + day;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}


	}

	/**
	 * 입력받은 날짜를 MatrixDateFormat으로 변경한다.
	 * 
	 * @param context
	 * @param date
	 * @param dateFormat
	 * @return
	 * @throws Exception
	 */
	public static String convertInputDateToMatrix(Context context, String date, String dateFormat) throws Exception {
		String strDate = "";
		// String dateFormat = "yyyy-M-d";
		try {
			// if date is null, return empty
			if (date != null && !"".equals(date)) {

				SimpleDateFormat sd = new SimpleDateFormat(dateFormat, Locale.US);
				Date d = sd.parse(date);

				String eMatrixFormat = eMatrixDateFormat.getEMatrixDateFormat();
				sd.applyPattern(eMatrixFormat);
				strDate = sd.format(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return strDate;
	}

	/**
	 * DB의 날짜를 yyyy. MM. dd 방식으로 변경한다.
	 * 
	 * @param context
	 * @param date
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static String getRequestDate(Context context, HttpServletRequest request, String date) throws Exception {
		String timeZone = (String) request.getSession().getValue("timeZone");
		double iClientTimeOffset = (new Double(timeZone)).doubleValue();
		return eMatrixDateFormat.getFormattedDisplayDate(date, iClientTimeOffset, request.getLocale());
	}

	/**
	 * 현재년월을 리턴한다.
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String getYYMM() throws Exception {
		String year, month;
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		StringBuffer buf = new StringBuffer();
		// 년도 2자리
		year = Integer.toString(cal.get(Calendar.YEAR)).substring(2, 4);
		buf.append(year);
		// 월 2자리
		month = Integer.toString(cal.get(Calendar.MONTH) + 1);
		buf.append(month);
		return buf.toString();
	}

	/**
	 * 현재년월을 리턴한다.
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String getYYYYMM() throws Exception {
		String year, month;
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		StringBuffer buf = new StringBuffer();
		// 년도 4자리
		year = Integer.toString(cal.get(Calendar.YEAR));
		buf.append(year);
		// 월 2자리
		month = Integer.toString(cal.get(Calendar.MONTH) + 1);
		buf.append(month);
		return buf.toString();
	}

	/**
	 * 현재년월일을 리턴한다.
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String getYYYYMMDD() throws Exception {
		String year, month, day;
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		StringBuffer buf = new StringBuffer();

		// 년도 4자리
		year = Integer.toString(cal.get(Calendar.YEAR));
		buf.append(year);

		// 월 2자리
		month = Integer.toString(cal.get(Calendar.MONTH) + 1);
		if (month.length() == 1)
			month = "0" + month;
		buf.append(month);

		// 일 2자리
		day = Integer.toString(cal.get(Calendar.DATE));
		if (day.length() == 1)
			day = "0" + day;
		buf.append(day);

		return buf.toString();
	}

	public static String getYYMMDDHHMMSS() throws Exception {

		Date today = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd_HHmmss");
		return formatter.format(today);
	}

	/**
	 * 상반기, 하반기 여부를 리턴한다.
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String getCurrentHalf() throws Exception {
		String half = "";
		int month;
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		// 월 2자리
		month = cal.get(Calendar.MONTH) + 1;
		if (month > 6) {
			half = "F";
		} else {
			half = "L";
		}
		return half;
	}

	/**
	 * 현재년을 리턴한다.
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String getYYYY() throws Exception {
		String year = "";
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		StringBuffer buf = new StringBuffer();
		// 년도 2자리
		year = Integer.toString(cal.get(Calendar.YEAR));
		buf.append(year);
		return buf.toString();
	}

	/**
	 * 해당년도에서 이전 몇년까지의 년도를 Object 배열로 가져온다.
	 * 
	 * @param year 년도
	 * @param intCnt 이전년도 카운트
	 * @return
	 */
	public static Object[] getYearArray(int cnt) throws Exception {
		return getYearArray(getYYYY(), cnt);

	}

	/**
	 * 해당년도에서 이전 몇년까지의 년도를 Object 배열로 가져온다.
	 * 
	 * @param year 년도
	 * @param intCnt 이전년도 카운트
	 * @return
	 */
	public static Object[] getYearArray(String year, int intCnt) {

		if (intCnt < 0) {
			throw new NullPointerException("invalid Number");
		}
		Object[] objYears = new Object[intCnt + 1];
		int intYear = Integer.parseInt(year);

		// 현재년도를 배열 마지막에 넣는다.
		objYears[intCnt] = intYear;
		intYear = intYear - intCnt;
		objYears[0] = intYear;
		for (int inx = 1; inx < intCnt; inx++) {
			intYear = intYear + 1;
			objYears[inx] = intYear;
		}

		return objYears;
	}

	/**
	 * 입력받은 날짜를 기준으로 더한 날짜를 MatrixDateFormat으로 변경한다.
	 * 
	 * @param context
	 * @param date
	 * @param dateFormat
	 * @param intAddDay 더한 날짜 수
	 * @return
	 * @throws Exception
	 */
	public static String convertAddInputDateToMatrix(Context context, String date, int intAddDay) throws Exception {
		String month, day;
		String strDate = "";
		String dateFormat = "yyyy. M. d";

		try {
			if (date != null && !"".equals(date)) {

				SimpleDateFormat sd = new SimpleDateFormat(dateFormat, Locale.US);

				Calendar cal = Calendar.getInstance();
				cal.setTime(sd.parse(date));
				cal.add(Calendar.DATE, intAddDay);

				StringBuffer buf = new StringBuffer();
				buf.append(Integer.toString(cal.get(Calendar.YEAR)));
				buf.append(". ");
				month = Integer.toString(cal.get(Calendar.MONTH) + 1);
				day = Integer.toString(cal.get(Calendar.DATE));
				buf.append(month);
				buf.append(". ");
				buf.append(day);

				date = buf.toString();
				Date d = sd.parse(date);

				String eMatrixFormat = eMatrixDateFormat.getEMatrixDateFormat();
				sd.applyPattern(eMatrixFormat);
				strDate = sd.format(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return strDate;
	}

	/**
	 * MM/dd/yyyy --> yyyy-MM-dd
	 * 
	 * @param date
	 * @return
	 * @throws Exception
	 */

	/**
	 * "MM/dd/yyyy" --> "yyyy-MM-dd"
	 * 
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static String getDisplayDate(String date) throws Exception {
		return convertDateFormat(date, "MM/dd/yyyy", "yyyy-MM-dd");
	}

	/**
	 * "MM/dd/yyyy" --> "yyyy-MM-dd HH:mm:ss"
	 * 
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static String getDisplayDateTime(String date) throws Exception {
		return convertDateFormat(date, "MM/dd/yyyy", "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * "MM/dd/yyyy hh:mm:ss a" --> "yyyy-MM-dd"
	 * 
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static String getTableDisplayDate(String date) throws Exception {
		return convertDateFormat(date, "MM/dd/yyyy hh:mm:ss a", "yyyy-MM-dd");
	}

	/**
	 * "MM/dd/yyyy hh:mm:ss a" --> "yyyy-MM-dd HH:mm:ss"
	 * 
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static String getTableDisplayDateTime(String date) throws Exception {
		return convertDateFormat(date, "MM/dd/yyyy hh:mm:ss a", "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * convert date format
	 * 
	 * @param date
	 * @param format1
	 * @param format2
	 * @return
	 * @throws Exception
	 */
	public static String convertDateFormat(String date, String format1, String format2) throws Exception {
		if (UIUtil.isNullOrEmpty(date))
			return date;

		String strDate = date;
		try {
			SimpleDateFormat sd = new SimpleDateFormat(format1, Locale.US);
			Date d = sd.parse(date);
			sd.applyPattern(format2);
			strDate = sd.format(d);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return strDate;
	}

	public static SimpleDateFormat getDateFormat(String format) {
		return new SimpleDateFormat(format, Locale.US);
	}

	public static String getAddDate(int intAddDay) {
		String month, day;
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		cal.add(Calendar.DATE, intAddDay);
		Date date = cal.getTime();
		return getDateFormat(DATE_FORMAT_DASH).format(date).trim();
	}

	public static long getTimeInMillis(String date) throws Exception {
		java.util.Date d = getDateFormat(DATE_FORMAT_DASH).parse(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		return cal.getTimeInMillis();
	}

	/**
	 * 
	 * 입력한 날짜를 입력한 Format으로 해석하여 addDay 만큼 더한 날짜를 Return한다.
	 * 
	 * addDays("12/22/2014", 1, eMatrixDateFormat.getEMatrixDateFormat()) ===> 12/22/2014
	 * 
	 * @param date
	 * @param addDay 더할 일수
	 * @param format
	 * @return String
	 * @throws ChainedException
	 */
	public static String addDays(String date, int addDay, String format) throws Exception {
		try {
			java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(format, java.util.Locale.ENGLISH);
			java.util.Date formattedDate = formatValidDate(date, format);
			formattedDate.setTime(formattedDate.getTime() + ((long) addDay * 1000 * 60 * 60 * 24));
			return formatter.format(formattedDate);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * 
	 * 입력된 날짜가 입력한 Format 에 적합한지 확인하고, 적합하면 java.util.Date Type을 Return한다.
	 * 
	 * <pre>
	 * 
	 * [사용 예제]
	 * 
	 * check("2014-12-22","yyyy-MM-dd")	===> Thu Feb 26 00:00:00 2014
	 * 
	 * </pre>
	 * 
	 * @param date
	 * @param format
	 * @throws ChainedException
	 */
	public static java.util.Date formatValidDate(String date, String format) throws Exception {

		if (date == null || format == null)
			return null;

		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(format, java.util.Locale.US);
		java.util.Date formattedDate = null;

		try {

			formattedDate = formatter.parse(date);

		} catch (java.text.ParseException e) {
			throw e;
		}

		if (!formatter.format(formattedDate).equals(date)) {
			throw new Exception("Date Format Exception.");
		}

		return formattedDate;

	}

	/**
	 * 
	 * 입력된 날짜가 입력한 Format 에 적합한지 확인하고, 적합하면 True를 리턴한다.
	 * 
	 * <pre>
	 * [사용 예제]
	 * 
	 * </pre>
	 * 
	 * @param date "2014-0202"
	 * @param format "yyyy-mm-dd"
	 * @throws ChainedException
	 */
	public static boolean isValidDateFormat(String date, String format) throws Exception {

		if (date == null || format == null)
			return false;

		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(format, java.util.Locale.US);
		java.util.Date formattedDate = null;

		try {

			formattedDate = formatter.parse(date);

		} catch (java.text.ParseException e) {
			return false;
		}

		if (!formatter.format(formattedDate).equals(date)) {
			return false;
		}

		return true;

	}

	public static int doDiffOfDate(String sStart, String sEnd,String sDateFormat) throws ParseException{
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(sDateFormat);
			Date beginDate = formatter.parse(sStart);
			Date endDate = formatter.parse(sEnd);

			long diff = beginDate.getTime() - endDate.getTime();
			long diffDays = diff / 86400000;

			return (int)diffDays;
		} catch (ParseException e) {
			throw e;
		}
	}

	public static boolean greateBetwwenDate(String toDate, String fromDate) {
		if (getDayBetweenDays(toDate, fromDate) > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 날짜 간 차이일수를 구한다.
	 * 
	 * @param strToDate
	 * @param strFromDate
	 * @return
	 */
	public static int getDayBetweenDays(String strToDate, String strFromDate) {
		int year1 = 0;
		int month1 = 0;
		int day1 = 0;
		int year2 = 0;
		int month2 = 0;
		int day2 = 0;

		String[] date1 = strToDate.split("-");
		String[] date2 = strFromDate.split("-");

		year1 = Integer.parseInt(date1[0]);
		month1 = Integer.parseInt(date1[1]);
		day1 = Integer.parseInt(date1[2]);

		year2 = Integer.parseInt(date2[0]);
		month2 = Integer.parseInt(date2[1]);
		day2 = Integer.parseInt(date2[2]);

		int intToDay = convertDateToDay(year1, month1, day1);
		int intFromDay = convertDateToDay(year2, month2, day2);

		return intToDay - intFromDay + 1;
	}

	/**
	 * Matrix 포멧의 두 날짜 사이의 일수를 구한다.
	 * 
	 * @param strToDate
	 * @param strFromDate
	 * @return
	 * @throws Exception
	 */
	public static int getDayBetweenDaysForMatrix(String strToDate, String strFromDate) throws Exception {
		String toDate = fstDateUtil.convertMarixDateToYYYYMMDD(strToDate); //
		String fromDate = fstDateUtil.convertMarixDateToYYYYMMDD(strFromDate); //
		return getDayBetweenDays(toDate, fromDate);
	}

	/**
	 * Matrix 포멧의 두 날짜 사이의 M/H를 구한다.
	 * 
	 * @param strToDate
	 * @param strFromDate
	 * @return
	 * @throws Exception
	 */
	public static String getMHBetweenDaysForMatrix(String strToDate, String strFromDate) throws Exception {
		String toDate = fstDateUtil.convertMarixDateToYYYYMMDD(strToDate); //
		String fromDate = fstDateUtil.convertMarixDateToYYYYMMDD(strFromDate); //
		// 두 날짜 사이의 일수를 계사한다.
		int days = getDayBetweenDays(toDate, fromDate);
		// 소수점 2째자리에서 반올림
		DecimalFormat df = new DecimalFormat("#,##0.0");
		// M/H 계산은 월평균으로 해서 30.5일로 한다.
		Double mh = days / 30.5;
		return df.format(mh);
	}

	/**
	 * 해당되는 날짜의 일수를 구한다.
	 * 
	 * @param date YYYY-MM-DD
	 * @return
	 */
	public static int convertDateToDay(String date) {
		int year1 = 0;
		int month1 = 0;
		int day1 = 0;
		if (date == null || date.equals("")) {
			return 0;
		}
		String[] date1 = date.split("-");

		year1 = Integer.parseInt(date1[0]);
		month1 = Integer.parseInt(date1[1]);
		day1 = Integer.parseInt(date1[2]);

		int intToDay = convertDateToDay(year1, month1, day1);
		return intToDay;
	}

	/**
	 * 날짜를 숫자로 변환 ( 윤년을 감안함)
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public static int convertDateToDay(int year, int month, int day) {
		int numOfLeapYear = 0; // 윤년의 수
		int[] endOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 전년도까지의 윤년의 수를 구한다
		for (int inx = 0; inx < year; inx++) {
			if ((inx % 4 == 0) && (inx % 100 != 0) || (inx % 400 == 0)) {
				numOfLeapYear++;
			}
		}
		// 전년도까지의 일 수를 구한다
		int toLastYearDaySum = (year - 1) * 365 + numOfLeapYear;

		// 올해의 현재 월까지의 일수 계산
		int thisYearDaySum = 0;

		for (int jnx = 0; jnx < month - 1; jnx++) {
			thisYearDaySum += endOfMonth[jnx];
		}

		// 윤년이고, 2월이 포함되어 있으면 1일을 증가시킨다.
		if (month > 2 && ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
			thisYearDaySum++;
		}

		thisYearDaySum += day;

		return toLastYearDaySum + thisYearDaySum;
	}

	public static String getFormattedInputDateTime(Context context, String strDate, String type) throws Exception {
		String startDate = "";
		String time = "";
		TimeZone tz = TimeZone.getTimeZone(context.getSession().getTimezone());
		double dbMilisecondsOffset = (double) (-1) * tz.getRawOffset();
		double clientTZOffset = (new Double(dbMilisecondsOffset / (1000 * 60 * 60))).doubleValue();
		Locale strLocale = context.getLocale();

		if (type.equals("start")) {
			time = "01:00:00 AM";
		} else {
			time = "23:59:59 PM";
		}

		if (!strDate.equals("")) {
			startDate = eMatrixDateFormat.getFormattedInputDateTime(context, strDate, time, eMatrixDateFormat.iDateTimeDisplayFormat, clientTZOffset, strLocale);
		}

		return startDate;

		// if(!endDate.equals("")) {
		// endDate = eMatrixDateFormat.getFormattedInputDateTime(context,
		// endDate, "23:59:59 PM", eMatrixDateFormat.iDateTimeDisplayFormat,
		// clientTZOffset, strLocale);
		// }
	}

	/**
	 * 현재일 기준으로 Working Day 기간만큼의 날짜를 구한다. (주말 제외)
	 * 
	 * @param context
	 * @param day
	 * @return
	 * @throws Exception
	 */
	public static String getWorkingDay(Context context, long day) throws Exception {
		Calendar cal = Calendar.getInstance(Locale.getDefault());
		Date currentDate = cal.getTime();
		return getWorkingDay(context, currentDate, day);
	}

	/**
	 * 파라미티로 받은 날짜를 기준으로 Working Day 기간만큼의 날짜를 구한다. (주말 제외)
	 * 
	 * @param context
	 * @param date
	 * @param day
	 * @return
	 * @throws Exception
	 */
	public static String getWorkingDay(Context context, Date date, long day) throws Exception {
		BusinessObject location = new BusinessObject(FSTConstants.TYPE_LOCATION, "CHANGWON", "0000000001", FSTConstants.VAULT_ESERVIC_PRODUCTION);
		WorkCalendar workcalendar = WorkCalendar.getCalendar(context, location.getObjectId(context));
		Date finishDate = workcalendar.computeFinishDate(context, date, day);

		String calendarDate = "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy. M. d", Locale.US);
		calendarDate = formatter.format(finishDate);

		return calendarDate;
	}

	/**
	 * 파라미티로 받은 날짜를 기준으로 Working Day 기간만큼의 날짜를 구한다. (주말 제외)
	 * 
	 * @param context
	 * @param date
	 * @param day
	 * @return
	 * @throws Exception
	 */
	public static String getWorkingDay(Context context, String date, long day) throws Exception {
		BusinessObject location = new BusinessObject(FSTConstants.TYPE_LOCATION, "CHANGWON", "0000000001", FSTConstants.VAULT_ESERVIC_PRODUCTION);
		WorkCalendar workcalendar = WorkCalendar.getCalendar(context, location.getObjectId(context));
		Date finishDate = workcalendar.computeFinishDate(context, toDate(context, date), day);

		String calendarDate = "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy. M. d", Locale.US);
		calendarDate = formatter.format(finishDate);

		return calendarDate;
	}


	public static Date getConvertStringToDate(String date, String format) throws ParseException{
		SimpleDateFormat transFormat = new SimpleDateFormat(format,Locale.US);
		Date returnDate = fstStringUtil.isNotEmptyString(date) ? transFormat.parse(date):null;
		return returnDate;
	}

	public static Date getLastWeekLastDate(String format) throws Exception {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat transFormat = new SimpleDateFormat(format,Locale.US);

		while(cal.get(Calendar.DAY_OF_WEEK) != 1) {
			cal.add(Calendar.DATE, -1);
		}
		cal.add(Calendar.DATE,-1);

		Date returnDate = transFormat.parse(transFormat.format(cal.getTime()));
		return returnDate;
	}

	public static Date getThisWeekFirstDate(String format) throws Exception {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat transFormat = new SimpleDateFormat(format,Locale.US);

		cal.add(Calendar.DATE, 1 - cal.get(Calendar.DAY_OF_WEEK));

		Date returnDate = transFormat.parse(transFormat.format(cal.getTime()));

		System.out.println(transFormat.format(returnDate));

		return returnDate;
	}

	public static Date getThisWeekLastDate(String format) throws Exception {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat transFormat = new SimpleDateFormat(format,Locale.US);

		cal.add(Calendar.DATE, 7 - cal.get(Calendar.DAY_OF_WEEK));

		Date returnDate = transFormat.parse(transFormat.format(cal.getTime()));

		System.out.println(transFormat.format(returnDate));

		return returnDate;
	}


	public static Date getDateMinus(Date date,String format) throws Exception {
		Calendar cal = Calendar.getInstance();

		cal.setTime(date);

		SimpleDateFormat transFormat = new SimpleDateFormat(format,Locale.US);

		cal.add(Calendar.DATE, -7);

		Date returnDate = transFormat.parse(transFormat.format(cal.getTime()));

		System.out.println(transFormat.format(returnDate));

		return returnDate;
	}

	public static Date getToday(String format) throws Exception {
		Calendar cal = Calendar.getInstance();

		SimpleDateFormat transFormat = new SimpleDateFormat(format,Locale.US);

		//cal.add(Calendar.DATE, -7);

		Date returnDate = transFormat.parse(transFormat.format(cal.getTime()));

		System.out.println(transFormat.format(returnDate));

		return returnDate;
	}

	public static String getDateYYYYMMDD(Date date,String format) throws Exception {
		Calendar cal = Calendar.getInstance();

		cal.setTime(date);

		SimpleDateFormat transFormat = new SimpleDateFormat(format,Locale.US);

		//cal.add(Calendar.DATE, -7);

		Date returnDate = transFormat.parse(transFormat.format(cal.getTime()));

		//System.out.println(transFormat.format(returnDate));

		return transFormat.format(returnDate);
	}

	public static String getTimeStrippedEmxDateFormat( Context context ,
			String args[]) throws Exception
			{
		HashMap paramMap = JPO.unpackArgs(args);
		String sTimeZone = (String) paramMap.get("timeZone");
		double dTimeZone = ( new Double( sTimeZone ) ).doubleValue();
		String sDate = (String) paramMap.get("Date");
		return getTimeStrippedEmxDateFormat(context, dTimeZone, sDate);
			}

	/**
	 * @param context
	 * @param dTimeZone
	 * @param sDate
	 * @return
	 * @throws Exception
	 */
	public static String getTimeStrippedEmxDateFormat(Context context, double dTimeZone, String sDate) {
		String sFormattedDate;
		try {
			if (fstStringUtil.isNotNullString(sDate)) {
				Locale locale = context.getLocale();
				sFormattedDate = eMatrixDateFormat.getFormattedInputDate(context, sDate, dTimeZone, locale);
				sFormattedDate = sFormattedDate.substring(0, sFormattedDate.indexOf(" "));
			} else {
				sFormattedDate = sDate;
			}
		} catch (Exception e) {
			sFormattedDate = sDate;
		}
		return sFormattedDate;
	}


	public static String getCurrentDateString( String sFormat ) {
		Date d = new Date( System.currentTimeMillis() );
		String sRet = "";
		try {
			SimpleDateFormat sd = new SimpleDateFormat( sFormat, Locale.US );
			sRet = sd.format( d );
		} catch( Exception e ) {
			// e.printStackTrace();
		}
		return sRet;
	}

	public static String convertSearchDate(String sDate, String sDateTime)
	{
		return convertSearchDate(sDate, sDateTime, eMatrixDateFormat.getEMatrixDateFormat());
	}

	public static String convertSearchDate(String sDate, String sDateTime, String newFormat)
	{
		// old Format
		String sDateFormat = "yyyy-MM-dd";
		if( sDate.indexOf(",") > -1 ) {
			sDateFormat = "MMM d, yyyy";
		} else if( sDate.indexOf(".") > -1 ) {
			sDate = sDate.replace(" ", "");
			sDateFormat = "yyyy.MM.dd";
		} else if( sDate.indexOf("-") > -1 ) {
			sDateFormat = "yyyy-MM-dd";
		}

		// date time
		if( UIUtil.isNotNullAndNotEmpty(sDateTime) ) {
			sDate = sDate + sDateTime;
			sDateFormat = sDateFormat + " hh:mm:ss a";
		}

		// new Format
		if( UIUtil.isNullOrEmpty(newFormat) ) {
			newFormat = "yyyy/MM/dd";
			if( UIUtil.isNotNullAndNotEmpty(sDateTime) ) {
				newFormat = "yyyy/MM/dd hh:mm:ss a";
			}
		}

		// convert
		String newDate = sDate;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(sDateFormat, Locale.US);
			Date date = formatter.parse(sDate);

			SimpleDateFormat newFormatter = new SimpleDateFormat(newFormat, Locale.US);
			newDate = newFormatter.format(date);
			//System.out.println( "[convertDate]\t" + newDate + " << " + sDate);
		} catch(Exception e) {
			System.out.println( "[convertSearchDate Error]\t" + sDate );
			return sDate;
		}
		return newDate;
	}

	/**
	 * emxSystem.property
	 * eServiceSuites.eMatrixDateFormat = MM/dd/yyyy hh:mm:ss
	 * emxFramework.DateTime.DisplayFormat = MEDIUM
	 * KO 날짜 형식을 emxSystem.property 기준으로 날짜 형식 변경 처리  
	 */
	public static String convertKoreaDateToMatrixDate(String sDate) throws Exception {
		
		String rtn = sDate;

		try {
			
			String matrixDateFormat = eMatrixDateFormat.getEMatrixDateFormat();
			int matrixDisplayDateFormat = eMatrixDateFormat.getEMatrixDisplayDateFormat();
			Locale locale = Locale.getDefault();
			String localeLanguage = locale.getLanguage();
			SimpleDateFormat sdf = null;
			String dateFormat = null;
			String ptn1 = "^[0-9]*.\\s[0-9]*.\\s[0-9]*$";
			String ptn2 = "^[0-9]*.\\s[0-9]*.\\s[0-9]*\\s[ㄱ-ㅎ가-힣]*\\s[0-9]*:[0-9]*:[0-9]*$";
			
			Date date = new Date();
			if ("ko".equals(localeLanguage)) {
				
				if (Pattern.matches(ptn1, sDate)) {
					dateFormat = "yyyy. M. d";
				}
				else if (Pattern.matches(ptn2, sDate)) {
					dateFormat = "yyyy. M. d a hh:mm:ss";
				}
				
				if (UIUtil.isNullOrEmpty(dateFormat)) {
					dateFormat = matrixDateFormat;
				}
				
				sdf = new SimpleDateFormat(dateFormat, Locale.KOREA);
				date = sdf.parse(sDate);
				
				sdf = new SimpleDateFormat(matrixDateFormat, Locale.US);
				sDate = sdf.format(date);

				rtn = sDate;

				// 데이터 확인시 사용
//				System.out.println(Pattern.matches(ptn1, sDate) + " : " + dateFormat); 
//				System.out.println(Pattern.matches(ptn2, sDate) + " : " + dateFormat); 
//				System.out.println(sDate);
				
				
				// emxFramework.DateTime.DisplayFormat = MEDIUM 으로 데이터를 변경하고 싶을 경우 사용
				// 사용시 결과값 : 2016. 11. 23
				/*
				date = new Date(); 
				long lDate = date.parse (sDate);
				date = new Date (lDate); 
				DateFormat df = DateFormat.getDateInstance (matrixDisplayDateFormat, Locale.KOREA ); 
				sDate = df.format (date); 
				System.out.println ( "===> " + sDate );
				*/
				
			}
			else {
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return rtn;
	}
	
}
