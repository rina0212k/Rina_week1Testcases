package com.training.pom;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E2E_TestcasePOM {
		private WebDriver driver; 
		
		public E2E_TestcasePOM(WebDriver driver) {
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
		
		@FindBy(xpath="//*[@id=\"menu-catalog\"]/ul/li[2]/a")
		private WebElement productslink;
		
		@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a/i")
		private WebElement addnewicon;
		
		@FindBy(xpath="//*[@id=\"input-name1\"]")
		private WebElement productname;
		
		@FindBy(xpath="//*[@id=\"input-meta-title1\"]")
		private WebElement metatagtitle;
		
		@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[2]/a")
		private WebElement datatab;
		
		@FindBy(xpath="//*[@id=\"input-model\"]")
		private WebElement modelnumtextbox;
		
		@FindBy(xpath="//*[@id=\"input-price\"]")
		private WebElement pricetextbox;
		
		@FindBy(xpath="//*[@id=\"input-quantity\"]")
		private WebElement quantitytextbox;
		
		@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[3]/a")
		private WebElement linktab;
		
		@FindBy(xpath="//*[@id=\"input-category\"]")
		private WebElement categoriestextbox;
		
		@FindBy(xpath="//*[@id=\"product-category\"]")
		private WebElement productcategory;
		
		@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[7]/a")
		private WebElement discountab;
		
		@FindBy(xpath="//*[@id=\"discount\"]/tfoot/tr/td[2]/button")
		private WebElement adddiscount;
		
		@FindBy(xpath="//*[@id=\"discount-row0\"]/td[2]/input")
		private WebElement discountquantitytext;
		
		@FindBy(xpath="//*[@id=\"discount-row0\"]/td[4]/input")
		private WebElement discounttabpricetext;
		
		@FindBy(xpath="//*[@id=\"discount-row0\"]/td[5]/div/span/button")
		private WebElement startdate;
		
		@FindBy(xpath="//*[@id=\"discount-row0\"]/td[6]/div/input")
		private WebElement enddate ;
		
		@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[10]/a")
		private WebElement rewardpointtab ;
		
		@FindBy(xpath="//*[@id=\"input-points\"]")
		private WebElement pointstextbox ;
		
		@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button")
		private WebElement savebutton ;
		
		
		@FindBy(xpath="//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Sb0I5\"]/a/span")
		private WebElement shopnowlink; 
		
		@FindBy(xpath="//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Sb0I5\"]/ul/li[1]/a/span")
		
		private WebElement ethnic; 
		
		@FindBy(xpath="//*[@id=\"filter_keyword\"]")
		private WebElement searchbox; 
		
		@FindBy(xpath="/html/body")
		private WebElement jewellery; 
		
		@FindBy(xpath="//*[@id=\"search_button\"]")
		private WebElement searchicon; 
		
		@FindBy(xpath="//*[@id=\"header\"]/ul/li[4]/a")
		private WebElement adminlogout; 
		
		@FindBy(xpath="//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Sb0I5\"]/ul/li[1]/ul/li/a/span")
		private WebElement Earrings;
		
		@FindBy(xpath= "//*[@id=\"search_button\"]")
		private WebElement searchhomepage;
		
		@FindBy(xpath="//*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a")
		private WebElement profile;
		
		
		
		public void clickprofile() {
			this.profile.click();
		}
		
		public void sendusername(String username) {
			this.username.clear(); 
			this.username.sendKeys(username); 
		}
		public void sendpassword(String password) {
			this.password.clear(); 
			this.password.sendKeys(password); 
		}
		
		public void clickcatalogicon() {
			this.catalogicon.click();
		}
		public void clickproductslink() {
			this.productslink.click();
		}
		public void clickaddnewicon() {
			this.addnewicon.click();
		}
		public void sendproductname(String productname) {
			this.productname.clear(); 
			this.productname.sendKeys(productname); 
		}
		public void sendmetatagtitle(String metatagtitle) {
			this.metatagtitle.clear(); 
			this.metatagtitle.sendKeys(metatagtitle); 
		}
		public void clickdatatab() {
			this.datatab.click();
		}
		public void sendmodelnumtextbox(String modelnumtextbox) {
			this.modelnumtextbox.clear(); 
			this.modelnumtextbox.sendKeys(modelnumtextbox); 
		}
		public void sendpricetextbox(String pricetextbox) {
			this.pricetextbox.clear(); 
			this.pricetextbox.sendKeys(pricetextbox); 
		}
		public void sendquantitytextbox(String quantitytextbox) {
			this.quantitytextbox.clear(); 
			this.quantitytextbox.sendKeys(quantitytextbox); 
		}
		public void clicklinktab() {
			this.linktab.click();
		}
		public void clickcategoriestextbox() {
			this.categoriestextbox.click();
		}
		public void clickproductcategory() {
			this.productcategory.click();
		}
		public void clickdiscountab() {
			this.discountab.click();
		}
		public void clickadddiscount() {
			this.adddiscount.click();
		}
		public void senddiscountquantitytext(String discountquantitytext) {
			this.discountquantitytext.clear(); 
			this.discountquantitytext.sendKeys(discountquantitytext); 
		}
		public void senddiscounttabpricetext(String discounttabpricetext) {
			this.discounttabpricetext.clear(); 
			this.discounttabpricetext.sendKeys(discounttabpricetext); 
		}
		/*public void clickstartdate() {
			this.startdate.click();
		}
		public void clickenddate() {
			this.enddate.click();
		}*/
		
		
		public void clickrewardpointtab() {
			this.rewardpointtab.click();
		}
		public void sendpointstextbox(String pointstextbox) {
			this.pointstextbox.clear(); 
			this.pointstextbox.sendKeys(pointstextbox); 
		}
		
		public void clicksavebutton() {
			this.savebutton.click();
		}
		public void clickloginBtn() {
			this.loginBtn.click();
		}
		
		public void clickjewellery() {
			this.jewellery.click();
		}
		
		public void movetoElementethnic() {
			Actions action = new Actions(driver);
			action.moveToElement(ethnic);
			//this.movetoElementcarticon();
			//action.click();
			action.perform();
			
		}
		
		public void movetoElementshopnowlink() {
			Actions action = new Actions(driver);
			action.moveToElement(shopnowlink);
			//this.movetoElementcarticon();
			//action.click();
			action.perform();
			
		}
		
		
		public void movetoElementsearchicon() {
			Actions action = new Actions(driver);
			action.moveToElement(searchicon);
			//this.movetoElementcarticon();
			//action.click();
			action.perform();
			
		}
		
		public void movetoElementsearchhomepage() {
			Actions action = new Actions(driver);
			action.moveToElement(searchhomepage);
			//this.movetoElementcarticon();
			//action.click();
			action.perform();
			
		}
		
		public void clicksearchbox() {
			this.searchbox.click();
		}
		
		public void clicksearchhomepage() {
			this.searchhomepage.click();
		}
		
		
		public void clickEarrings() {
			this.Earrings.click();
		}
		
		public void clickadminlogout() {
			this.adminlogout.click();
		}
		
		public void sendsearchtbox(String searchbox) {
			this.searchbox.clear(); 
			this.searchbox.sendKeys(searchbox); 
		}
		
		public void sendcategoriestextbox(String categoriestextbox) {
			this.categoriestextbox.clear(); 
			this.categoriestextbox.sendKeys(categoriestextbox); 
		}
		
		public void startdate() {
			//to get todays date using Calendar utility and enter as start date 
			Calendar calendar = Calendar.getInstance();
			Date today= calendar.getTime();
			SimpleDateFormat smf = new SimpleDateFormat("yyyy-M-d");
			String currentDate = smf.format(today);
			// selecting todays date in calendar
			this.startdate.sendKeys(currentDate);
			
		}
		
		public void enddate() {
			//Get next date and enter as end date 
			Calendar calendar = Calendar.getInstance();
			//getting current date +1 using calendar utility
			calendar.add(Calendar.DAY_OF_YEAR,1);
			Date tomorrow= calendar.getTime();
			SimpleDateFormat smf = new SimpleDateFormat("yyyy-M-d");
			String nextDate = smf.format(tomorrow);
			this.enddate.sendKeys(nextDate);
		}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
