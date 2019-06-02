package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer
{


	public static final Logger log=Logger.getLogger(DeleteCustomer.class.getName());

	@FindBy(xpath="//p[@class='heading3']")WebElement lblDeleteCustomerForm;

	@FindBy(xpath="//input[@name='cusid']")WebElement txtCustomerID;

	@FindBy(xpath="//input[@name='AccSubmit']")WebElement btnSubmit;

	@FindBy(xpath="//input[@name='res']")WebElement  btnReset;
	
	@FindBy(xpath=" //a[contains(text(),'Home')]")WebElement lblHome ;
	
	
	public boolean getVerifyDeleteCustomerPageIsDisplayed()
	{
		log.info("=======Verifying whether Delete Customer Form Page is Displayed=====");
		return lblDeleteCustomerForm.isDisplayed();
	}
	
	public String getVerifyDeleteCustomerPageMsg()
	{
		log.info("Verifying whether Delete Customer Form Page displayed Assert page message====");
		return lblDeleteCustomerForm.getText();
	}
	
	public  void getDeleteFormCustomerID(String custID)
	{log.info("Enter CustomerID in Delete customer Form txtCustomerID field======="+""+custID.toString());
		txtCustomerID.sendKeys(custID);
	}
	
	
	public void getDeleteFormSubmit()
	{
		log.info("======Clicking the Submit button on Delete Customer form=======");
		btnSubmit.click();
	}
	
	public void getDeleteformReset()
	{log.info("=========Clicking the Reset button on Delete Customer Form========");
		btnReset.click();
	}
	public DeleteCustomer(WebDriver driver)
	{
		log.info("=========Initiating Delete Customer Form WebDrivers==========");
		PageFactory.initElements(driver, this);
	}
}
