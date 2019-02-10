package com.k2js.samplemavenproject.testscripts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentdateTime {
	public static void main(String[] args) {
		
	// System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			//driver.navigate().to("http://newtours.demoaut.com");
			//driver.manage().window().maximize();
			//this.takeSnapShot(driver, "C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\SaveFiles\\test.png") ; 
			
			System.out.println(CurrentdateTime.getDate()); //2016/11/16 12:08:43

	}
	
	public static String getDate()
	{
		DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy HH_mm_ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
