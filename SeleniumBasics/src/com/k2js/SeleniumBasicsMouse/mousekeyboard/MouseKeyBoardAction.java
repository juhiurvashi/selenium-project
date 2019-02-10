package com.k2js.SeleniumBasicsMouse.mousekeyboard;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyBoardAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.seleniumhq.org/download/");
		
		Actions a=new Actions(driver);
		WebElement link_3_5_0=driver.findElement(By.linkText("3.5.0"));
		Action rigthclickaction=a.contextClick(link_3_5_0).build();
		rigthclickaction.perform();
		Action downArrowclick=a.sendKeys(Keys.DOWN).build();
		downArrowclick.perform();
		downArrowclick.perform();
		//a.contextClick(link_3_5_0).perform();
		
		
	}
}
