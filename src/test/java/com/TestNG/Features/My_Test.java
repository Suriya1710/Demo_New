package com.TestNG.Features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {
	
	
	@Test
	private void username() {

		String expected_Username = "Starc";
		
		String actual_Username = "Smith";
		
		Assert.assertEquals(actual_Username, expected_Username);
		
	}
	
	@Test
	private void password() {

		String expected_Password = "Starc123";
		
		String actual_Password = "Starc123";
		
		Assert.assertEquals(actual_Password, expected_Password);
		
	}
	

}
