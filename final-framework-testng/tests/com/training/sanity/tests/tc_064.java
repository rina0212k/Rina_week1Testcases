package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.categories_DataProviders;
import com.training.dataproviders.register_dataprovider;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.Categoriespage_adminPOM;
import com.training.pom.Categoriespage_adminPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class tc_064 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private Categoriespage_adminPOM test1 ;
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
	
	
	
	
	
	@Test(priority=1)
	public void validtc_064Test() {
		 test1 =new Categoriespage_adminPOM(driver);
		test1.sendusername("admin");
		test1.sendpassword("admin@123");
		
		test1.clickloginBtn();
		test1.clickcatalogicon();
		System.out.println("catalogicon clicked");
		
		test1.clickcategorieslink();
		System.out.println("products is clicked");
		
		test1.clickaddnewicon();
		System.out.println("addnewicon is clicked");
	}
	@Test(priority=2 , dataProvider = "excel-inputs",dataProviderClass = categories_DataProviders.class)
	public void multiple_categories(String categoryname,String description,String Megatab,String Megatabdescription)throws Exception{
		
		test1.sendcategoryname(categoryname);
		System.out.println("categoryname is entered");
		test1.senddescription(description);
		System.out.println("desription is entered");
		test1.sendMegatab(Megatab);
		System.out.println("mega tab is entered");
		test1.sendMegatabdescription(Megatabdescription);
		System.out.println("megatab description is entered");
		test1.clicksavebutton();
		System.out.println("save is clicked");
		
		//screenShot.captureScreenShot("First");


		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		