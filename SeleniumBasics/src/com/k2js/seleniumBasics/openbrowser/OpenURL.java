package com.k2js.seleniumBasics.openbrowser;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURL {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http:\\gmail.com");
		/*Navigation n=driver.navigate();
		n.to("http:\\gmail.com");*/
		driver.navigate().to("http:\\google.com");
		driver.navigate().back();
	}
}
