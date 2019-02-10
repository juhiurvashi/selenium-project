package com.k2js.seleniumBasics.entertext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sh {
	public static void main(String[] args) {
		
	
	//System.setProperty("webdriver.chrome.driver","C:\\selenium-2.25.0\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  System.out.println("Done");
    driver.get("https://www.facebook.com");
    System.out.println("Done");
    driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("test");
    System.out.println("Done");
    driver.findElement(By.name("lastname")).sendKeys("test");
    driver.findElement(By.name("reg_email__")).sendKeys("01234567890");
    driver.findElement(By.name("reg_passwd__")).sendKeys("testing");
    Select day = new Select(driver.findElement(By.id("day")));
    day.selectByIndex(3);
    Select month = new Select(driver.findElement(By.id("month")));
    month.selectByIndex(11);
    Select year = new Select(driver.findElement(By.id("year")));
    year.selectByValue("1993");

    driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']//input[@id='u_0_4']")).click();

}}
