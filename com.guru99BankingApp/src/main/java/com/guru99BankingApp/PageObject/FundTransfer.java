package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransfer
{

	public static final Logger log=Logger.getLogger(FundTransfer.class.getName());

	@FindBy(xpath="//p[@class='heading3']")WebElement lblFundTransferForm;

	@FindBy(xpath="//input[@name='payersaccount']")WebElement txtPayersaccountNoID;
	@FindBy(xpath="//input[@name='payeeaccount']")WebElement txtPayeesAccountNoID;
	@FindBy(xpath="//input[@name='ammount']")WebElement txtAmount;
	
	@FindBy(xpath="//input[@name='desc']")WebElement txtDescription;
	@FindBy(xpath="//input[@name='AccSubmit']")WebElement btnSubmit;

	@FindBy(xpath="//input[@name='res']")WebElement  btnReset;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")WebElement lblHome ;
	
	
	public boolean getFundTransferVerificationPage()
	{
		return lblFundTransferForm.isDisplayed();
	}
	
	public String getFundTransferVerificationPageMsg(String text)
	{
		return lblFundTransferForm.getText();
	}
	
	
	public void getPayersAccountNoID(String payerID)
	{
		txtPayersaccountNoID.sendKeys(payerID);
	}
	 
	public void getDescription(String desc)
	{
		txtDescription.sendKeys(desc);
	}
	public void getPayeesAccountNoID(String payeeID)
	{
		txtPayeesAccountNoID.sendKeys(payeeID);
	}
	
	public void getAmountToTransfer(String amt)
	{
		txtAmount.sendKeys(amt);
	}
	
	
	public void getHome()
	{
		lblHome.click();
	}
	
	public void getFundTransferReset()
	{
		btnReset.click();
	}
	public void getFundTransferSubmit()
	{
		btnSubmit.click();
	}
	
	public void getPayerID_PayeeID_Amount_Description(String payerID,String payeeID,String Amt,String desc )
	{
		txtPayersaccountNoID.sendKeys(payerID);
		txtPayeesAccountNoID.sendKeys(payeeID);
		txtAmount.sendKeys(Amt);
		txtDescription.sendKeys(desc);
		
	}
	
	public FundTransfer(WebDriver driver)
	{
		log.info("========Initiating FundTransfer page Drivers");
		PageFactory.initElements(driver, this);
	}
	
}
