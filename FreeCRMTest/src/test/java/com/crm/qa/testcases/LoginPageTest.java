package com.crm.qa.testcases;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage ;
	
	public LoginPageTest() {
		super();
		}
		@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();	
	}
	@Test (priority =1)
	public void loginPageTitleTest() {
		System.out.println(driver.getTitle());
		String title =  loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");	
	}	
	@Test  (priority =2)
	public void logintest() {
		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
