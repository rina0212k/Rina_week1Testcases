package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.TC1POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_001 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private TC1POM test1 ;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		//private LoginPOM loginPOM;
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	
	}
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validRTTC_01Test() {
		 test1 =new TC1POM(driver);
		 test1.clickprofile();
		//test1.clickaccount();
		
		test1.clickregister();
		test1.sendFirstname("rina");
		
	    test1.sendLastname("test");
		test1.sendEmail("rinacg2@gmail.com"); 
		test1.sendTelephone("234567876"); 
		test1.sendAddress1("ibmpune"); 
		test1.sendcity("pune"); 
		test1.sendregion("Maharashtra");
		test1.sendpassword("welcome1");
		test1.sendconfirmpassword("welcome1");
		test1.clickprivacypolicy(); 
		test1.clickcontinuebtn();
		
		//screenShot.captureScreenShot("First");
	}
}
