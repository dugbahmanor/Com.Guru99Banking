package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatement 
{

	public final static Logger log=Logger.getLogger(MiniStatement.class.getName());
	@FindBy(xpath="//p[@class='heading3']")WebElement lblMiniStatement;
	@FindBy(xpath="//input[@name='accountno']")WebElement txtAccountNoID;
 
	@FindBy(xpath="//input[@name='AccSubmit']")WebElement btnSubmit;
	@FindBy(xpath="//input[@name='res']")WebElement btnReset;
	@FindBy(xpath="//a[contains(text(),'Home')]")WebElement lnkHome;
	
	
	
	public void getHome()
	{
		lnkHome.click();
	}
	
	
	public boolean getMiniStatementForm()
	{
		return lblMiniStatement.isDisplayed();
	}
	
	public void getMiniStatementDetails(String accID)
	{
		txtAccountNoID.sendKeys(accID);
		btnSubmit.click();
	}
	
	public String getMiniStatementformTitle()
	{
		return lblMiniStatement.getText();
	}
	public void getReset()
	{
		btnReset.click();
	}
	public void getSubmit()
	{
		btnSubmit.click();
	}
	
	public MiniStatement(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
}
