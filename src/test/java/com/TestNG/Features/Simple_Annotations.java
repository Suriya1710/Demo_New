package com.TestNG.Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void setProperty() {

		System.out.println("Set Property");

	}

	@BeforeTest
	private void browserLaunch() {

		System.out.println("Browser Launch");

	}

	@BeforeClass
	private void launchUrl() {

		System.out.println("URL.....");

	}

	@BeforeMethod
	public void login() {

		System.out.println("Click the login button");

	}

	@Test
	private void laptop() {

		System.out.println("Laptop");

	}

	@Test
	private void mobilephones() {

		System.out.println("Mobile");

	}

	@Test
	private void earphones() {

		System.out.println("Earphone");

	}

	@AfterMethod
	private void logout() {

		System.out.println("Logout");

	}

	@AfterClass
	private void verifyHomePage() {

		System.out.println("Home Page...");

	}

	@AfterTest
	private void close() {

		System.out.println("Driver Close");

	}

	@AfterSuite
	private void deleteAllCookies() {

		System.out.println("Delete All Cookies");

	}

}
