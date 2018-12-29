package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_033POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_0033 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RTTC_033POM test1 ;
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
	public void validRTTC_0033Test() throws InterruptedException {
	System.out.println("test is called");
		test1 =new RTTC_033POM(driver);
		test1.clickprofile();
		 System.out.println("profile is clicked");
		//test1.clickaccount();
		System.out.println("login link is clicked");
		Thread.sleep(5000);
		test1.sendemailaddr("mazoor@gmail.com");
		test1.sendpassword("manzoor1");
		
		Thread.sleep(2000);
				
		test1.clickloginBtn();
		Thread.sleep(3000);
		 test1.clickethnic();
		 System.out.println("ethnic is clicked");
		/*test1.clickmassa();
		System.out.println("massa is clicked");
		Thread.sleep(5000);*/
		
		String ParentWindowhandle=driver.getWindowHandle();
		System.out.println("ParentWindowhandle"+ParentWindowhandle);
		
		test1.clickproduct();
		System.out.println("product is clicked");
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		{
		for(String childtab:driver.getWindowHandles())
			driver.switchTo().window(childtab);
		}
		
		System.out.println(driver.getTitle());
		Thread.sleep(9000);
		
		test1.clickaddtocart();
		System.out.println("addtocart is clicked");
		
		Thread.sleep(5000);
		
		test1.clickclosepop();
		System.out.println("popclose is clicked");
		
		//Thread.sleep(5000);
				
		//Actions action = new Actions(driver);
		test1.movetoElementcarticon();
		//action.perform();
		
		Thread.sleep(5000);
		
		test1.clickviewcart();
		System.out.println("view cart is clicked");
		
		test1.clickcheckout();
		System.out.println("checkout is clicked");
		
		Thread.sleep(5000);
		
		test1.clickcontinuebuttonforbilling();
		System.out.println("continuebuttonforbilling is clicked");
		
		Thread.sleep(8000);
		
		test1.clickshippingaddressbutton();
		System.out.println("shipping address is clicked");
		Thread.sleep(8000);
		
		test1.sendaddcomment("product is good");
		System.out.println("comment is added");
		Thread.sleep(5000);
		test1.clickcontinuebuttonforshipping();
		System.out.println("continuebuttonforshipping is clicked");
		Thread.sleep(5000);
		test1.clickagreecheckbox();
		System.out.println("agreecheckbox is clicked");
		Thread.sleep(5000);
		//test1.clickcontinuebuttonfordelivery();
		//System.out.println("continuebuttonfordelivery is clicked");
		
		test1.clickcontinuebuttonforpaymentmethod();
		System.out.println("continuebuttonforpaymentmethod is clicked");
		Thread.sleep(5000);
		//test1.sendaddcomment("product is good");
		//System.out.println("comment is added");
		test1.clickconfirmbutton();
		System.out.println("confirmbutton is clicked");
		Thread.sleep(5000);
		
		//screenShot.captureScreenShot("First");
	}
}

		
		
		
		
		
		
	
		
		
		
		