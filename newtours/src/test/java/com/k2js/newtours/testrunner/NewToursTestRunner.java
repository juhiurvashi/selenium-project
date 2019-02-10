package com.k2js.newtours.testrunner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.k2js.newtours.pageObject.HomePage;
import com.k2js.newtours.pageObject.RegisterPage;
import com.k2js.newtours.util.BrowserFactory;
import com.k2js.newtours.util.CommonUtil;

public class NewToursTestRunner {
	String run_mode,br_name;
	WebDriver driver;
	HomePage hp;
	RegisterPage rp;
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
		String url1=CommonUtil.getPropertyValue("config", "url");
		BrowserFactory.openURL(url1);
		hp=PageFactory.initElements(driver, HomePage.class);
	}
	@Test
	public void verifyHomePage() throws IOException
	{
		String actualTitle=hp.getHomePageTitle();
		String expTitle=CommonUtil.getPropertyValue("config", "exp_Title");
		System.out.println(actualTitle);
		System.out.println(expTitle);
		Assert.assertEquals(expTitle, actualTitle,"Title not Valid");
	}
}
