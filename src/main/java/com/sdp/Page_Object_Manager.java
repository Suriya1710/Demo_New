package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Home_Page;
import com.pom.Signin_Page;

public class Page_Object_Manager {

	public WebDriver driver; // ---> null

	private Home_Page hp;

	private Signin_Page sp;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;

	}

	public Home_Page getInstanceHp() {

		hp = new Home_Page(driver);

		return hp;

	}

	public Signin_Page getInstanceSp() {

		sp = new Signin_Page(driver);

		return sp;

	}

}
