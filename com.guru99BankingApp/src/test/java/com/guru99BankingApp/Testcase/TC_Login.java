package com.guru99BankingApp.Testcase;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99BankingApp.Configuration.ExcelDataReader;
import com.guru99BankingApp.ExcelReader.ReadExcelData;
import com.guru99BankingApp.PageObject.Login;
import com.guru99BankingApp.Testbase.Testbase;

public class TC_Login extends Testbase
{
	public Login lg;
	public ExcelDataReader excel;
	ReadExcelData exe;
	
	
	@DataProvider(name="kogin")
	public Object[][] getdata(String shtname)
	{
		Object[][] data=exe.getExcelData(shtname);
		return data;
	}
	
	@BeforeClass
	public void setUp() throws Throwable
	{
		Init();
		lg=new Login(driver);
		exe=new ReadExcelData();
		//excel=new ExcelDataReader(null);
		//exe=new ReadExcelData("./Config/Gurubanking.xlsx");
		
	}
	//getlogindata
	@Test(dataProvider="kogin")
	public void LoginWithTestData(String username,String pass)
	{
		
		
	lg.getEmail(username);
		
		lg.getPassword(pass);
		//lg.getEmail(exe.getStringData("Login", 2, 0));
		//lg.getEmail(name);
		//lg.getPaasword(pass);
		//lg.getPaasword(exe.getStringData("Login", 2, 1));
		//System.out.println(name);
		//System.out.println(pass);
		lg.getSubmit();
	
	}
	@AfterTest
	public void tearDown()
	{
	//	getDriverClose();
	}
}
