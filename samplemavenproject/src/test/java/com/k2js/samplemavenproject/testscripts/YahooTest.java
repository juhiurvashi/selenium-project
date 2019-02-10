package com.k2js.samplemavenproject.testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class YahooTest {
	@Test
	public void search() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement ele_username_txtbox = driver.findElement(By.id("uh-search-box"));
		ele_username_txtbox.sendKeys("test");
		//List<WebElement> linkElements = driver.findElements(By.className("yui3-aclist-item"));
		WebDriverWait ww = new WebDriverWait(driver, 25);
		List<WebElement> linkElements = ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("yui3-aclist-item")));
		System.out.println( linkElements.size() + "size");
		if(linkElements.size()%2==0)
		{
			System.out.println(linkElements.get(linkElements.size()/2-1).getText()+linkElements.get(linkElements.size()/2).getText());
		}
		else
		{
			System.out.println(linkElements.get(linkElements.size()/2).getText());
		}	 
	}
}
