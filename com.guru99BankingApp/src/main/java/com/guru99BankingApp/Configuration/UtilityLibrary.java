package com.guru99BankingApp.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Properties;

import org.apache.log4j.Logger;

public class UtilityLibrary
{
public Properties Pro;
	
public final static Logger log=Logger.getLogger(UtilityLibrary.class.getName());

public String getUrl()
{
	log.info("=====lunching the URL ========"+Pro.getProperty("Url").toString());
	return Pro.getProperty("Url");
}

public String getChromeDriver()
{
	log.info("=========calling ChromeDriver===========");
	return Pro.getProperty("Chrome");
}

public String getFirefoxDriver()
{
	log.info("=========calling FirefoxDriver===========");
	return Pro.getProperty("Firefox");
}
public UtilityLibrary() throws Exception
	{
		File src=new File("./Config/Utility.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			
			Pro=new Properties();
			Pro.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

public String getCreatePassword()
{
	return Pro.getProperty("CreatePassword");
}
public String getIeDriver() {
	// TODO Auto-generated method stub
	return Pro.getProperty("Ie");
}
public String getUserName()
{//////
	log.info("===========fetching Username data from Utility property=============");
	return Pro.getProperty("UserName");
}

public String getUserID()
{//////
	log.info("===========fetching UserID data from Utility property=============");
	return Pro.getProperty("UserID");
}

public String getPassword()
{
	log.info("===========fetching Password data from Utility property=============");

	return Pro.getProperty("Password");
}

public String getDay()
{
	log.info("====Typing day value===="+Pro.getProperty("Day"));
	return Pro.getProperty("Day");
}

public String getMonth()
{
	log.info("====Typing Month value===="+Pro.getProperty("Month"));
	return Pro.getProperty("Month");
}
public String getYear()
{
	log.info("====Typing Year value===="+Pro.getProperty("Year"));
	return Pro.getProperty("Year");
}
public String getPin()
{
	return Pro.getProperty("Pin");
	
}

public String getCity()
{
	return Pro.getProperty("City");
	
}

public String getMobile()
{
	return Pro.getProperty("Mobile");
}
public String getAddress( ) {
	// TODO Auto-generated method stub
	return Pro.getProperty("Address");
}
	
public String GetEmail()
{
	return Pro.getProperty("Email");
}

public String getState() {
	// TODO Auto-generated method stub
	return Pro.getProperty("State");
}




}
