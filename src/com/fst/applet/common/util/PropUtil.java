package com.fst.applet.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*=========================================================================
*Copyright(c) 2013 SolidEng
*
*@ProcessChain : 프로퍼티 파일 관련 Util class
*
*@File : PropUtil.java
*
*@FileName : PropUtil 정의 class
*
*Open Issues
*
*Chage history
*
*@LastModifyDate : 20130417
*@Author : 배건환 
*@LastModifier : 배건환
*@LastVersion : 1.0
*   2013-04-17  배건환
*       1.0     최초 생성
=========================================================================*/
public class PropUtil {
	/**
	 *
	 * 일반적인 Property File을 로드한다.
	 * 
	 * <pre>
	 * 
	 * [사용 예제] 
	 * 
	 * </pre>
	 * @param sFileName String
	 * @return Properties
	 * @throws Exception 
	 */ 
	public static Properties getPropFile( String sFileName ) throws IOException, ClassNotFoundException {
		Properties prop = new Properties();

		PropUtil pu = new PropUtil();
		InputStream ips = pu.getClass().getResourceAsStream( "/" + sFileName );
		prop.load( ips );
		ips.close();
		return prop;
	}


	/**
	 *
	 * 특정 Properties 파일에서 특정 Attribute의 값을 읽어서 리턴한다.
	 * 
	 * <pre>
	 * 
	 * [사용 예제] 
	 * 
	 * </pre>
	 * @param sFileName String
	 * @param sName String
	 * @return String
	 * @throws Exception 
	 */ 
	public static String getPropValue( String sFileName, String sName ){
		String sRet = "";
		try {
			sRet = ( String )getPropFile( sFileName ).get( sName );
		} catch( Exception e ) {
		}
		return ConvertUtil.NVL(sRet);
	}
}
