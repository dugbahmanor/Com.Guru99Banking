package com.guru99BankingApp.Testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.guru99BankingApp.PageObject.Login;
import com.guru99BankingApp.Testbase.Testbase;

public class TC_14 extends Testbase
{
	Login lg;
	@Parameters("browser")
	@BeforeClass()
	public void setUp(String br) throws Throwable
	{
		Init();
		Browserlunch(br);
		lg=new Login(driver);
	}
	
	@Test
	public void LoginToTheApplication() throws Exception
	{
		lg.getLoginDetail(ul.getUserName(), ul.getPassword());
	}
}
