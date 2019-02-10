package com.k2js.sampleProject.testrunner;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingOnMultipleLinks {
	public static void main(String[] args) {
		String baseUrl = "http://newtours.demoaut.com";
		// System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String underConsTitle = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(baseUrl);
		List<WebElement> linkElements = driver.findElements(By.xpath("//tbody[tr[@class='mouseOut']]//a"));

		for (int ii = linkElements.size(); ii > 0; ii--) {
			WebElement eachElemnt = driver.findElement(By.xpath("//tbody/tr[@class='mouseOut'][" + ii + "]//a"));
			System.out.println("ele name : " + eachElemnt.getText());
			eachElemnt.click();
		}

		// for (String t : linkTexts) {
		// driver.findElement(By.linkText(t)).click();
		// if (driver.getTitle().equals(underConsTitle)) {
		// System.out.println("\"" + t + "\"" + "construction.");
		// } else {
		// System.out.println("\"" + t + "\"" + " is working.");
		// }
		// driver.navigate().back();
		// }
		driver.quit();
	}

}
