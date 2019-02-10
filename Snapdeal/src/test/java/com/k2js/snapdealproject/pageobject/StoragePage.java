package com.k2js.snapdealproject.pageobject;

import java.io.IOException;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.k2js.snapdealproject.util.CommonUtil;

public class StoragePage {
	private static WebDriver driver = null;

	public StoragePage(WebDriver driver) {
		this.driver = driver;
	}

	// for counting the number of products from the selected filter
	public int searchProduct1() throws IOException {
		String option = CommonUtil.getPropertyValue("reg", "option1");
		WebDriverWait ww = new WebDriverWait(driver, 50);
		List<WebElement> isChecked = ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
				By.xpath("//p[@class='product-title ' and contains(@title,'" + option + "')]")));
		// WebElement ele=driver.findElement(By.xpath("//p[@class='product-title ' and
		// contains(@title,'"+option+"')]"));
		for (int i = 0; i < 2; i++) {
			System.out.println(isChecked.get(i).getText());
		}
		String option1 = CommonUtil.getPropertyValue("reg", "option2");
		WebDriverWait ww1 = new WebDriverWait(driver, 50);
		List<WebElement> isChecked1 = ww1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
				By.xpath("//p[@class='product-title ' and contains(@title,'" + option1 + "')]")));
		int totalEle = isChecked.size() + isChecked1.size();
		System.out.println("No of products releted to search " + option + " in that page is: " + totalEle);
		return totalEle;

	}

	public int searchProduct2() throws IOException {
		String option = CommonUtil.getPropertyValue("reg", "option3");
		WebDriverWait ww2 = new WebDriverWait(driver, 25);
		List<WebElement> isChecked2 = ww2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(
				"//div[@class='product-row js-product-list centerCardAfterLoadWidgets dp-click-widgets']//p[contains(@title,'"
						+ option + "')]")));
		String option1 = CommonUtil.getPropertyValue("reg", "option4");
		WebDriverWait ww3 = new WebDriverWait(driver, 25);
		List<WebElement> isChecked3 = ww3.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(
				"//div[@class='product-row js-product-list centerCardAfterLoadWidgets dp-click-widgets']//p[contains(@title,'"
						+ option1 + "')]")));
		int totalEle = isChecked2.size() + isChecked3.size();
		System.out.println("No of products releted to search " + option + " in that page is: " + totalEle);
		return totalEle;
	}
}
