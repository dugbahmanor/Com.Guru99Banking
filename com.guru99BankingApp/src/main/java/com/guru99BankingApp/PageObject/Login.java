package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
public static final Logger log=Logger.getLogger(Login.class.getName());
	
	
	
	
	@FindBy(how=How.XPATH,using="//marquee[@class='heading3']")WebElement lblLoginForm;
	@FindBy(how=How.XPATH,using="//input[@name='uid']")WebElement txtLoginUsername;
	@FindBy(how=How.XPATH,using="//input[@name='password']")WebElement txtPassword;
	@FindBy(how=How.XPATH,using="//input[@name='btnReset']")WebElement btnReset;
	@FindBy(how=How.XPATH,using="//input[@name='btnLogin']")WebElement btnSubmit;
	
	public boolean getFormTitleIsDispayed()
	{
		return lblLoginForm.isDisplayed();
	}
	
	public String getFormTitleText()

	{ 
		return lblLoginForm.getText();
	}
	public void getLoginDetail(String name,String pass)
	{
		log.info("==========Enter username into Username field====="+""+name.toString());
		txtLoginUsername.sendKeys(name);
		log.info("=========Enter Password into passwor field======"+""+pass.toString());
		txtPassword.sendKeys(pass);
		
		log.info("====CLicking on the submit======");
		btnSubmit.click();
	}
	
	
	public void getEmail(XSSFRow xssfRow)
	{
		log.info("=====Typing the USername======="+xssfRow.toString());
		txtLoginUsername.sendKeys(String.valueOf(xssfRow));
	}
	public void getEmail(String email)
	{
		log.info("=====Typing the USername======="+ email);
		txtLoginUsername.sendKeys(email);
	}
	public void getPassword(String pass)
	{
		log.info("=====Typing the Password======="+pass.toString());
		txtPassword.sendKeys(pass);
	}
	public void getSubmit()
	{
		log.info("=====Clicking Submit Button=======");
		btnSubmit.click();
	}
	
	public Login(WebDriver driver)
	{
		log.info("=======Initiating Login page Element=========");
		PageFactory.initElements(driver, this);
	}

	public void getPassword(XSSFCell cell) {
		// TODO Auto-generated method stub
		
	}
}
