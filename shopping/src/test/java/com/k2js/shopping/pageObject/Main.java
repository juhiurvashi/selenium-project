package com.k2js.shopping.pageObject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Main {
@Test
public void mainclass() throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	assertTrue(driver.getTitle()!=null,"Title is not null");
	assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More");
	WebDriverWait ww=new WebDriverWait(driver,50);
	Actions action=new Actions(driver);
	try
	{
		WebElement x=driver.findElement(By.xpath("//div[@class='_3Njdz7']//button[@class='_2AkmmA _29YdH8']"));
		action.moveToElement(x).click().perform();
	}
	catch(Exception e)
	{
		System.out.println("Continue");
	}
	//WebElement deals=ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='_2Umlwf']//a[@class='_2AkmmA _1eFTEo' and @href='/offers-list/deals-of-the-day?screen=dynamic&pk=themeViews%3DDOTD%3AdesktopDefaultDealCard~widgetType%3DdealCard~contentType%3Dneo&wid=3.dealCard.OMU&otracker=hp_omu_Deals+of+the+Day_0']")));
	//action.moveToElement(deals).click().perform();
	WebElement search=driver.findElement(By.xpath("//form[@class='_1WMLwI header-form-search']//input[@title='Search for products, brands and more']"));
	search.click();
	search.sendKeys("harddisk");
	WebElement submit=ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@class='_1WMLwI header-form-search']//button[@type='submit']")));
	action.moveToElement(submit).click().perform();
	WebElement moresize=driver.findElement(By.xpath("//div[@class='_2qUgWb t9PxNv']//div[@class='_1fWl8W']//div[5]//section[@class='_2XJuDa _2Zm4Qh']//div[@class='_1cEG7-']//div[@title='Bank Offer']"));
	action.moveToElement(moresize).click().perform();
	//Thread.sleep(20);
	//driver.quit();
}
}
