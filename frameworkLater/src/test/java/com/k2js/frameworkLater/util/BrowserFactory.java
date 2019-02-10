package com.k2js.frameworkLater.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	private static WebDriver driver = null;

	private static WebDriver getbrowser(String bn, String rm) {
		if (rm.equalsIgnoreCase("remote")) {
			if (bn.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".//BrowserExe//chromedriver.exe");
				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setBrowserName("chrome");
				dc.setPlatform(Platform.WINDOWS);
				driver = new ChromeDriver();
			}
		}
		else if(rm.equalsIgnoreCase("local"))
		{
			if(bn.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", ".//BrowserExe//chromedriver.exe");
				driver=new ChromeDriver();
			}
		}
		return driver;
	}
	
	public static WebDriver openBrowser(String bn,String rm)
	{
		if(driver==null)
		{
			getbrowser(bn, rm);
		}
		return driver;
	}
	private static void openURL(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(220,TimeUnit.SECONDS);
	}
}
