package com.k2js.seleniumBasics.openbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openChromeBrowser {
	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.close();//
	}
}
