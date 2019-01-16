package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.RetailBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

public class RetailDAO {
	
	Properties properties; 
	
	public RetailDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<RetailBean> getRegisteruser(){
		String sql = properties.getProperty("get.Registeruser"); 
		
		GetConnection gc  = new GetConnection(); 
		List<RetailBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<RetailBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				RetailBean temp = new RetailBean(); 
				temp.setFirstname(gc.rs1.getString(1));
				temp.setLastname(gc.rs1.getString(2));
				temp.setEmail(gc.rs1.getString(2));
				temp.setTelephone(gc.rs1.getString(2));
				temp.setAddress1(gc.rs1.getString(2));
				temp.setAddress2(gc.rs1.getString(2));
				temp.setcity(gc.rs1.getString(2));
				temp.setpostcode(gc.rs1.getString(2));
				temp.setcountry(gc.rs1.getString(2));
				temp.setregion(gc.rs1.getString(2));
				temp.setPassword(gc.rs1.getString(2));
				temp.setconfirmpassword(gc.rs1.getString(2));
				

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new RetailDAO().getRegisteruser().forEach(System.out :: println);
	}
	
	
}
