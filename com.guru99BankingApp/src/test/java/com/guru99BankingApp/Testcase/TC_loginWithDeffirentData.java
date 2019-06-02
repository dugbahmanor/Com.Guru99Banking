package com.guru99BankingApp.Testcase;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.guru99BankingApp.PageObject.Login;
import com.guru99BankingApp.Testbase.Testbase;

public class TC_loginWithDeffirentData extends Testbase
{
public static final Logger log=Logger.getLogger(TC_loginWithDeffirentData.class.getName());
	public Login lg;
	
	
	@BeforeClass
	public void setUp() throws Throwable
	{
		Init();
		lg=new Login(driver);
	}
	
	@Test
	public void TC_logingTest()
	{
		lg.getLoginDetail(ul.getUserName(), ul.getPassword());
		log.info("");
		Assert.assertEquals("Welcome To Manager's Page of GTPL Bank", lg.getFormTitleText());
	}
}
