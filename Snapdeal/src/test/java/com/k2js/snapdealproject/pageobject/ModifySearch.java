package com.k2js.snapdealproject.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.k2js.snapdealproject.util.CommonUtil;

public class ModifySearch {
	private static WebDriver driver = null;

	public ModifySearch(WebDriver driver) {
		this.driver = driver;
	}

	// for clear the selected filter
	public void CapacityUnchecked() throws IOException {
		String option3 = CommonUtil.getPropertyValue("reg", "option3");
		WebElement ele = driver
				.findElement(By.xpath("//a[@data-key='Capacity_s|Capacity' and contains(text(),'" + option3 + "')]"));
		ele.click();
	}

	// for checking the checkbox ,in main method we will check whether it is checked
	// or not
	public WebElement checkdeselectCapacity1() throws IOException {
		String option3 = CommonUtil.getPropertyValue("reg", "option3");
		WebElement eachElemnt = driver
				.findElement(By.xpath("//div[@data-name='Capacity_s']//label//a[contains(text(),'" + option3 + "')]"));
		return eachElemnt;
	}
}
