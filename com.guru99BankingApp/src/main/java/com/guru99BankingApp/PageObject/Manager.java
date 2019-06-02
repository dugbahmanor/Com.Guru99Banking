package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager 
{
	public static final Logger log=Logger.getLogger(Manager.class.getName());

	@FindBy(xpath="//marquee[@class='heading3']")WebElement lnkVerifyManagerPage;
	@FindBy(xpath="//a[contains(text(),'Log out')]")WebElement lbl_LogOut;
	
	public void getLogout()
	{
		log.info("========Clicking logout ============");
		lbl_LogOut.click();
	}
	
	public boolean getManagerVerificationIsDisplayed()
	{
		log.info("====Verify if manager Page is diplayed");
		return lnkVerifyManagerPage.isDisplayed();
		
		
	}
	
	public String getManagerAuthenticationMsg()

{
		log.info("======Authenticate Manager Page =======");
return lnkVerifyManagerPage.getText();		
}
	
	public Manager(WebDriver driver)
	{
		log.info("=======initiating Manager Class Element=======");
		PageFactory.initElements(driver, this);
	}
}
