package com.TestNG.Features;

import org.testng.annotations.Test;

public class Grouping_Test {

	@Test(groups = "Social Media")
	private void facebook() {

		System.out.println("FB....");

	}

	@Test(groups = "E_Commerce")
	private void amazon() {

		System.out.println("Amazon");

	}

	@Test(groups = "E_Commerce")
	private void flipkart() {

		System.out.println("Flipkart");

	}

	@Test(groups = "Social Media")
	private void whatsapp() {

		System.out.println("Whatsapp");

	}

	@Test(groups = "Social Media")
	private void instagram() {

		System.out.println("Instagram");

	}

	@Test(groups = "Music")
	private void spotify() {

		System.out.println("Spotify");
		
	}
	
	@Test(groups = "Music")
	private void wynk() {

		System.out.println("Wynk");
		
	}
	
	
}
