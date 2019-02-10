package com.k2js.w3School.pageobject;

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
public void mainclass()
{
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.w3schools.com/bootstrap/bootstrap_tables.asp");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	WebDriverWait ww=new WebDriverWait(driver,50);
	Actions action=new Actions(driver);
	WebElement strippedRows=ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='w3-main w3-light-grey']//div[@class='w3-row w3-white']//div[@id='main']//div[@class='w3-example']//a[@href='tryit.asp?filename=trybs_table_striped&stacked=h' and @class='w3-btn w3-margin-top w3-margin-bottom']")));
	action.moveToElement(strippedRows).click().perform();
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	ww.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='iframeResult']")));
	WebElement table_ele=driver.findElement(By.xpath("//table//tbody//tr//td[contains(text(),'John')]"));
	System.out.println(table_ele.getText());
}
}
