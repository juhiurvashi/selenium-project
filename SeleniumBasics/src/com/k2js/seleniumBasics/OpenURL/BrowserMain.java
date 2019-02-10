package com.k2js.seleniumBasics.OpenURL;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BrowserMain {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\TestData\\config.properties");
		Properties p = new Properties();
		p.load(fis);
		String bname = p.getProperty("bn");
		System.out.println(bname);
		String rm = p.getProperty("runmode");
		System.out.println(rm);

		WebDriver n = BrowserFactory.getBrowser(bname, rm);
		n.navigate().to("http://google.com");
	}
}
