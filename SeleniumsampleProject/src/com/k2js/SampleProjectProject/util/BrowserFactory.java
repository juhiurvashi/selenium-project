package com.k2js.SampleProjectProject.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class BrowserFactory {
	private static WebDriver driver = null;

	public static WebDriver getBrowser(String bname, String rm) {
		if (BrowserFactory.driver == null) {
			if (rm.equalsIgnoreCase("remote")) {

			} else if (rm.equalsIgnoreCase("local")) {
				if (bname.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							".\\BrowserExe\\chromedriver.exe");
					BrowserFactory.driver = new ChromeDriver();
				} else if (bname.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver",
							"..\\SeleniumsampleProject\\BrowserExe\\geckodriver.exe");
					BrowserFactory.driver = new FirefoxDriver();

				} else if (bname.equalsIgnoreCase("IE")) {
					System.setProperty("webdriver.ie.driver",
							".\\BrowserExe\\IEDriverServer.exe");
					BrowserFactory.driver = new InternetExplorerDriver();
				} else if (bname.equalsIgnoreCase("Phantom")) {
					System.setProperty("webdriver.phantomjs.driver",
							".\\BrowserExe\\phantomjs.exe");
					BrowserFactory.driver = new PhantomJSDriver();
				}
			}
		}
		return BrowserFactory.driver;

	}
	public static void openURL(String appURL)
	{
		BrowserFactory.driver.get(appURL);
		BrowserFactory.driver.manage().window().maximize();
		BrowserFactory.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
}
