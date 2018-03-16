package com.dev.java.designpatterns.creational.singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass {

	public static void main(String[] args) {
		
		 LoggerEagerIntialization loggerCheck = LoggerEagerIntialization.getLogLogger();
		
		loggerCheck.log(Level.INFO, "hell");
		loggerCheck.log(Level.INFO, "hello print this");
		Logger logger = Logger.getLogger(MainClass.class.getSimpleName());
		logger.log(Level.INFO, "htis iis");
	}

}
