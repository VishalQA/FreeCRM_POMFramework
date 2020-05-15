package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {

	public static  WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() {
		try {
			prop = new Properties ();
			FileInputStream ip = new FileInputStream ("C:\\Users\\jaju_v\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
			
		}
	}
	public static void initialization() {
		
//		String browsername = prop.getProperty("browser");
		
//		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\jaju_v\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//			}
//		else if(browsername.equals("FF")) {
//			System.setProperty("webdriver.gecko.driver","C:\\Users\\jaju_v\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30 , TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
}
