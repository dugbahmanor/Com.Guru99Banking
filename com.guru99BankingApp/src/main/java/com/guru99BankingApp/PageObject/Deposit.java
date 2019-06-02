package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deposit
{
	public static final Logger log=Logger.getLogger(Deposit.class.getName());

	@FindBy(xpath="//p[@class='heading3']")WebElement lblAmountDepositForm;

	@FindBy(xpath="//input[@name='accountno']")WebElement txtAccountID;
	@FindBy(xpath="//input[@name='ammount']")WebElement txtAmount;
	@FindBy(xpath="//input[@name='desc']")WebElement txtDescription;
	
	@FindBy(xpath="//input[@name='AccSubmit']")WebElement btnSubmit;

	@FindBy(xpath="//input[@name='res']")WebElement  btnReset;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")WebElement lblHome ;
	
	
	public boolean getVerifyDepositPageIsDisplayed()
	{
		log.info("=======Verifying whether Deposit Amount Form Page is Displayed=====");
		return lblAmountDepositForm.isDisplayed();
	}
	
	public String getVerifyDepositAmountPageMsg()
	{
		log.info("Verifying whether Deposit Amount Form Page displayed Assert page message====");
		return lblAmountDepositForm.getText();
	}
	
	public  void getDepositAccountNumber(String AccID)
	{log.info("Enter AccountID in Deposit Amount Form txtAccountID field======="+""+AccID.toString());
	txtAccountID.sendKeys(AccID);
	}
	
	public  void getDepositAmount(String amount)
	{log.info("Enter Amount in Deposit Amount Form txtAmount field======="+""+amount.toString());
	txtAccountID.sendKeys(amount);
	}
	
	public  void getDepositDescription(String desc)
	{log.info("Type in the Description in Deposit Amount Form txtDescription field======="+""+desc.toString());
	txtAccountID.sendKeys(desc);
	}
	
	
	
	
	
	public void getDepositFormSubmit()
	{
		log.info("======Clicking the Submit button on Deposit form=======");
		btnSubmit.click();
	}
	
	public void getDepositformReset()
	{
		log.info("=========Clicking the Reset button on Deposit Form========");
		btnReset.click();
	}
	
	
	public void getHome()
	{
		log.info("=========Clicking and Return to Home Page========");
		btnReset.click();
	}
	
	
	
	
	
	
	
	public Deposit(WebDriver driver)
	{
		
		log.info("=====Initiating Deposit Amount Page drivers ======");
		PageFactory.initElements(driver, this);
	}
}
