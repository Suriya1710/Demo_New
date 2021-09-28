package com.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class System_Logger {
	
	
	static Logger logger = Logger.getLogger(System_Logger.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		logger.debug("Debug");

		logger.info("Information");

		logger.warn("warning");

		logger.error("Error");

		logger.fatal("fatal");

	}

}
