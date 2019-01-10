package com.training.pom;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categoriespage_adminPOM {
		private WebDriver driver; 
		
		public Categoriespage_adminPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(id="input-username")
		private WebElement username;
		
		@FindBy(id="input-password")
		private WebElement password;
		
		@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
		private WebElement loginBtn;
		
		@FindBy(xpath="//*[@id=\"menu-catalog\"]/a/i")
		private WebElement catalogicon;
		
		@FindBy(xpath="//*[@id=\"menu-catalog\"]/ul/li[1]/a")
		private WebElement categorieslink;
		
		@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a[1]")
		private WebElement addnewicon;
		
		@FindBy(xpath="//*[@id=\"input-name1\"]")
		private WebElement categoryname;
		
		@FindBy(xpath="//*[@id=\"language1\"]/div[2]/div/div/div[3]/div[2]")
		private WebElement description;
		
		@FindBy(xpath="//*[@id=\"input-meta-title1\"]")
		private WebElement Megatab;
		
		@FindBy(xpath="//*[@id=\"input-meta-description1\"]")
		private WebElement Megatabdescription;
		
		
		
		@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button")
		private WebElement savebutton ;
		
		public void sendusername(String username) {
			this.username.clear(); 
			this.username.sendKeys(username); 
		}
		public void sendpassword(String password) {
			this.password.clear(); 
			this.password.sendKeys(password); 
		}
		public void clickloginBtn() {
			this.loginBtn.click();
		}
		
		public void clickcatalogicon() {
			this.catalogicon.click();
		}
		public void clickcategorieslink() {
			this.categorieslink.click();
		}
		public void clickaddnewicon() {
			this.addnewicon.click();
		}
		public void sendcategoryname(String categoryname) {
			this.categoryname.clear(); 
			this.categoryname.sendKeys(categoryname); 
		}
		public void senddescription(String description) {
			this.description.clear(); 
			this.description.sendKeys(description); 
		}
		
		public void sendMegatab(String Megatab) {
			this.Megatab.clear(); 
			this.Megatab.sendKeys(Megatab); 
		}
		public void sendMegatabdescription(String Megatabdescription) {
			this.Megatabdescription.clear(); 
			this.Megatabdescription.sendKeys(Megatabdescription); 
		}
		
		public void clicksavebutton() {
			this.savebutton.click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}