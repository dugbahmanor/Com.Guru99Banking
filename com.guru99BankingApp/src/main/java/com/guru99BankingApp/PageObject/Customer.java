package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import com.guru99BankingApp.Configuration.UtilityLibrary;


public class Customer
{

	public static final Logger log=Logger.getLogger(Customer.class.getName());
	
	
	
	@FindBy(how=How.XPATH,using="//input[@name='name']")WebElement txtCustomername;
	@FindBy(how=How.XPATH,using="//tr[5]//td[2]//input[1]")WebElement rbn_gender_male;
	@FindBy(how=How.XPATH,using="//tr[5]//td[2]//input[2]")WebElement rbn_gender_female;
	@FindBy(how=How.XPATH,using="//input[@id='dob']")WebElement txt_DOB;
	@FindBy(how=How.XPATH,using="//textarea[@name='addr']")WebElement txt_Address;
	@FindBy(how=How.XPATH,using="//input[@name='city']")WebElement txt_city;
	@FindBy(how=How.XPATH,using="//input[@name='state']")WebElement txt_state;
	@FindBy(how=How.XPATH,using="//input[@name='pinno']")WebElement txt_Pin;
	@FindBy(how=How.XPATH,using="//input[@name='telephoneno']")WebElement txt_Mobile_number;
	@FindBy(how=How.XPATH,using="//input[@name='emailid']")WebElement txt_Email;
	@FindBy(how=How.XPATH,using="//input[@name='password']")WebElement txt_password;
	@FindBy(how=How.XPATH,using="//input[@name='sub']")WebElement btn_submit;
	@FindBy(how=How.XPATH,using="")WebElement btn_Reset;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'New Customer')]")WebElement lbl_CreateNewCustomer;
	//@FindBy(how=How.XPATH,using="")WebElement
	
	
	public void getCreateNewCustomer()
	{
		log.info("=====clicking on customer to create new customer========");
		lbl_CreateNewCustomer.click();
	}
	public void getCustomername(String name)
	{
		log.info("=====enter the customer name==========="+" "+name.toString());
		txtCustomername.sendKeys(name);
	}
	public void getGender(String gender)

	{
		if(gender=="m")
		{
			log.info("======customer gender is male====");
			rbn_gender_male.click();
		}
		else
		{

			log.info("=====customer gender is female======");
			rbn_gender_female.click();
		}
	}
	
	
	public void getDOB(String dd,String MM, String yyyy)
	{
		txt_DOB.sendKeys(dd);
		log.info("the day of DOB is = "+dd.toString());
		//getImplicitWait(2);
		txt_DOB.sendKeys(MM);
		txt_DOB.sendKeys(yyyy);
		
	}
	

	public void Address(String address)
	{
		log.info("========Typing the Address of the customer========="+" "+address.toString());
		
	txt_Address.sendKeys(address);
	}
	
	public void Pin(String pin)
	{log.info("========Typing the Pin of the Customer========="+""+pin.toString());
		  txt_Pin.sendKeys(pin);
	}
	  
	public void State(String state)
	{log.info("========Typing the State of The Customer========="+state.toString());
		txt_state.sendKeys(state);
	}
	public void Mobile(String mobile)
	{log.info("=======Typing the Mobile of The Customer =========="+mobile.toString());
		  txt_Mobile_number.sendKeys(mobile);
	}
	public void getEmail(String email)
	{log.info("========Typing the Email of the Customer========="+email.toString());
		txt_Email.sendKeys(email);
	}
	
	public void getPassword(String pass)
	{log.info("========Typing Customer password========="+ ""+pass.toString());
		txt_password.sendKeys(pass);
	}
	
	public void getSubmit()
	{log.info("======Clicking submit button to create new customer===========");
		btn_submit.click();
	}
	
	public void getReset()
	{log.info("=======Clicking Reset button to clear all entry in the newcustomer class==========");
		btn_Reset.click();
	}
	
	public Customer(WebDriver driver)
	
	{
		log.info("============initiating NewCustomer class Element=====");
		PageFactory.initElements(driver, this);
	}
}
