package com.k2js.seleniumfinalfw.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver=null;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
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
