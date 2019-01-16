package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.RetailBean;
import com.training.dao.RetailDAO;
import com.training.readexcel.ApachePOIExcelRead;

public class RegisterDBDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<RetailBean> list = new RetailDAO().getRegisteruser(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(RetailBean temp : list){
			Object[]  obj = new Object[12]; 
			obj[0] = temp.getFirstname();
			obj[1] = temp.getLastname();
			obj[2] = temp.getEmail();
			obj[3] = temp.getTelephone();
			obj[4] = temp.getAddress1();
			obj[5] = temp.getAddress2();
			obj[6] = temp.getcity();
			obj[7] = temp.getpostcode();
			obj[8] = temp.getcountry();
			obj[9] = temp.getregion();
			obj[10] = temp.getpassword();
			obj[11] = temp.getconfirmpassword();
			
			result[count ++] = obj; 
		}
	
		
		return result;
	}
}
	