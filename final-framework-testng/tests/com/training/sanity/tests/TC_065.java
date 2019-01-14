package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.TC1POM;
import com.training.pom.E2E_TestcasePOM;
import com.training.pom.E2E_TestcasePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC_065 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private E2E_TestcasePOM test1 ;
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
		baseUrl = properties.getProperty("baseURL2");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	
	}
	
	
	
	/*@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	@Test(priority=1)
	public void validTC_065Test() throws InterruptedException {
		 test1 =new E2E_TestcasePOM(driver);
		test1.sendusername("admin");
		test1.sendpassword("admin@123");
		Thread.sleep(5000);
		test1.clickloginBtn();
		test1.clickcatalogicon();
		System.out.println("catalogicon clicked");
		Thread.sleep(3000);
		test1.clickproductslink();
		System.out.println("products is clicked");
		Thread.sleep(3000);
		test1.clickaddnewicon();
		System.out.println("addnewicon is clicked");
		Thread.sleep(3000);
		test1.sendproductname("Diamond ring");
		System.out.println("product name entered");
		Thread.sleep(3000);
		test1.sendmetatagtitle("Diamond ring");
		System.out.println("megatag entered");
		Thread.sleep(3000);
		test1.clickdatatab();
		System.out.println("data is clicked");
		Thread.sleep(3000);
		test1.sendmodelnumtextbox("DKU-012");
		System.out.println("model num entered");
		Thread.sleep(3000);
		test1.sendpricetextbox("8566");
		System.out.println("price entered");
		Thread.sleep(3000);
		test1.sendquantitytextbox("50");
		System.out.println("quantity entered");
		Thread.sleep(3000);
		test1.clicklinktab();
		System.out.println("link tab is clicked");
		Thread.sleep(3000);
		test1.clickcategoriestextbox();
		System.out.println("categoriestext box clicked");
		Thread.sleep(3000);
		test1.sendcategoriestextbox( "ETHNIC  >  Earrings");
		System.out.println("categoriestext is entered");
		
		test1.clicksavebutton();
		System.out.println("save is clicked");
		Thread.sleep(3000);
		test1.clickadminlogout();
		System.out.println("logout is clicked");
		Thread.sleep(3000);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://retail.hommelle.com");
		System.out.println("homepage launched");
		Thread.sleep(8000);
		String ParentWindowhandle=driver.getWindowHandle();
		System.out.println("ParentWindowhandle"+ParentWindowhandle);
		
		System.out.println(driver.getTitle());
		{
		for(String childtab:driver.getWindowHandles())
			driver.switchTo().window(childtab);
		}
		test1.clickprofile();
		 System.out.println("profile is clicked");
		
		test1.clicksearchbox();
		System.out.println("search is clicked");
		
		test1.sendsearchtbox("Diamond");
		
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	