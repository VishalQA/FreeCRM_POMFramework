package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[@class='user-display']")
	WebElement usernamelable;
	
	@FindBy (xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	@FindBy (xpath = "//span[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy (xpath = "//span[contains(text(),'Tasks')]")
	WebElement taskslink;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatehomepagetitle() {
		return driver.getTitle();
	}
	
	public boolean verifyusername() {
		return usernamelable.isDisplayed();
		
	}
	public  ContactsPage clickoncontactslink() {
		contactslink.click();
		return new ContactsPage();
	}
	
	public Deals clickondealslink() {
		dealslink.click();
		return new Deals();
		
	}
	public Tasks clickontaskslink() {
		taskslink.click();
		return new Tasks();
	
	}


}
