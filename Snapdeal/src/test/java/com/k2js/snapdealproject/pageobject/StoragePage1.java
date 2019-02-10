package com.k2js.snapdealproject.pageobject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.k2js.snapdealproject.util.CommonUtil;

public class StoragePage1 {
	private static WebDriver driver = null;

	public StoragePage1(WebDriver driver) {
		this.driver = driver;
	}

	// for counting the number of products from the selected filter
	public int searchProduct1() throws IOException {
		String option = CommonUtil.getPropertyValue("reg", "option1");
		WebDriverWait ww = new WebDriverWait(driver, 25);
		List<WebElement> isChecked = ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='products']//p[@class='product-title ']")));
		String option1 = CommonUtil.getPropertyValue("reg", "option2");
		WebDriverWait ww1 = new WebDriverWait(driver, 25);
		List<WebElement> isChecked1 = ww1.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[contains(text(),'" + option1 + "')]")));
		
		List<WebElement> ele=ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy
				(By.xpath("//p[@class='product-title ' and contains(@title,'"+option+"')]")));//if 1tb not found  or value not found then count will be 0
		int count = 0;
		for (int i = 0; i < isChecked.size(); i++) {
				count++;
		}

		return count;

	}

	public int searchProduct2() throws IOException {
		String option = CommonUtil.getPropertyValue("reg", "option3");
		WebDriverWait ww = new WebDriverWait(driver, 50);
		List<WebElement> isChecked = ww.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[contains(text(),'" + option + "')]")));
		String option1 = CommonUtil.getPropertyValue("reg", "option4");
		WebDriverWait ww1 = new WebDriverWait(driver, 50);
		List<WebElement> isChecked1 = ww1.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[contains(text(),'" + option1 + "')]")));
		int totalEle = isChecked.size() + isChecked1.size();
		System.out.println(totalEle);
		return totalEle;

	}

}
