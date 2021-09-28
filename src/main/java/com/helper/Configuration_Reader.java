package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				".\\src\\main\\java\\com\\properties\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties(); // ---> static

		p.load(fis);

	}

	public String getBrowser() {

		String browser = p.getProperty("browser"); // case sensitive

		return browser;

	}

	public String getUrl() {

		String url = p.getProperty("url");

		return url;
	}

	public String getUsername() {

		String username = p.getProperty("db_Username");

		return username;

	}

	public void getPassword() {
		// TODO Auto-generated method stub

	}

}
