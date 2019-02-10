package com.k2js.snapdealproject.pageobject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.k2js.snapdealproject.util.BrowserFactory;
import com.k2js.snapdealproject.util.CommonUtil;

public class SnapdealPage {
	private static WebDriver driver = null;

	public SnapdealPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickComputers() {
		WebElement ele = driver.findElement(By.linkText("Computers & Gaming"));
		ele.click();
	}

	public void clickStorage() {
		WebElement ele1 = driver.findElement(By.linkText("External Hard Drives"));
		ele1.click();
	}

	// For selecting the capacity ,choose options
	public void selectCapacity1() throws IOException, InterruptedException {

		String option = CommonUtil.getPropertyValue("reg", "option1");
		WebElement eachElemnt = driver
				.findElement(By.xpath("//div[@data-name='Capacity_s']//label//a[contains(text(),'" + option + "')]"));
		System.out.println("ele name : " + eachElemnt.getText());
		Actions action = new Actions(driver);
		action.moveToElement(eachElemnt).click().perform();
		Thread.sleep(5000);
		String option3 = CommonUtil.getPropertyValue("reg", "option3");

		WebElement eachElemnt1 = driver
				.findElement(By.xpath("//div[@data-name='Capacity_s']//label//a[contains(text(),'" + option3 + "')]"));

		Actions action1 = new Actions(driver);
		action1.moveToElement(eachElemnt1).click().perform();
		System.out.println("ele name : " + eachElemnt1.getText());

	}

}
