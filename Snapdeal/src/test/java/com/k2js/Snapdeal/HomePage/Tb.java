package com.k2js.Snapdeal.HomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tb {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	//driver.quit();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	WebElement ele=driver.findElement(By.linkText("Computers & Gaming"));
	ele.click();
	WebElement ele1=driver.findElement(By.linkText("External Hard Drives"));
	ele1.click();
	WebElement eachElemnt = driver.findElement(By.xpath("//div[@class='filter-inner filter-inner-height' and @data-name='Capacity_s']//div[1]"));
	eachElemnt.click();
	
}
}
