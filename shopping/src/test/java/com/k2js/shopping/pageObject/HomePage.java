package com.k2js.shopping.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver=null;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void action() throws InterruptedException
	{
		WebDriverWait ww=new WebDriverWait(driver, 50);
		WebElement search=ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='w3-bar w3-theme w3-card-2 w3-wide']//div[@class='w3-right']//a[@title='Search W3Schools']//i[@class='fa']")));
		Actions action=new Actions(driver);
		action.moveToElement(search).click().perform();
		WebElement txt=ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@class='gsib_a']//input[@id='gsc-i-id1']")));
		txt.sendKeys("Table");
		WebElement search1=ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='googleSearch']//input[@class='gsc-search-button gsc-search-button-v2']")));
		action.moveToElement(search1).click().perform();
		
		TimeUnit.SECONDS.sleep(5);
		WebElement bootstrap=ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='gsc-results-wrapper-overlay gsc-results-wrapper-visible']//div[@class='gsc-expansionArea']//div[@class='gsc-thumbnail-inside']//a[@class='gs-title' and @href='https://www.w3schools.com/bootstrap/bootstrap_tables.asp']")));
		action.moveToElement(bootstrap).click().perform();
		
	
	}
	public void switchwindow(){
        try {

        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        }catch(Exception e){
        System.out.println( e.getMessage());
        }
    
        }
	public void strippedRows()
	{
		
	   // System.out.println(newWindow.t);
		Actions action=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver,50);
		FluentWait<WebDriver> fw=new FluentWait<WebDriver>(driver);
		fw.withTimeout(60, TimeUnit.SECONDS);
		fw.pollingEvery(5, TimeUnit.SECONDS);
		String newWindow = driver.getWindowHandle();
	    driver.switchTo().window(newWindow);
		WebElement strippedRows=fw.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//p[code[contains(text(),'.table-striped')]]/following-sibling::div[@class='w3-example']//a[@href='tryit.asp?filename=trybs_table_bordered&stacked=h']")));
		action.moveToElement(strippedRows).click().perform();
		switchwindow();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='iframeResult']")));
		WebElement table_ele=driver.findElement(By.xpath("//table//tbody//tr//td[contains(text(),'John')]"));
		System.out.println(table_ele.getText());
	}

}
