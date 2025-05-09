package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	WebElement txtusername;
	@FindBy(id = "password")
	WebElement txtpassword;
	@FindBy(xpath = "//button")
	WebElement btnSignin;

public void enterUsername (String username) {
	txtusername.sendKeys(username);
}

public void enetrPassword (String password) {
	txtpassword.sendKeys(password);
}

public void clickSignin () {
	btnSignin.click();;
}

}
