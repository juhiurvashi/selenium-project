package com.k2js.SampleProjectProject.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	public void clickRegLink()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
}
