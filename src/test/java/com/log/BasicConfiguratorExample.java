package com.log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {

	static Logger logger = Logger.getLogger(BasicConfiguratorExample.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		logger.debug("Debug");

		logger.info("Information");

		logger.warn("warning");

		logger.error("Error");

		logger.fatal("fatal");

	}

}
