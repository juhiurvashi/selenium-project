package com.k2js.seleniumBasics.OpenURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.k2js.seleniumBasics.openbrowser.OpenBrowser_URL;

public class BrowserFactory {

	private static WebDriver driver = null;

	public static WebDriver getBrowser(String bname, String rm) {
		if (driver == null) {

			if (rm.equalsIgnoreCase("Remote")) {

			} else if (rm.equalsIgnoreCase("local")) {
				if (bname.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver",
							"C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\geckodriver-v0.18.0-win64\\geckodriver.exe");
					BrowserFactory.driver = new FirefoxDriver();
				} else if (bname.equalsIgnoreCase("IE")) {
					System.setProperty("webdriver.ie.driver",
							"C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
					BrowserFactory.driver = new InternetExplorerDriver();
				}
			}
		}
		return BrowserFactory.driver;

	}

}
