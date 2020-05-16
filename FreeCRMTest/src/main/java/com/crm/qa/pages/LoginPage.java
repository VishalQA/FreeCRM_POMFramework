package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	String validateLoginPageTitle = null;
	String un = null;
	String pwd = null;
	
	// page factory  or
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy (name = "password")
	WebElement  password;
	
	@FindBy (xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy (xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signupBtn;

	
	
	public LoginPage() {
		
		PageFactory.initElements(driver ,this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
   
	public HomePage login(String un , String pwd) {
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		
	}
}
