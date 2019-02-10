package com.k2js.seleniumBasics.entertext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver f = new ChromeDriver();
		f.manage().window().maximize();
		f.navigate().to("http://newtours.demoaut.com/");
		By name_loc_username_textbox=By.name("userName");
		WebElement ele_username_txtbox=f.findElement(name_loc_username_textbox);
		ele_username_txtbox.sendKeys("Urvashi");
		f.findElement(By.name("password")).sendKeys("Password");
	}
}
