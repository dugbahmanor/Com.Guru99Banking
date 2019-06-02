package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Balance
{
	public static final Logger log=Logger.getLogger(Balance.class.getName());
	
	@FindBy(how=How.XPATH,using="//input[@name='accountno']")WebElement txtAccountNO;
	@FindBy(how=How.XPATH,using="//input[@name='AccSubmit']")WebElement btnBalSubmit;
	@FindBy(how=How.XPATH,using="//input[@name='res']")WebElement btnBalReset;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Home')]")WebElement lnkHome;
	@FindBy(how=How.XPATH,using="//p[@class='heading3' and text()='Balance Enquiry Form']")WebElement lnk_BalanceEnquiryForm;
	
	public void getAccountNO(String num)
	{
		log.info("==========Entering the Account Number into the text field=========="+""+num.toString());
		txtAccountNO.sendKeys(num);
	}
	
	public void getBalanceSubmit()

{
		
		log.info("=========Clicking on balance submit button ==========");	
		btnBalSubmit.click();
}
	
	public void getBalanceReset()
	{
		log.info("=========Clicking on balance Reset button");
		btnBalReset.click();
	}
	
	public void getHome()
	{
		log.info("======Returning to Home");
	}
}
