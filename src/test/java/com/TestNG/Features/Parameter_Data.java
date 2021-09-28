package com.TestNG.Features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Data {

	@Test
	@Parameters({ "username", "password" })
	private void credentails(@Optional("Starc") String username, String password) {

		System.out.println("username : " + username);

		System.out.println("password : " + password);

	}

	@Test
	@Parameters({ "data", "data2" })
	private void credentails1(String data, String data2) {

		System.out.println("username : " + data);

		System.out.println("password : " + data2);

	}

}
