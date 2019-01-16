package com.training.bean;

/**
 * 
 * @author Naveen
 * @see this class shall get the bean data 
 */
public class RetailBean {
	private String url; 
	private String driver; 
	//private String userName; 
	private String password;
	private String Firstname;
	private String Lastname;
	private String Email;
	private String Telephone;
	private String Address1;
	private String Address2;
	private String city;
	private String postcode;
	private String country;
	private String region;
	private String confirmpassword;
	
	public RetailBean() {}
			
	public RetailBean(String Firstname,String Lastname,String Email,String Telephone,String Address1,String Address2,String city
			,String postcode,String country,String region , String password, String confirmpassword) {
		super();
		this.url = url;
		this.driver = driver;
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		this.Email = Email;
		this.Telephone = Telephone;
		this.Address1 = Address1;
		this.Address2 = Address2;
		this.city = city;
		this.country = country;
		this.region = region;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	/*public String getFirstname() {
		return Firstname;
	}

	public void setUserName(String Firstname) {
		this.Firstname = Firstname;
	}*/

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String Firstname) {
		this.Firstname = Firstname;
	} 
	
	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	} 
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	} 
	
	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String Telephone) {
		this.Telephone = Telephone;
	} 
	
	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	} 
	
	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	} 
	
	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	} 
	
	public String getpostcode() {
		return postcode;
	}

	public void setpostcode(String postcode) {
		this.postcode = postcode;
	} 
	
	public String getcountry() {
		return country;
	}

	public void setcountry(String country) {
		this.country = country;
	} 
	
	public String getregion() {
		return region;
	}

	public void setregion(String region) {
		this.region = region;
	} 
	
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	} 
	
	public String getconfirmpassword() {
		return confirmpassword;
	}

	public void setconfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
		
		@Override
		public String toString() {
		return "RetailBean [Firstname=" + Firstname + ", Lastname=" + Lastname + ", Email=" + Email+ ",Telephone=" + Telephone+ ""
				+ ",Address1=" + Address1 + ", Address2=" + Address2 + ",city=" + city +",postcode=" + postcode + ",country=" + country + ","
						+ "region=" + region + ",password=" + password + ",confirmpassword=" + confirmpassword + "";

	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
