package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import junit.framework.Assert;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public  HomePageTest() {
		super();
	}

	@BeforeMethod()
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	
	@Test (priority =1)
	public void verifyhomepagetitletest() {
		String homepagetitle = homepage.validatehomepagetitle();
		Assert.assertEquals(homepagetitle, "Cogmento CRM" );
	}
	
	@Test (priority =2)
	public void verifyusernametest() {
		Assert.assertTrue(homepage.verifyusername());
		
	}
}
