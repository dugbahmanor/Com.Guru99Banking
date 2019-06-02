package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword 
{
	public final static Logger log=Logger.getLogger(ChangePassword.class.getName());
	@FindBy(xpath="//p[@class='heading3']")WebElement lblChangePassword;
	@FindBy(xpath="//input[@name='oldpassword']")WebElement txtOldPassword;
	@FindBy(xpath="//input[@name='newpassword']")WebElement txtNewPassword;
	@FindBy(xpath="//input[@name='confirmpassword']")WebElement txtConfirmPassword;
	@FindBy(xpath="//input[@name='sub']")WebElement btnSubmit;
	@FindBy(xpath="//input[@name='res']")WebElement btnReset;
	@FindBy(xpath="//a[contains(text(),'Home')]")WebElement lblHome;
	
	
	public boolean getChangePasswordFormIsDisplayed()
	{
		return lblChangePassword.isDisplayed();
	}
	
	public String getChangePasswordPageTitleMsg()
	{
		return lblChangePassword.getText();
	}
	
	public void getOldPassword(String oldPass)
	{
		txtOldPassword.sendKeys(oldPass);
	}
	public void getNewPassword(String newPass)
	{
		txtNewPassword.sendKeys(newPass);
	}
	public void getConfirmPassword(String confirmPass)
	{
		txtConfirmPassword.sendKeys(confirmPass);
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
	
	public void getChangePassWord(String oldPass,String newPass,String confirmPass)
	{
		txtOldPassword.sendKeys(oldPass);
		txtNewPassword.sendKeys(newPass);
		txtConfirmPassword.sendKeys(confirmPass);
		btnSubmit.click();
		
	}
	public ChangePassword(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
}
