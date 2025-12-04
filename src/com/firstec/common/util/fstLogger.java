package com.firstec.common.util;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class fstLogger {
	static Logger logger= LoggerFactory.getLogger(fstLogger.class);
	
	
	//debug info warn error fatal
	
	public static void debug(String message){
		logger.debug(message);
	}
	
	public static void info(String message){
		logger.info(message);
	}
	
	public static void warn(String message){
		logger.warn(message);
	}
	
	public static void error(String message){
		logger.error(message);
	}

	public static boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}
	
	public static void infoDecodedDefaultCharset(String message) throws UnsupportedEncodingException{		
		logger.info(new String(message.getBytes("8859_1"), "UTF-8"));
	}	
}
