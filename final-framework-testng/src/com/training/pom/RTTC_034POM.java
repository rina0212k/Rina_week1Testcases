package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_034POM {
		private WebDriver driver; 
		
		public RTTC_034POM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a")
		private WebElement profile;
		
		@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/ul/li[2]/a/span")
		private WebElement account; 
		
		@FindBy(id="input-email")
		private WebElement userName; 
		
		@FindBy(xpath="//*[@id=\"input-password\"]")
		private WebElement password; 
		
		@FindBy(xpath="//INPUT[@type='submit']")
		private WebElement loginBtn; 
		
		@FindBy(xpath="//*[@id=\"System_nyHsmShk\"]/div[1]")
		private WebElement errormsg; 
		
		@FindBy(xpath="//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Sb0I5\"]/a/span")
		private WebElement shopnowlink; 
		
		@FindBy(xpath="//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Sb0I5\"]/ul/li[1]/a/span")
		private WebElement ethnic; 
		 
		
		@FindBy(xpath="//*[@id=\"ProductsSystem_QQI8r357\"]/div[1]/div[1]/div/div[2]/div[1]/a/span/span/img")
		private WebElement product; 
		
		@FindBy(xpath="//*[@id=\"button-cart\"]")
		private WebElement addtocart; 
		
		@FindBy(xpath="//*[@id=\"cart\"]/ul/li/h3/a/i")
		private WebElement carticon; 
		
		@FindBy(xpath="//*[@id=\"cart\"]/ul/li/div/div/div[3]/a[1]")
		private WebElement viewcart; 
		
		@FindBy(xpath="//*[@id=\"System_V2Exp1o9\"]/div[3]/div[2]/a")
		private WebElement checkout; 
		
		@FindBy(xpath="//*[@id=\"header\"]")
		private WebElement closepop; 
		
		@FindBy(xpath="//*[@id=\"button-payment-address\"]")
		private WebElement continuebuttonforbilling;
		
		@FindBy(id="button-shipping-address")
		private WebElement continuebuttonfordelivery;
		
		@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")
		private WebElement addcomment;
		
		@FindBy(xpath="//*[@id=\"button-shipping-address\"]")
		private WebElement shippingaddressbutton;
		
		
		@FindBy(xpath="//*[@id=\"button-shipping-method\"]")
		private WebElement continuebuttonforshipping;
		
		@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[2]/div[1]/label/input")
		private WebElement agreecheckbox; 
		
		@FindBy(xpath="//*[@id=\"button-payment-method\"]")  
		private WebElement continuebuttonforpaymentmethod;
		
		
		@FindBy(id="button-confirm")
		private WebElement confirmbutton;
		
		//guestpom
		
		@FindBy(xpath="//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[1]/div/div[2]/label/input")
		private WebElement guestcheckoutradiobtn;
		
		@FindBy(xpath="//*[@id=\"button-account\"]")
		private WebElement guestcontinuebtn;
		
		@FindBy(xpath="//*[@id=\"input-payment-firstname\"]")
		private WebElement Firstname; 
		
		@FindBy(xpath="//*[@id=\"input-payment-lastname\"]")
		private WebElement Lastname; 
		
		@FindBy(xpath="//*[@id=\"input-payment-email\"]")
		private WebElement Email; 
		
		@FindBy(xpath="//*[@id=\"input-payment-telephone\"]")
		private WebElement Telephone;
		
		@FindBy(xpath="//*[@id=\"input-payment-address-1\"]")
		private WebElement Address1;
		
		@FindBy(xpath="//*[@id=\"input-payment-city\"]")
		private WebElement city;
		
		@FindBy(xpath="//*[@id=\"input-payment-zone\"]")
		private WebElement region;
		
		@FindBy(xpath="//*[@id=\"button-guest\"]")
		private WebElement bilingdetailsguestcontinue;
		
		@FindBy(xpath="//*[@id=\"collapse-payment-address\"]/div/div[2]/div[1]/label/input")
		private WebElement checkboxaddresssame;
	
		public void clickprofile() {
			this.profile.click();
		}
		
		public void clickaccount() {
			this.account.click();
		}
		
		public void sendemailaddr(String userName) {
			this.userName.clear();
			this.userName.sendKeys(userName);
		}
		
		public void sendpassword(String password) {
			this.password.clear(); 
			this.password.sendKeys(password); 
		}
		
		public void clickloginBtn() {
			this.loginBtn.click(); 
		}
		
		public void verifyerrormsg() {
			this.errormsg.getText();
		}
		public void movetoElementshopnowlink() {
			Actions action = new Actions(driver);
			action.moveToElement(shopnowlink);
			//this.movetoElementcarticon();
			//action.click();
			action.perform();
			
		}
		public void clickethnic() {
			this.ethnic.click(); 
		}
		
		public void clickproduct() {
			this.product.click(); 
			
			
		}
		
		public void clickaddtocart() {
			this.addtocart.click(); 
		}
		
		public void clickclosepop() {
			this.closepop.click(); 
		}
		
		public void movetoElementcarticon() {
			Actions action = new Actions(driver);
			action.moveToElement(carticon);
			//this.movetoElementcarticon();
			//action.click();
			action.perform();
			
		}
		
		public void clickviewcart() {
			this.viewcart.click(); 
		}
		
		public void clickcheckout() {
			this.checkout.click(); 
		}
		
		public void clickcontinuebuttonforbilling() {
			this.continuebuttonforbilling.click(); 
		}
		
		public void clickcontinuebuttonfordelivery() {
			this.continuebuttonfordelivery.click(); 
		}
	
		public void sendaddcomment(String addcomment) {
			//this.addcomment.clear(); 
			this.addcomment.sendKeys(addcomment); 
		}
		public void clickcontinuebuttonforshipping() {
			this.continuebuttonforshipping.click(); 
		}
		
		public void clickagreecheckbox() {
			this.agreecheckbox.click(); 
		}
		
		public void clickcontinuebuttonforpaymentmethod() {
			this.continuebuttonforpaymentmethod.click(); 
		}
		
		public void clickconfirmbutton() {
			this.confirmbutton.click(); 
		}
		
		public void clickshippingaddressbutton() {
			this.shippingaddressbutton.click(); 
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
			//this.region.clear(); 
			this.region.sendKeys(region); 
		}
		public void clickguestcheckoutradiobtn() {
			this.guestcheckoutradiobtn.click(); 
		}
		
		public void clickguestcontinuebtn() {
			this.guestcontinuebtn.click(); 
		}
		
		public void clickbilingdetailsguestcontinue() {
			this.bilingdetailsguestcontinue.click(); 
		}
		
		public void clickcheckboxaddresssame() {
			this.checkboxaddresssame.click(); 
		}
}