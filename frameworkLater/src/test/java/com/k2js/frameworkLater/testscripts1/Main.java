package com.k2js.frameworkLater.testscripts1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	private WebDriver driver=null;
	public Main(WebDriver driver1)
	{
		this.driver=driver1;
	}
	public static void main1(){
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
}
