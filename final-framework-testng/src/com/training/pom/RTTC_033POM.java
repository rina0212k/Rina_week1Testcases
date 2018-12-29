package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_033POM {
		private WebDriver driver; 
		
		public RTTC_033POM(WebDriver driver) {
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
		
		@FindBy(xpath="//*[@id=\"menu_category_Menu_VIfWm2LT_444\"]/a/span/span")
		private WebElement ethnic; 
		
		@FindBy(xpath="//*[@id=\"ProductsSystem_QQI8r357\"]/div[1]/div[1]/div/div[3]/div/div/div[1]/h4/a")
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
}