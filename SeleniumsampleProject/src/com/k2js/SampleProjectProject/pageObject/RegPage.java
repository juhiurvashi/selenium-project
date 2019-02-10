package com.k2js.SampleProjectProject.pageObject;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.k2js.SampleProjectProject.util.CommonUtil;
import com.k2js.SampleProjectProject.util.ElementFinder;

public class RegPage {
	private WebDriver driver = null;

	public RegPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterFirstName(String fn)
	{
		driver.findElement(By.name("firstName")).sendKeys(fn);
	}
	public void enterLastName(String ln)
	{
		driver.findElement(By.name("lastName")).sendKeys(ln);
	}
	public void enterPhone(String ph)
	{
		driver.findElement(By.name("phone")).sendKeys(ph);
	}
	public void enterEmail(String email)
	{
		driver.findElement(By.name("userName")).sendKeys(email);
	}
	public void enterAdd(String add)
	{
		driver.findElement(By.name("address1")).sendKeys(add);
	}
	public void enterCity(String city1)
	{
		driver.findElement(By.name("city")).sendKeys(city1);
	}
	public void enterState(String state1)
	{
		driver.findElement(By.name("state")).sendKeys(state1);
	}
	public void enterPostalcode(String postal)
	{
		driver.findElement(By.name("postalCode")).sendKeys(postal);
	}
	public void selectCountry(String cnm) throws IOException
	{
		String cnty_nm=CommonUtil.getPropertyvalue("reg", "cn_loc");
		WebElement ele=ElementFinder.getElement(driver,cnty_nm);
		//1st way
		//Select s=new Select(ele);
		//s.selevtByVisibleText(cnm);
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText(cnm);
		//drpCountry.selectByVisibleText("ANTARTICA");
		//assertTrue(drpCountry.Text.con,cnm);
		Assert.assertTrue(driver.findElement(By.name("country")).getText().contains(cnm));
		System.out.println("Assert Pass");
		
		//2nd way,using list and Webdriver
		/*String cnty_nm2=CommonUtil.getPropertyvalue("register", "cn_lc");
		List<WebElement> allCntry=driver.findElements(By.xpath("//Select/option"));
		for(WebElement cntr:allCntry)
		{
			if(cntr.getText().trim().equalsIgnoreCase(cnm))
			{
				cntr.click();
				break;
			}
		}*/
		/*String cnty_nm3=CommonUtil.getPropertyvalue("reg", "cn_loc");
		WebElement ele4=ElementFinder.getElement(driver, cnty_nm3);
		String cnty_nm4=CommonUtil.getPropertyvalue("reg", "all_cn_loc");
		List<WebElement> allCntry=ElementFinder.getElement(driver, cnty_nm4);
		for(int i=0;i<allCntry.size();i++)
		{
			if(allCntry.get(i).getText().trim().equalIgnorecase(cnm))
			{
				allCntry.get(i).click();
				break;
			}
		}
		*/
	}
	public void enterUsername(String Uname)
	{
		driver.findElement(By.name("email")).sendKeys(Uname);
	}
	public void enterPass(String pass1)
	{
		driver.findElement(By.name("password")).sendKeys(pass1);
	}
	public void enterConfirmPass(String confirmPass)
	{
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmPass);
	}
	public void clickSubmitButton()
	 {
		driver.findElement(By.name("register")).click(); 
	 }
}
