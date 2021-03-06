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
import com.training.pom.RTTC_005POM;
import com.training.pom.RTTC_005POM;
import com.training.pom.TC1POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_005 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RTTC_005POM test1 ;
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
	public void validRTTC_005Test() throws InterruptedException {
	System.out.println("test is called");
		test1 =new RTTC_005POM(driver);
		 test1.clickprofile();
		 System.out.println("profile is clicked");
		//test1.clickaccount();
		System.out.println("login link is clicked");
		Thread.sleep(5000);
		test1.sendemailaddr("mazoor@gmail.com");
		test1.sendpassword("manzoor1");
		
		Thread.sleep(2000);
				
		test1.clickloginBtn();
		
		//Thread.sleep(2000);
		//test1.clickprofile();
		System.out.println("profile is clicked");
		Thread.sleep(2000);
		test1.clickeditinfo();
		System.out.println("editinfo is clicked");
		test1.sendfirstname("manzoor");
		test1.sendlastname("mehadi");
		test1.sendemailaddr("mazoor@gmail.com");
		test1.sendtelephone("9897654321");
		test1.clickcontinueBtn();
		
		
	  
		
		//screenShot.captureScreenShot("First");
	}
}
