package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccount 
{

	public static final Logger log=Logger.getLogger(NewAccount.class.getName());

	@FindBy(xpath="//p[@class='heading3']")WebElement lblAddNewAccountForm;

	@FindBy(xpath="//input[@name='cusid']")WebElement txtCustomerID;
	@FindBy(xpath="//select[@name='selaccount']")WebElement cmbAccountType;
	@FindBy(xpath="//input[@name='inideposit']")WebElement txtInitialDeposit;
	
	@FindBy(xpath="/input[@name='button2']")WebElement btnSubmit;

	@FindBy(xpath="//input[@name='reset']")WebElement  btnReset;
	
	@FindBy(xpath=" //a[contains(text(),'Home')]")WebElement lblHome ;
	
	public boolean getVerifyAddNewAccountPageIsDisplayed()
	{
		log.info("=======Verifying whether Add New Account  Form Page is Displayed=====");
		return lblAddNewAccountForm.isDisplayed();
	}
	
	public String getVerifyAddnewAccountPageMsg()
	{
		log.info("Verifying whether Add New Account Form Page displayed Assert page message====");
		return lblAddNewAccountForm.getText();
	}
	
	public  void getAddNewCustomerID(String CustID)
	{
		log.info("Enter CustomerID in Add New Account Form txtCustomerID field======="+""+CustID.toString());
	txtCustomerID.sendKeys(CustID);
	}
	
	public  void getAccountType(String savings,String current)
	{
		Select select=new Select(cmbAccountType);
		
		if(savings.equalsIgnoreCase("savings"))
		{
			log.info("=====Selecting savings Account from the combox Drop down========"+""+cmbAccountType.toString());
			
		select.selectByIndex(0);
		}
		else
		{log.info("=====Selecting Current Account from the drop down========"+""+cmbAccountType.toString());
			select.selectByIndex(1);
		}
	}
	
	public void getInitialDeposit(String amount)
	{log.info("=====Typing the Initial Amount ========"+""+amount.toString());
		txtInitialDeposit.sendKeys(amount);
	}
	

	public void getSubmit()
	{
		log.info("======Clicking the Submit button on Add New Account form=======");
		btnSubmit.click();
	}
	
	public void getDeleteformReset()
	{log.info("=========Clicking the Reset button on Add New Account Form========");
		btnReset.click();
	}
	
	
	public void getHome()
	{log.info("=========Clicking the Home button on Add New Account Form========");
		lblHome.click();
	}
	
	
	
	public NewAccount(WebDriver driver)
	{
		
		log.info("======Initiating NewAccount Page drivers===========");
		PageFactory.initElements(driver, this);
	}
	
}
