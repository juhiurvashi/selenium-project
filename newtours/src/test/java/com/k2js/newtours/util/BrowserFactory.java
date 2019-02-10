package com.k2js.newtours.util;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {
	private static WebDriver driver=null;
	private static WebDriver getBrowser(String bn,String rm) throws IOException
	{
		if(bn=="remote")
		{
			if(rm=="chrome")
			{
				System.setProperty("webdriver.chrome.driver", ".//BrowserExe/chromedriver.exe");
				DesiredCapabilities dc=new DesiredCapabilities();
				dc.setBrowserName("chrome");
				dc.setPlatform(Platform.WINDOWS);
				String client=CommonUtil.getPropertyValue("config","chromeclient");
				driver=new RemoteWebDriver(new URL(client),dc);
			}
			else if(rm=="firefox")
			{
				System.setProperty("webdriver.gecko.driver", ".//BrowserExe/geckodriver.exe");
				DesiredCapabilities dc=new DesiredCapabilities();
				dc.setBrowserName("firefox");
				dc.setPlatform(Platform.WINDOWS);
				String client=CommonUtil.getPropertyValue("config", "firefoxclient");
				driver=new RemoteWebDriver(new URL(client),dc);
			}
			else if(rm=="IE")
			{
				System.setProperty("webdriver.ie.driver", ".//Browser/IEDriverServer.exe");
				DesiredCapabilities dc=new DesiredCapabilities();
				dc.setBrowserName("IE");
				dc.setPlatform(Platform.WINDOWS);
				String client=CommonUtil.getPropertyValue("config", "ieclient");
				driver=new RemoteWebDriver(new URL(client),dc);
			}
		}
		else if(bn=="local")
		{
			if(rm=="chrome")
			{
				System.setProperty("webdriver.chrome.driver", ".//BrowserExe/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(rm=="firefox")
			{
				System.setProperty("webdriver.gecko.driver", ".//BrowserExe/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(rm=="ie")
			{
				System.setProperty("webdriver.ie.driver", ".//BrowserExe/IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
		}
		return driver;
		
	}
	public static WebDriver openBrowser(String bname,String rmode) throws IOException
	{
		if(driver==null)
		{
			BrowserFactory.getBrowser(bname, rmode);
		}
		return driver;
		
	}
	public static void openURL(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
}
