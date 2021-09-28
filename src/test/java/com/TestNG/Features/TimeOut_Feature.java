package com.TestNG.Features;

import org.testng.annotations.Test;

public class TimeOut_Feature {
	
	
	@Test(timeOut = 5000)
	private void login() throws Throwable {

		System.out.println("username");
		
		System.out.println("Password");
		
		Thread.sleep(3000);
		
		System.out.println("login Button");
		
		Thread.sleep(3000);
		
		System.out.println("Navigate To home page");
		
		
	}
	
	
	
	

}
