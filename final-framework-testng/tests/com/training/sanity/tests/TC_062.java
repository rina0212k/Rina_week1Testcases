package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.register_dataprovider;
//import com.training.dataproviders.tc062_dataprovider;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.TC1POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC_062 {

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
public void validTC_062Test() {
test1 =new TC1POM(driver);
test1.clickprofile();
//test1.clickaccount();

test1.clickregister();
System.out.println("register button is clicked");
}

@Test(priority=2 , dataProvider = "excel-inputs",dataProviderClass = register_dataprovider.class)
public void Registration_data(String Firstname,String Lastname,String Email,String Telephone,String Address1,String Address2,String city
,String postcode,String country,String region , String password, String confirmpassword)throws Exception{




test1.sendFirstname(Firstname);
System.out.println("first name is entered");
WebDriverWait wait=new WebDriverWait(driver, 30);

test1.sendLastname(Lastname);
System.out.println("last name is entered");
test1.sendEmail(Email); 
System.out.println("email is entered");
test1.sendTelephone(Telephone); 
System.out.println("phone number is entered");
test1.sendAddress1(Address1); 
System.out.println("address1is entered");
test1.sendAddress2(Address2); 
System.out.println("address2is entered");
test1.sendcity(city); 
System.out.println("city is entered");
test1.sendpostcode(postcode);
System.out.println("postcode is entered");
test1.sendcountry(country);
System.out.println("region is entered");
test1.sendregion(region);
System.out.println("region is entered");
test1.sendpassword(password);
System.out.println("password is entered");
test1.sendconfirmpassword(confirmpassword);
System.out.println("confirm is entered");
test1.clickprivacypolicy(); 
System.out.println("privacy policy is clicked");
test1.clickcontinuebtn();
System.out.println("continue button is clicked");

//screenShot.captureScreenShot("First");
}
}

