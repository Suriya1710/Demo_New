package com.TestNG.Features;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	
	@Test(expectedExceptions = NullPointerException.class)
	private void demo() {

		int a = 10;
		
		System.out.println(a/0);
		
		
	}
	
	

}
