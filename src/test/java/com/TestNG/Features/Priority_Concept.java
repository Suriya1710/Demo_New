package com.TestNG.Features;

import org.testng.annotations.Test;

public class Priority_Concept {

	@Test(priority = 2)
	private void login() {

		System.out.println("Login Button");

	}

	@Test(priority = -1)
	private void setProperty() {

		System.out.println("Browser launch");

	}

	@Test(priority = 1)
	private void password() {

		System.out.println("password");

	}

	@Test(priority = 0)
	private void username() {

		System.out.println("Username");

	}

}
