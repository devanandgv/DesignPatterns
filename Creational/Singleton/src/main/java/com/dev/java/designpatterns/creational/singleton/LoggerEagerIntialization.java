package com.dev.java.designpatterns.creational.singleton;

import java.util.logging.Logger;


public class LoggerEagerIntialization extends Logger{

	private LoggerEagerIntialization(String name, String resourceBundleName) {
		super(name, resourceBundleName);
		System.out.println("in contstrucotr");
	}

	
	private static LoggerEagerIntialization logger = new  LoggerEagerIntialization(LoggerEagerIntialization.class.getSimpleName(), "message");
	
	public static LoggerEagerIntialization getLogLogger(){
		
		return logger;
	}
}
