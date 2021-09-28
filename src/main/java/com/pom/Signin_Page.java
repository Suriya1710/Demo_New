package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {

	public Signin_Page(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebDriver driver; // null

	@FindBy(id = "email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}

	@FindBy(name = "passwd")
	private WebElement password;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement signin_Btn;

}
