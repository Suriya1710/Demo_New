package com.TestNG.Features;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(priority = -1)
	private void browserLaunch() {

		System.out.println("Browser Launch");

	}

	@Test(priority = 0, invocationCount = 3)
	private void refresh() {

		System.out.println("Refresh");

	}

	@Test(priority = 1)
	private void nextPage() {

		System.out.println("next page");

	}

}
