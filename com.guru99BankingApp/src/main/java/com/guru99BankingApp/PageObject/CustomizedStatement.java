package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizedStatement 
{

	public final static Logger log=Logger.getLogger(CustomizedStatement.class.getName());

	@FindBy(xpath="//p[@class='heading3'")WebElement lblCustomizedStatementForm;
	
	@FindBy(xpath="//input[@name='accountno']")WebElement txtAccountID;
	
	
	@FindBy(xpath="//input[@name='fdate']")WebElement txtFromDate;
	@FindBy(xpath="//input[@name='tdate']")WebElement txtToDate;
	@FindBy(xpath="//input[@name='amountlowerlimit']")WebElement txtMinimumTransactionValue;
	@FindBy(xpath="//input[@name='numtransaction']")WebElement txtNumberOfTransaction;
	
	@FindBy(xpath="//input[@name='AccSubmit']")WebElement btnSubmit;
	@FindBy(xpath="//input[@name='res']")WebElement btnReset;
	@FindBy(xpath="//a[contains(text(),'Home')]")WebElement lblHome;
	
	
	public boolean getVerificationOfCustomizedStatementForm()
	{
		return lblCustomizedStatementForm.isDisplayed();
	}
	
	public String getVerificationOflblCustomizedStatementFormTitleMsg()
	{
		return lblCustomizedStatementForm.getText();
	}
	
	public void getAccountNoID(String accID)
	{
		txtAccountID.sendKeys(accID);
	}
	
	public void getFromDate(String day,String month,String year)
	{
		txtFromDate.sendKeys(day);
		txtFromDate.sendKeys(month);
		txtFromDate.sendKeys(year);
	}
	
	public void getToDate(String day,String month, String year)
	{
		txtToDate.sendKeys(day);
		txtToDate.sendKeys(month);
		txtToDate.sendKeys(year);
	}
	
	public void getMinimumTransactionValue(String value)
	{
		txtMinimumTransactionValue.sendKeys(value);
	}
	
	public void getNummberOfTransaction(String num)
	{
		txtNumberOfTransaction.sendKeys(num);
	}
	
	public void getCustomizedStatementDetails(String frday,String frmonth,String fryear,String today,String tomonth,String toyear)
	{
		txtFromDate.sendKeys(frday);
		txtFromDate.sendKeys(frmonth);
		txtFromDate.sendKeys(fryear);
		
		txtToDate.sendKeys(today);
		txtToDate.sendKeys(tomonth);
		txtToDate.sendKeys(toyear);
		
		btnSubmit.click();
		
	}
	public void getSubmit()
	{
		btnSubmit.click();
	}
	
	public void getReset()
	{
		btnReset.click();
	}
	
	public void getHome()
	{
		lblHome.click();
	}
	
	public CustomizedStatement(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
}
