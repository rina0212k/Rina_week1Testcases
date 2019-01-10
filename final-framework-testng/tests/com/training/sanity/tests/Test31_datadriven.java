package com.training.sanity.tests;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RTTC_031POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Test31_datadriven {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RTTC_031POM test1 ;
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
		File src= new File("C:/selenium Demo/TestData.xlsx");
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);
	String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println("Data from Excel is "+data0);
	}
	
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	//@Test
	/*public void validTest31_datadriven() throws InterruptedException {
	System.out.println("test is called");
		test1 =new RTTC_031POM(driver);
		 test1.clickprofile();
		 System.out.println("profile is clicked");
		//test1.clickaccount();
		System.out.println("login link is clicked");
		Thread.sleep(5000);
		test1.sendemailaddr("invalid@gmail.com");
		test1.sendpassword("manzoor1");*/
	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String userName, String password) {
		test1.clickprofile();
		 System.out.println("profile is clicked");
		test1.sendemailaddr("userName");
		test1.sendpassword("password");
		loginPOM.clickLoginBtn();
	
		
		
				
		//test1.clickloginBtn();
	
		test1.verifyerrormsg();
	}
}
		


