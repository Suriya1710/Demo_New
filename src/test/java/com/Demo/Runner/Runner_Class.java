package com.Demo.Runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;
import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Runner_Class extends Base_Class {

	public static WebDriver driver = getBrowser("chrome"); // null

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Test(priority = -1)
	private void launch_Url() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();

		getUrl(url);

		clickOnElement(pom.getInstanceHp().getSignin_Btn());

		Thread.sleep(3000);

	}

	@Test(priority = 2, dataProvider = "test_Data")
	private void credentials(String username, String password) {

		inputValueElement(pom.getInstanceSp().getUsername(), username);

		inputValueElement(pom.getInstanceSp().getPassword(), password);

		clickOnElement(pom.getInstanceSp().getSignin_Btn());

	}

	@DataProvider
	private Object[][] test_Data() {

		return new Object[][] { new Object[] { "suriya@gmail.com", "test123" },
				new Object[] { "veera@gmail.com", "test19923" },

		};

	}

	@Test(priority = 3)
	private void login_Btn() {

	}

	@AfterClass
	private void tearDown() {

		close();
	}

}
