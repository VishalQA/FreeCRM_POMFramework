package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	// page factory  or
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy (name = "password")
	WebElement  password;
	
	@FindBy (xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement login;
	
	@FindBy (xpath = "//a[contains(text(),'Sign Up')]")
	WebElement Signup;

	
	public LoginPage() {
		PageFactory.initElements(driver ,this);
	}
	
	public String validateloginpagetitle() {
		return driver.getTitle();
	}
   
	public HomePage login(String un , String pwd) {
		email.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
		
	}
}
