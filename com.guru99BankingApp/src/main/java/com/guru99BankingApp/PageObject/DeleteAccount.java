package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccount 
{

	public static final Logger log=Logger.getLogger(DeleteAccount.class.getName());

	@FindBy(xpath="//p[@class='heading3']")WebElement lblDeleteAccountForm;

	@FindBy(xpath="//input[@name='accountno']")WebElement txtAccountID;

	@FindBy(xpath="//input[@name='AccSubmit']")WebElement btnSubmit;

	@FindBy(xpath="//input[@name='res']")WebElement  btnReset;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")WebElement lblHome ;
	
	
	public boolean getVerifyDeleteAccountPageIsDisplayed()
	{
		log.info("=======Verifying whether Delete Account Form Page is Displayed=====");
		return lblDeleteAccountForm.isDisplayed();
	}
	
	public String getVerifyDeleteAccountPageMsg()
	{
		log.info("======Verifying whether Delete Account Form Page displayed Assert page message====");
		return lblDeleteAccountForm.getText();
	}
	
	public  void getDeleteFormAccountID(String AccID)
	{log.info("=======Enter CustomerID in Delete Account Form txtAccountID field======="+""+AccID.toString());
	txtAccountID.sendKeys(AccID);
	}
	
	
	public void getDeleteFormSubmit()
	{
		log.info("======Clicking the Submit button on Delete Account form=======");
		btnSubmit.click();
	}
	
	public void getDeleteformReset()
	{log.info("=========Clicking the Reset button on Delete Account Form========");
		btnReset.click();
	}
	public DeleteAccount(WebDriver driver)
	{
		log.info("=========Initiating Delete Account Form WebDrivers==========");
		PageFactory.initElements(driver, this);
	}

}
