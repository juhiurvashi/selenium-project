package com.k2js.Snapdeal.HomePage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.k2js.snapdealproject.util.CommonUtil;

public class b {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		// driver.quit();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.linkText("Computers & Gaming"));
		ele.click();
		WebElement ele1 = driver.findElement(By.linkText("External Hard Drives"));
		ele1.click();
		WebDriverWait ww = new WebDriverWait(driver, 25);
		List<WebElement> isChecked = ww.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='filter-inner filter-inner-height' and @data-name='Capacity_s']//div//a")));
		
		WebElement element=driver.findElement(By.xpath(
				"//div[@class='filter-inner filter-inner-height' and @data-name='Capacity_s']//div[1]//a"));
		element.click();
		/*WebDriverWait ww1 = new WebDriverWait(driver, 25);
		List<WebElement> isChecked1 = ww.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='filter-inner filter-inner-height' and @data-name='Capacity_s']//div//a")));
		
		WebElement element1=driver.findElement(By.xpath(
				"//div[@class='filter-inner filter-inner-height' and @data-name='Capacity_s']//div[4]//a"));
		element1.click();*/
		/*System.out.println(isChecked.size());
		//String option3 = CommonUtil.getPropertyValue("reg", "option3");
		int i = 0;
		String[] linkTexts = new String[isChecked.size()];
		for (WebElement ele11 : isChecked) {
			linkTexts[i] = ele11.getText();
			System.out.println(linkTexts[i]);
			i++;
		}
		for (int j = 0; j < isChecked.size(); j++) {
			if (linkTexts[j].equals("3 TB")) {
				WebDriverWait ww1 = new WebDriverWait(driver, 25);
				List<WebElement> isChecked1 = ww1.until(ExpectedConditions
						.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='filter-inner filter-inner-height' and @data-name='Capacity_s']//div//a")));
				System.out.println("true" + j);
				WebElement element=driver.findElement(By.xpath(
						"//div[@class='filter-inner filter-inner-height' and @data-name='Capacity_s']//div//a"));
				isChecked.get(j).click();
			}
		}*/
	}
}
