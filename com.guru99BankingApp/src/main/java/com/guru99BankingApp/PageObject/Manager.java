package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager 
{
	private WebDriver driver;
	public static final Logger log=Logger.getLogger(Manager.class.getName());

	@FindBy(xpath="//marquee[@class='heading3']")WebElement lnkVerifyManagerPage;
	@FindBy(xpath="//a[contains(text(),'Log out')]")WebElement lbl_LogOut;
	@FindBy(xpath="//a[contains(text(),'New Customer')]") WebElement lblNewCustomer;
	@FindBy(xpath="//a[contains(text(),'Edit Customer')]") WebElement lblEditcustomer;
	@FindBy(xpath="//ul[@class='menusubnav']//a[contains(text(),'Delete Customer')]") WebElement lblDeleteCustomer;
	@FindBy(xpath=" //a[contains(text(),'New Account')]") WebElement lblNewAccount;
	@FindBy(xpath="//a[contains(text(),'Edit Account')]") WebElement lblEditAccount;
	@FindBy(xpath="//a[contains(text(),'Delete Account')]") WebElement lblDeleteAccount;
	@FindBy(xpath="//a[contains(text(),'Mini Statement')]") WebElement lblMiniState;
	@FindBy(xpath="//a[contains(text(),'Customised Statement')]") WebElement lblCustomStatement;
	
	
	public Manager getManager()
	{
		return new Manager(driver);
	}
	
	public void getMiniState()
	{
		lblMiniState.click();
	}
	
	public void getCustomStatement()
	{
		lblCustomStatement.click();
	}
	public void getNewCustomer()
	{
		log.info("=====clicking on New Customer Label=======");
		lblNewCustomer.click();
	}
	
	public void getEditCustomer()
	{
		lblEditcustomer.click();
	}
	
	public void getDeleteCustomer()
	{
		lblDeleteCustomer.click();
	}
	
	
	public void getNewAccount()
	{
		lblNewAccount.click();
	}
	
	public void getEditAccount()
	{
		lblEditAccount.click();
	}
	
	public void getDeleteAccount()
	{
		lblDeleteAccount.click();
	}
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
		this.driver=driver;
		log.info("=======initiating Manager Class Element=======");
		PageFactory.initElements(driver, this);
	}
}
