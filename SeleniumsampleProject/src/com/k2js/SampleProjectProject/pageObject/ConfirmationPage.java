package com.k2js.SampleProjectProject.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {
	private WebDriver driver=null;
	public ConfirmationPage(WebDriver driver) {
		this.driver=driver;
	}
	public String getConfMessage()
	{
		WebElement msg_ele=driver.findElement(By.xpath("//td[p[font[b]]]"));
		return msg_ele.getText();
		
	}
	
	public void clicksignInLink()
	{
		driver.findElement(By.cssSelector("a[href*='mercurysignon']")).click();
		//driver.findElement(By.xpath("//a[@href*='mercurysignon']")).click();
	}
}
