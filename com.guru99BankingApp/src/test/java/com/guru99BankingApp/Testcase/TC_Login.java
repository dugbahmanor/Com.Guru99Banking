package com.guru99BankingApp.Testcase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
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
	/*
	@DataProvider(name="Login")
	public String[][] getstringdata(String sheetname,String excelname) throws IOException
	{
		excelname="Gurubanking.xlsx";
		
		//String [][] dataset=exe.getMultiData("Login","./Config/Gurubanking.xlsx");
		//return dataset;
	}
	
	@DataProvider(name="login")
public String[][] getlogindata(String shtname,String excel) throws FileNotFoundException
{
		String [][] data=getData("Login","Gurubanking.xlsx");
		return data;
	
}

	@DataProvider(name="login")
	public String  getLogin(String name,String excel)
	{
		//String data=exe.getCellData("Login", "Gurubanking.xlsx");
		//return data;
	}*/
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
	@Test(dataProvider="Login")
	public void LoginWithTestData(String name,String pass)
	{
		lg.getEmail(name);
		lg.getPaasword(pass);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		getDriverClose();
	}
}
