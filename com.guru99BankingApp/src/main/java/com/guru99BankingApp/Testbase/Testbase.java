package com.guru99BankingApp.Testbase;


import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.guru99BankingApp.Configuration.ExcelDataReader;
import com.guru99BankingApp.Configuration.UtilityLibrary;
import com.guru99BankingApp.ExcelReader.ReadExcelData;

public class Testbase
{

	public static final Logger log=Logger.getLogger(Testbase.class.getName());
	public  UtilityLibrary ul;//=new  UtilityLibrary();
	public ReadExcelData excel;
	public void Init() throws Throwable
	{
		String log4jpath="Log4j.properties";
		PropertyConfigurator.configure(log4jpath);
		 ul=new UtilityLibrary();
		 excel=new ReadExcelData();
		 Browserlunch("chrome");
	}
	
	
	
	public static WebDriver driver ;
	
	public void getAlert()
	{
		//Alert art =new Alert();
	}
	public  WebDriver Browserlunch(String name)
	{
		if(name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ul.getChromeDriver());
			driver=new ChromeDriver();
		}
		else if(name.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",ul.getFirefoxDriver());
			driver=new FirefoxDriver();
		}
		else if(name.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", ul.getIeDriver());
			driver=new InternetExplorerDriver();
		}
		
		driver.get(ul.getUrl());
		getImplicitWait(2);
		driver.manage().window().maximize();
		getImplicitWait(1);
		return driver;
	}
	public void getDriverClose()
	{
		driver.close();
	}
	public static void getImplicitWait(int sec)
	{
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
public Object[][] getData(String sheetname) throws Exception
{
	//String path="./Config/"+excelname;
	//excel=new ReadExcelData();
	Object[][] data=excel.getExcelData(sheetname);
	return data;
	
}
}
