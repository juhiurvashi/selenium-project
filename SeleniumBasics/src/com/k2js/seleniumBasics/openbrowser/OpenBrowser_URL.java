package com.k2js.seleniumBasics.openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser_URL {
	public static void main(String[] args) {
		String f = "firefox";
		WebDriver n = OpenBrowser_URL.getBrowser(f);
		n.navigate().to("http://gmail.com");
	}
	private static WebDriver driver=null;
	public static WebDriver getBrowser(String f) {
		if (f.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			OpenBrowser_URL.driver = new FirefoxDriver();
			
		}
		
		else if (f.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			OpenBrowser_URL.driver=new InternetExplorerDriver();
		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
					OpenBrowser_URL.driver = new ChromeDriver();
		}
		return OpenBrowser_URL.driver;
	}
}
