package com.guru99BankingApp.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class EditCustomer //extends Testbase
{
public final static Logger log=Logger.getLogger(EditCustomer.class.getName());

@FindBy(xpath="//input[@name='cusid']")WebElement txtCustomerID;
@FindBy(xpath=" //input[@name='AccSubmit']")WebElement btnSubmit;
@FindBy(xpath="//input[@name='res']")WebElement btnReset;
@FindBy(xpath="//a[contains(text(),'Home')]")WebElement lnkHome;


public void getCustomerID(String custid)
{
	log.info("========enter customer id to edit========="+custid.toString());
	txtCustomerID.sendKeys(custid);
}

public void getSubmit()
{
	log.info("==========clicking on submit button to submit customerid===========");
	btnSubmit.click();
}

public void getReset()
{
	log.info("====clicking reset to clear entry and start again===");
	btnReset.click();
}


public void getHome()

{
log.info("===============clicking on Home to return to start page=======");
lnkHome.click();
}

public EditCustomer(WebDriver driver)
{
	log.info("====initiating EditCustomer class element ============ ");
	PageFactory.initElements(driver, this);
}
}
