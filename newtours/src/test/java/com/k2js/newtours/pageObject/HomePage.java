package com.k2js.newtours.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver=null;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getHomePageTitle()
	{
		return driver.getTitle();	
	}
	@FindBy(linkText="REGISTER")
	private WebElement reglink;
	public RegisterPage clickRegLink()
	{
		reglink.click();
		return PageFactory.initElements(driver, RegisterPage.class);
	}
}
