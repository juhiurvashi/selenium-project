package com.k2js.seleniumfinalfw.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private static WebDriver driver=null;
	public HomePage(WebDriver dv)
	{
		this.driver=dv;
	}
	public String getHomepagetitle()
	{
		return driver.getTitle();
		
	}
	@FindBy(linkText="REGISTER")
	private WebElement reglink;
	
	/*@FindBy(How=How.LINK_TEXT,using="REGISTER")//works only if it is fixed
	private WebElement reglink1;*/
	
	public RegisterPage clickRegLink()
	{
		reglink.click();
		return PageFactory.initElements(driver, RegisterPage.class);
	}
}
