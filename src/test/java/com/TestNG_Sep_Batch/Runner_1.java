package com.TestNG_Sep_Batch;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.baseclass.Base_Class;
import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Runner_1 extends Base_Class {

	public static WebDriver driver = getBrowser("chrome"); // null

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	ExtentSparkReporter reporter;

	ExtentReports report;

	ExtentTest test;

	@BeforeTest
	private void configuration() {

		reporter = new ExtentSparkReporter(".//Rep//abc.html");
		
		report = new ExtentReports();

		report.attachReporter(reporter);

		test = report.createTest("Config");

	}

	@Test(priority = -1)
	private void launch_Url() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();

		getUrl(url);

		clickOnElement(pom.getInstanceHp().getSignin_Btn());

		Thread.sleep(3000);

		test = report.createTest("Signin_Page");

	}

	@Test(priority = 1)
	private void username() throws Throwable {

		inputValueElement(pom.getInstanceSp().getUsername(), "emailid1710@gmail.com");

		inputValueElement(pom.getInstanceSp().getPassword(), "Music1710");

		test = report.createTest("Credentials");
	}

	@Test(priority = 3)
	private void login_Btn() {

		clickOnElement(pom.getInstanceSp().getSignin_Btn());

		test = report.createTest("Login_Btn");
	}

	@AfterTest
	private void flush_1() {

		report.flush();

	}

}
