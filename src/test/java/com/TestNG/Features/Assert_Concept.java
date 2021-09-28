package com.TestNG.Features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

	@Test
	private void data_Validation() {

		String expected_Username = "Starc";

		String actual_Username = "Starc123";

		 Assert.assertEquals(actual_Username, expected_Username);

//		SoftAssert s = new SoftAssert();
//
//		s.assertEquals(actual_Username, expected_Username);

		System.out.println("Data verification");

	}

}
