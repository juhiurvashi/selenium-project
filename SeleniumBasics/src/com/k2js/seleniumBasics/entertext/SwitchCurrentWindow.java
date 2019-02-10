package com.k2js.seleniumBasics.entertext;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCurrentWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		String cw=driver.getWindowHandle();
		WebElement frame_ele=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame_ele);
		WebElement button_tryit=driver.findElement(By.xpath("//*[text()='Try it']"));
		button_tryit.click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		TimeUnit.SECONDS.sleep(2);
		//a.accept();
		a.dismiss();
		
		WebElement before_clicking_on_run_ele=driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(before_clicking_on_run_ele.getText());
		driver.switchTo().window(cw);
		driver.findElement(By.xpath("//*[text()='Run »']")).click();
		WebElement frame_ele1=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame_ele1);
		WebElement after_clicking_on_run_ele=driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(after_clicking_on_run_ele.getText()+"**");
		if(after_clicking_on_run_ele.getText().equalsIgnoreCase(""))
		{
				System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
