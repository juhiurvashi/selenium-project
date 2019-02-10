package com.k2js.seleniumBasics.openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenanyBrowser {
	public static void main(String[] args) {
		String[] fr= {"Firefox","IE","chrome"};
		for(String a:fr)
		{
			if(a.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\geckodriver-v0.18.0-win64\\geckodriver.exe");
				FirefoxDriver driver = new FirefoxDriver();
				driver.close();
			}
			
			else if(a.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
				InternetExplorerDriver driver=new InternetExplorerDriver();
				//driver.close();
			}
			
			else
			{
				 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
			}
		}
	
}
}
