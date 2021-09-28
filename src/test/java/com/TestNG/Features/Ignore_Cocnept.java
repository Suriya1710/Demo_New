package com.TestNG.Features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Cocnept {

	@BeforeMethod
	public void login() {

		System.out.println("Click the login button");

	}

	@Test
	private void laptop() {

		System.out.println("Laptop");

	}

	@Test(enabled = false)
	private void mobilephones() {

		System.out.println("Mobile");

	}

	@Ignore
	@Test
	private void books() {

		System.out.println("Books");

	}

	@Test
	private void earphones() {

		System.out.println("Earphone");

	}

	@AfterMethod
	private void logout() {

		System.out.println("Logout");

	}

}
