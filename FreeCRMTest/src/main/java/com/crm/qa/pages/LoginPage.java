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
	WebElement loginBtn;
	
	@FindBy (xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signupBtn;

		
	public LoginPage() {	
		PageFactory.initElements(driver ,this);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public String validateLoginPageTitle() {
		System.out.println("Hi");
		System.out.println(driver.equals("null"));
		System.out.println(driver.getTitle());
		return driver.getTitle();
		
	}
   	@SuppressWarnings("unlikely-arg-type")
	public HomePage login(String un , String pwd) {
//   		System.out.println(driver.equals("null"));
		email.sendKeys("vishal.mailbox1@gmail.com");
		password.sendKeys("Passworld123$");
		loginBtn.click();
				return new HomePage();
		
	}
}
