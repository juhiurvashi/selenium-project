package com.k2js.samplemavenproject.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	@Test
	public void takeSS() throws IOException
	{
	//public static void main(String[] args) throws IOException {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\SaveFiles\\dd_MM_yyyy HH_mm_ss.png"));
	}
}
