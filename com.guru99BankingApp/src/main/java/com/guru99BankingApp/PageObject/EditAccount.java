package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccount
{
	public static final Logger log=Logger.getLogger(EditAccount.class.getName());

	@FindBy(xpath="//p[@class='heading3']")WebElement lblEditAccountForm;

	@FindBy(xpath="//input[@name='accountno']")WebElement txtAccountID;

	@FindBy(xpath="//input[@name='AccSubmit']")WebElement btnSubmit;

	@FindBy(xpath="//input[@name='res']")WebElement  btnReset;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")WebElement lblHome ;
	
	
	public void getSwitchTO(WebDriver driver)
	{
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
	public boolean getVerifyEditAccountPageIsDisplayed()
	{
		log.info("=======Verifying whether EditAccount Form Page is Displayed=====");
		return lblEditAccountForm.isDisplayed();
	}
	
	public String getVerifyDeleteAccountPageMsg()
	{
		log.info("Verifying whether EditAccount Form Page displayed Assert page message====");
		return lblEditAccountForm.getText();
	}
	
	public  void getDeleteFormAccountID(String AccID)
	{log.info("Enter AccountID in EditAccountForm txtAccountID field======="+""+AccID.toString());
	txtAccountID.sendKeys(AccID);
	}
	
	
	public void getDeleteFormSubmit()
	{
		log.info("======Clicking the Submit button on EditAccount form=======");
		btnSubmit.click();
	}
	
	public void getDeleteformReset()
	{log.info("=========Clicking the Reset button on EditAccount Form========");
		btnReset.click();
	}
	public EditAccount(WebDriver driver)
	{
		log.info("=========Initiating EditAccount Form WebDrivers==========");
		PageFactory.initElements(driver, this);
	}

}
