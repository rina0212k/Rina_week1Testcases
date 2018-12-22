package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC1POM {
		private WebDriver driver; 
		
		public TC1POM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a")
		private WebElement profile;
		
		@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[2]/a/span")
		private WebElement account; 
		
		//@FindBy(xpath= "//*[@id=\"System_nyHsmShk\"]/div/div[1]/div/div[2]/div/a")
		//private WebElement register;
		
		@FindBy(xpath = "//*[@id=\"System_nyHsmShk\"]/div/div[1]/div/a")
		private WebElement register;
		
		@FindBy(xpath="//*[@id=\"input-firstname\"]")
		private WebElement Firstname; 
		
		@FindBy(xpath="//*[@id=\"input-lastname\"]")
		private WebElement Lastname; 
		
		@FindBy(xpath="//*[@id=\"input-email\"]")
		private WebElement Email; 
		
		@FindBy(xpath="//*[@id=\"input-telephone\"]")
		private WebElement Telephone;
		
		@FindBy(xpath="//*[@id=\"input-address-1\"]")
		private WebElement Address1;
		
		@FindBy(xpath="//*[@id=\"input-city\"]")
		private WebElement city;
		
		@FindBy(xpath="//*[@id=\"input-zone\"]")
		private WebElement region;
		
		@FindBy(xpath="//*[@id=\"input-password\"]")
		private WebElement password;
		
		@FindBy(xpath="//*[@id=\"input-confirm\"]")
		private WebElement confirmpassword;
		
		@FindBy(xpath="//*[@id=\"System_nyHsmShk\"]/form/div/div[1]/label/input")
		private WebElement privacypolicy;
		
		@FindBy(xpath="//*[@id=\"System_nyHsmShk\"]/form/div/div[2]/input")
		private WebElement continuebtn;
		
		public void clickprofile() {
			this.profile.click();
		}
		
		public void clickaccount() {
			this.account.click();
		}
		
		public void clickregister() {
			this.register.click();
		}
		
		public void sendFirstname(String Firstname) {
			this.Firstname.clear();
			this.Firstname.sendKeys(Firstname);
		}
		
		public void sendLastname(String Lastname) {
			this.Lastname.clear(); 
			this.Lastname.sendKeys(Lastname); 
		}
		
		public void sendEmail(String Email) {
			this.Email.clear(); 
			this.Email.sendKeys(Email); 
		}
		
		public void sendTelephone(String Telephone) {
			this.Telephone.clear(); 
			this.Telephone.sendKeys(Telephone); 
		}
		
		public void sendAddress1(String Address1) {
			this.Address1.clear(); 
			this.Address1.sendKeys(Address1); 
		}
		
		public void sendcity(String city) {
			this.city.clear(); 
			this.city.sendKeys(city); 
		}
		
		public void sendregion(String region) {
			this.region.clear(); 
			this.region.sendKeys(region); 
		}
		
		public void sendpassword(String password) {
			this.password.clear(); 
			this.password.sendKeys(password); 
		}
		
		public void sendconfirmpassword(String confirmpassword) {
			this.confirmpassword.clear(); 
			this.confirmpassword.sendKeys(confirmpassword); 
		}
		public void clickprivacypolicy() {
			this.privacypolicy.click();
		}
		
		public void clickcontinuebtn() {
			this.continuebtn.click();
		}

	
			
		}
	



