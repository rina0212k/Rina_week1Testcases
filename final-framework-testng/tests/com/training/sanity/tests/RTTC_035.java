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
import com.training.pom.RTTC_035POM;
import com.training.pom.RTTC_035POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_035 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RTTC_035POM test1 ;
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
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validRTTC_035Test() throws InterruptedException {
		 test1 =new RTTC_035POM(driver);
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
		test1.sendproductname("Finger ring");
		System.out.println("product name entered");
		Thread.sleep(3000);
		test1.sendmetatagtitle("FINGER RING FOR LADIES");
		System.out.println("megatag entered");
		Thread.sleep(3000);
		test1.clickdatatab();
		System.out.println("data is clicked");
		Thread.sleep(3000);
		test1.sendmodelnumtextbox("SKU-012");
		System.out.println("model num entered");
		Thread.sleep(3000);
		test1.sendpricetextbox("500");
		System.out.println("proce entered");
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
		test1.clickproductcategory();
		System.out.println("product is clicked");
		Thread.sleep(3000);
		test1.clickdiscountab();
		System.out.println("discount is clicked");
		Thread.sleep(3000);
		test1.clickadddiscount();
		System.out.println("adddiscount is clicked");
		Thread.sleep(3000);
		test1.senddiscountquantitytext("1");
		System.out.println("quantity added");
		Thread.sleep(3000);
		test1.senddiscounttabpricetext("50");
		System.out.println("discount proce entered");
		Thread.sleep(3000);
		//test1.clickstartdate();
		test1.startdate();
		System.out.println("startdate is clicked");
		Thread.sleep(3000);
		test1.enddate();
		//test1.clickenddate();
		System.out.println("end datet is entered");
		Thread.sleep(3000);
		test1.clickrewardpointtab();
		System.out.println("reward is clicked");
		Thread.sleep(3000);
		test1.sendpointstextbox("20");
		System.out.println("points clicked");
		Thread.sleep(3000);
		test1.clicksavebutton();
		System.out.println("save is clicked");
		Thread.sleep(3000);
	}
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	