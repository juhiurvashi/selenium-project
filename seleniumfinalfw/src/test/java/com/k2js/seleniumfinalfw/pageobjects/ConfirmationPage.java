package com.k2js.seleniumfinalfw.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage {
	private WebDriver driver=null;
	public ConfirmationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath="//td[p[font[b]]]")
	private WebElement sionmsg;
	public String getConfirmationpagetitle()
	{
		return sionmsg.getText();
	}
	
}
