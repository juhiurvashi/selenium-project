package com.k2js.Snapdeal.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public static void main(String[] args) {
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
		List<WebElement> isChecked = ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//label[a[@href='https://"
				+ "www.snapdeal.com/products/computers-external-hard-drives/"
				+ "filters/Capacity_s~1%20TB#bcrumbLabelId:53']]")));
		System.out.println(isChecked.size());
		//WebElement selectTB=driver.findElement(By.xpath(""));
		for(int i=0;i<2;i++)
		{
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			//WebElement eachElemnt = driver.findElement(By.xpath("//label[a[@href='https://www.snapdeal.com/products/computers-external-hard-drives/"
					//+ "filters/Capacity_s~1%20TB#bcrumbLabelId:53']]"));
			isChecked.get(i).click();
		//	System.out.println("ele name : " +isChecked.g
			//eachElemnt.click();
		}
		
		
	}
	
}
