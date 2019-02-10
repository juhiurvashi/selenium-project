package com.k2js.samplemavenproject.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class OpenSameChromeBrowser {
	public static void main(String[] args) throws IOException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("user-data-dir=C:\\Users\\IBM_ADMIN\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(option);
		driver.navigate().to("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		WebElement link_3_5_0 = driver.findElement(By.linkText("3.5.0"));
		link_3_5_0.click();
		Runtime.getRuntime().exec("C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\SaveFiles\\abc.exe");
		
	}
}
