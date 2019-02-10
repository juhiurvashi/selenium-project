package com.k2js.samplemavenproject.testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		WebDriverWait ww = new WebDriverWait(driver, 25);
		WebElement reglink = ww.until(ExpectedConditions.presenceOfElementLocated(By.linkText("REGISTER")));
		reglink.click();

		// C:\Users\IBM_ADMIN\Desktop\selenium\SaveFiles
		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
		fw.withTimeout(25, TimeUnit.SECONDS);
		fw.pollingEvery(5, TimeUnit.SECONDS);
		List<WebElement> cntry_name = fw
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//select/option")));
		for (WebElement e : cntry_name) {
			if (e.getText().trim().equalsIgnoreCase("INDIA")) {
				e.click();
				break;
			}
		}
	}
}
