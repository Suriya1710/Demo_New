package com.Demo.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_Info {

	// Factory Design Pattern

	static Logger log = Logger.getLogger(Logger_Info.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();

		log.debug("Debug");

		log.info("info");

		log.warn("Warning");

		log.error("Error");

		log.fatal("Fatal Message");

	}

}
