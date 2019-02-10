package com.k2js.seleniumBasics.maximize;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.k2js.seleniumBasics.OpenURL.BrowserFactory;

public class MaximizeBrowser {
	public static void main(String[] args) {
		WebDriver driver=BrowserFactory.getBrowser("firefox", "local");
		/*Option o=driver.manage();
		Window w=o.window();*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
}
