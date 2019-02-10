package com.k2js.seleniumfinalfw.pageobjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.Page;

public class RegisterPage {
	private WebDriver driver=null;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(name="firstName")
	private WebElement firstname;
	public void enterFirstName(String fn)
	{
		firstname.sendKeys(fn);
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
	@FindBy(xpath="//select//option")
	private List<WebElement>allcntryName;
	public void selectCty(String cn)
	{
		for(WebElement e:allcntryName)
		{
			if(e.getText().trim().equalsIgnoreCase(cn))
			{
				e.click();
			}break;
		}
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
	public ConfirmationPage clickSubmitButton()
	 {
		driver.findElement(By.name("register")).click(); 
		
		return PageFactory.initElements(driver, ConfirmationPage.class);
	 }
}
