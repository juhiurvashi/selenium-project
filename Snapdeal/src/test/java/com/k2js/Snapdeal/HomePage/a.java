package com.k2js.Snapdeal.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.treetable.JTreeTable.ListToTreeSelectionModelWrapper;

public class a {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		//driver.quit();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.linkText("Computers & Gaming"));
		ele.click();
		WebElement ele1=driver.findElement(By.linkText("External Hard Drives"));
		ele1.click();
		WebDriverWait ww = new WebDriverWait(driver, 25);
		/*List<WebElement> isChecked = ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy
			(By.xpath("//div[@class='filter-inner filter-inner-height' and @data-name='Capacity_s']//div//a")));*/
		List<WebElement> checkboxEle=driver.findElements(By.xpath("//div[@class='filter-inner filter-inner-height' and @data-name='Capacity_s']//div//a"));
		for(int i=0;i<checkboxEle.size();i++)
		{
			 Actions build = new Actions(driver);
			WebElement eachEle=driver.findElement(By.xpath("//div[@class='filter-inner filter-inner-height' and @data-name='Capacity_s']//div[2]//a"));
			build.moveToElement(eachEle).click().perform();
			System.out.println(eachEle.getText());
			Thread.sleep(1000);
		}
	}}



