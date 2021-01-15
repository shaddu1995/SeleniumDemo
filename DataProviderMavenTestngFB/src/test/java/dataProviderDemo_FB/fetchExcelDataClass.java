package dataProviderDemo_FB;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fetchExcelDataClass {

	@Test(dataProvider="getData")
	public void setData(String userName,String pwd) {
		System.out.println("User name"+userName);
		System.out.println("Password"+pwd);

	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data= new Object[3][2];

		//row0
		data[0][0]="user0";
		data[0][1]="password1";
		//row1
		data[1][0]="user1";
		data[1][1]="password1";

		//row2
		data[2][0]="user2";
		data[2][1]="password2";	

		return data;


	}


}
