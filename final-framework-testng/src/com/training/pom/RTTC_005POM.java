package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_005POM {
		private WebDriver driver; 
		
		public RTTC_005POM(WebDriver driver) {
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
		
		@FindBy(xpath="//*[@id=\"System_nyHsmShk\"]/align/ul/li[1]/a")
		private WebElement editinfo;
		
		@FindBy(id="input-firstname")
		private WebElement firstname;
		
		@FindBy(id="input-lastname")
		private WebElement lastname;
		
		@FindBy(id="input-telephone")
		private WebElement telephone;
		
		@FindBy(xpath="//INPUT[@type='submit']")
		private WebElement continueBtn;
		
		
		
		
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
		
		public void clickeditinfo() {
			this.editinfo.click(); 
		}
		
		public void sendfirstname(String firstname) {
			this.firstname.clear(); 
			this.firstname.sendKeys(firstname); 
		}
		
		public void sendlastname(String lastname) {
			this.lastname.clear(); 
			this.lastname.sendKeys(lastname); 
		}
		
		public void sendtelephone(String telephone) {
			this.telephone.clear(); 
			this.telephone.sendKeys(telephone); 
		}
		
		public void clickcontinueBtn() {
			this.continueBtn.click(); 
		}
		
		
		
}