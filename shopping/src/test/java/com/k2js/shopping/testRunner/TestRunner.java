package com.k2js.shopping.testRunner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.k2js.shopping.pageObject.HomePage;
import com.k2js.shopping.utils.BrowserFactory;
import com.k2js.shopping.utils.CommonUtil;


public class TestRunner {
	String br_name,run_mode;
	WebDriver driver;
	HomePage hp;
	@Parameters({"bn","rm"})
	@BeforeClass
	public void init(@Optional("chrome") String b,@Optional("local") String r)
	{
		this.br_name=b;
		this.run_mode=r;
	}
	@BeforeMethod
	public void preCondition() throws IOException
	{
		this.driver=BrowserFactory.openBrowser(br_name, run_mode);
		String url=CommonUtil.getPropertyValue("config", "url");
		BrowserFactory.openURL(url);
		hp=PageFactory.initElements(driver,HomePage.class);
	}
	@Test
	public void verifyHomePage() throws InterruptedException
	{
			hp.action();
			hp.switchwindow();
			hp.strippedRows();
	}
}
