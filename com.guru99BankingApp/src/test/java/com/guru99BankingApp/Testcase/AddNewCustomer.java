package com.guru99BankingApp.Testcase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.guru99BankingApp.Configuration.UtilityLibrary;
import com.guru99BankingApp.PageObject.Customer;
import com.guru99BankingApp.PageObject.Login;
import com.guru99BankingApp.PageObject.Manager;
import com.guru99BankingApp.Testbase.Testbase;

import junit.framework.Assert;

public class AddNewCustomer extends Testbase
{
	private static final Logger log=Logger.getLogger(AddNewCustomer.class.getName());
	
	public Customer cus;
	public Login lg;
	public UtilityLibrary ul;
	public Manager man;

	@BeforeTest
	public void setUp() throws Throwable
	{
		Init();
		cus=new Customer(driver);
		lg=new Login(driver);
		ul=new UtilityLibrary();
		man=new Manager(driver);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAddNewCustomer()
	{
		log.info("login into the application with username= "+ul.getUserName()+"and password  ="+ ul.getPassword());
		lg.getLoginDetail(ul.getUserID(),ul.getPassword());
		
			if (lg.getFormTitleIsDispayed())
			{
				Assert.assertEquals(lg.getFormTitleText(), "Welcome To Manager's Page of Guru99 Bank");
			}
			else
			{
				System.out.print("the element cant be found");
			}
		log.info("calling getimplicitly wait method");
		getImplicitWait(2);
		man.getNewCustomer();

		cus.getCustomername(ul.getUserName());
		cus.getGender("f");
		cus.getDOB(ul.getDay(), ul.getMonth(), ul.getYear());
		cus.getAddress(ul.getAddress());
		cus.getCity(ul.getCity());
		cus.State(ul.getState());
		cus.Mobile(ul.getMobile());
		cus.Pin(ul.getPin());
		cus.getEmail(ul.GetEmail());
		cus.getCreatePass(ul.getCreatePassword());
		cus.getSubmit();
	
			if(cus.getVerifiedSuccessfulMsgIsDisplayed())
			{
				Assert.assertEquals(cus.getSuccessfulRegistrationMsg(), "Customer Registered Successfully!!!");
			}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
	}
}
