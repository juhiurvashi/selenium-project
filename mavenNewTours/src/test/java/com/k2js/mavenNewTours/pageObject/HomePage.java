package com.k2js.mavenNewTours.pageObject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
	private WebDriver driver = null;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getHomePageTitle() {
		
		return driver.getTitle();
	}

}
