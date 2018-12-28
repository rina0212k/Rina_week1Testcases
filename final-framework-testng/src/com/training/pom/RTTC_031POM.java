package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_031POM {
		private WebDriver driver; 
		
		public RTTC_031POM(WebDriver driver) {
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
		
		//@FindBy(id="//*[@id=\"System_nyHsmShk\"]/div/div[2]/div/form/div/div[2]/input")
		//private WebElement loginBtn;
		
		//@FindBy(xpath="//a[@href='http://retail.hommelle.com/account/login']//span[@class='tb_text']")
		//private WebElement login; 

		
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
		
}