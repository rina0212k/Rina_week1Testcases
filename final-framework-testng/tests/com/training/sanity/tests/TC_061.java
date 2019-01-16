package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.RegisterDBDataProviders;
//import com.training.dataproviders.tc062_dataprovider;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.TC1POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC_061 {

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



/*@AfterMethod
public void tearDown() throws Exception {
Thread.sleep(1000);
driver.quit();
}*/
@Test(priority=1)
public void validTC_061Test() {
test1 =new TC1POM(driver);
test1.clickprofile();
//test1.clickaccount();

test1.clickregister();
System.out.println("register button is clicked");
}

@Test(priority=2 , dataProvider = "db-inputs",dataProviderClass = RegisterDBDataProviders.class)
public void Registration_data(String Firstname,String Lastname,String Email,String Telephone,String Address1,String Address2,String city
,String postcode,String country,String region , String password, String confirmpassword)throws Exception{




test1.sendFirstname("sunil");
System.out.println("first name is entered");
//Verify first name matches with Database
//WebDriverWait wait=new WebDriverWait(driver, 30);
String Actualtext = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "Firstname");
System.out.println("Values of Email Matched");

test1.sendLastname("nagaraj");
//Verify first name matches with Database
System.out.println("last name is entered");
String Actualtext1 = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "Lasttname");
System.out.println("Lastname is Matched");


test1.sendEmail("sunil2@gmail.com"); 
System.out.println("email is entered");
//Verify email matches with Database
String Actualtext2 = driver.findElement(By.xpath("//*[@id=\"input-email\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "Email");
System.out.println("email is Matched");


test1.sendTelephone("234567898"); 
System.out.println("phone number is entered");
//Verify Telephone matches with Database
String Actualtext3 = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "Telephone");
System.out.println("Telephone is Matched");


test1.sendAddress1("yeshwanthapur"); 
System.out.println("address1is entered");
//Verify Address1 matches with Database
String Actualtext4 = driver.findElement(By.xpath("//*[@id=\"input-address-1\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "Address1");
System.out.println("Address1 is Matched");


test1.sendAddress2("bangalore"); 
System.out.println("address2is entered");
//Verify Address2 matches with Database
String Actualtext5 = driver.findElement(By.xpath("//*[@id=\"input-address-2\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "Address2");
System.out.println("Address2 is Matched");

test1.sendcity("bangalore"); 
System.out.println("city is entered");
//Verify city matches with Database
String Actualtext6 = driver.findElement(By.xpath("//*[@id=\"input-city\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "city");
System.out.println("city is Matched");

test1.sendpostcode("560022");
System.out.println("postcode is entered");
//Verify postcode matches with Database
String Actualtext7 = driver.findElement(By.xpath("//*[@id=\"input-postcode\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "postcode");
System.out.println("postcode is Matched");


test1.sendcountry("India");
System.out.println("country is entered");
//Verify country matches with Database
String Actualtext8 = driver.findElement(By.xpath("//*[@id=\"input-country\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "country");
System.out.println("country is Matched");


test1.sendregion("Karnataka");
System.out.println("region is entered");
//Verify region matches with Database
String Actualtext9 = driver.findElement(By.xpath("//*[@id=\"input-zone\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "region");
System.out.println("region is Matched");

test1.sendpassword("manipal");
System.out.println("password is entered");
//Verify password matches with Database
String Actualtext10 = driver.findElement(By.xpath("//*[@id=\"input-password\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "password");
System.out.println("password is Matched");

test1.sendconfirmpassword("manipal");
System.out.println("confirmpassword is entered");
//Verify confirm matches with Database
String Actualtext11 = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).getAttribute("value");
Assert.assertEquals(Actualtext, "confirmpassword");
System.out.println("confirmpassword is Matched");


test1.clickprivacypolicy(); 
System.out.println("privacy policy is clicked");


test1.clickcontinuebtn();
System.out.println("continue button is clicked");

//screenShot.captureScreenShot("First");
}
}

