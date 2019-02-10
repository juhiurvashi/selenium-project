package com.k2js.seleniumBasics.entertext;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountWindow {
	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
			driver.findElement(By.xpath("//div/a[@href='tryit.asp?filename=tryjs_confirm']")).click();
			
			
			String currentWindowtitle=driver.getTitle();
			Set<String> allWindow=driver.getWindowHandles();
			System.out.println(allWindow.size());
			Object[] o=allWindow.toArray();
			/*for(Object t:o)
			{
				driver.switchTo().window((String)t);
				System.out.println(driver.getTitle());
				
			}*/
			/*for(int i=o.length-1;i>0;i--)
			{
				driver.switchTo().window((String)o[i]);
				System.out.println(driver.getTitle());
			}
			*/
			/*for(String s:allWindow)
			{
				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
			}*/
			Iterator<String> ite=allWindow.iterator();
			/*String s1=ite.next();
			String s2=ite.next();
			driver.switchTo().window(s2);
			System.out.println(driver.getTitle());
			driver.switchTo().window(s1);
			System.out.println(driver.getTitle());*/
			
			/*for(;ite.hasNext();)
			{
				driver.switchTo().window(ite.next());
				System.out.println(driver.getTitle());
			}*/
			
			List<String> ll = new LinkedList<String>(allWindow);
			/*for(String p:ll)
			{
				driver.switchTo().window(p);
				System.out.println(driver.getTitle());
			}*/
			for(int i=0;i<ll.size();i++){
				driver.switchTo().window(ll.get(i));
				System.out.println(driver.getTitle());
			}
		}
	}
}
