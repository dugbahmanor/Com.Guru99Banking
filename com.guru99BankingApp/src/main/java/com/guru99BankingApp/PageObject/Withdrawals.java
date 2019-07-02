package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Withdrawals
{
	
	public final static Logger log=Logger.getLogger(Withdrawals.class.getName());

	@FindBy(xpath="//p[@class='heading3']")WebElement lblAmountWithdrawalForm;
	@FindBy(xpath="//input[@name='accountno']")WebElement txtAccountNoID;
	@FindBy(xpath="//input[@name='ammount']")WebElement txtAmount;
	@FindBy(xpath=" //input[@name='desc']")WebElement txtDescription;
	@FindBy(xpath="//input[@name='AccSubmit']")WebElement btnSubmit;
	@FindBy(xpath="//input[@name='res']")WebElement btnReset;
	@FindBy(xpath="//a[contains(text(),'Home')]")WebElement lnkHome;
	
	public boolean getVerificationOfWithdrawalForm()
	{
		return lblAmountWithdrawalForm.isDisplayed();
	}

	public String getVerificationOfwithdrawalPageTitlemsg()
	{
		return lblAmountWithdrawalForm.getText();
	}
	
	public void getWithdrawalDetails(String accID,String amt,String desc)
	{
		
		txtAccountNoID.sendKeys(accID);
		txtAmount.sendKeys(amt);
		txtDescription.sendKeys(desc);
		btnSubmit.click();
	}
public Withdrawals(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
