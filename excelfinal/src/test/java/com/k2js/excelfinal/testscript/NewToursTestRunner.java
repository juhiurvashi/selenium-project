package com.k2js.excelfinal.testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.k2js.seleniumfinalfw.pageobjects.ConfirmationPage;
import com.k2js.seleniumfinalfw.pageobjects.HomePage;
import com.k2js.seleniumfinalfw.pageobjects.RegisterPage;
import com.k2js.seleniunfinalfw.util.BrowserFactory;
import com.k2js.seleniunfinalfw.util.CommonUtil;
import com.k2js.seleniunfinalfw.util.ExcelRWUtil;

//@Guice
public class NewToursTestRunner {
	String br_name, run_mode;
	WebDriver driver;
	HomePage hp;
	RegisterPage rp;
	ConfirmationPage cp;

	@Parameters({ "bn", "rm" })
	@BeforeClass
	public void init(@Optional("chrome") String b, @Optional("local") String r) {
		this.br_name = b;
		this.run_mode = r;
	}

	@BeforeMethod
	public void preCondition() throws IOException {
		this.driver = BrowserFactory.openBrowser(br_name, run_mode);
		String url = CommonUtil.getPropertyValue("config", "url");
		BrowserFactory.openURL(url);
		hp = PageFactory.initElements(driver, HomePage.class);
	}

	@Test(dataProvider = "ntd", dataProviderClass = ExcelRWUtil.class)
	public void verifyHomepage(String...td) throws IOException {
		String result="Pass";
		String err_msg="";
		
		try {
			String actualTitle = hp.getHomepagetitle();
			Assert.assertEquals(td[3], actualTitle);
		}
		catch(Throwable e)
		{
			result="fail";
			err_msg=e.getMessage();
			CommonUtil.takeScreenShot(driver);
		}
		finally
		{
			ExcelRWUtil.writeXl(new Integer(td[td.length-1]),17,result);
			ExcelRWUtil.writeXl(new Integer(td[td.length-1]),18,err_msg);
		}
		
	}

	@Test(dataProvider = "ntd", dataProviderClass = ExcelRWUtil.class)
	public void verifyRegisterPage(String... td) throws Throwable {
		String result = "Pass";
		String err_msg = "";
		try {
			rp = hp.clickRegLink();
			rp.enterFirstName(td[0]);
			cp = rp.clickSubmitButton();
			String actualTitle = cp.getConfirmationpagetitle();
			String expTitle = td[td.length - 2];
			System.out.println(expTitle + "**" + actualTitle);

			Assert.assertEquals(expTitle, actualTitle, "Title not Valid");

		} catch (Throwable e) {
			result = "Fail";
			err_msg = e.getMessage();
			CommonUtil.takeScreenShot(driver);
			throw e;
		} finally {
			ExcelRWUtil.writeXl(new Integer(td[td.length - 1]), 17, result);
			ExcelRWUtil.writeXl(new Integer(td[td.length - 1]), 18, err_msg);
		}
		// rp = hp.clickRegLink();
		// String first_name=ExcelRWUtil.storeTestCaseData();

		// String first_name=CommonUtil.getPropertyValue("reg", "fn");
		// rp.enterFirstName(td[0]);
		// rp.enterLastName(CommonUtil.getPropertyValue("reg", "ln"));*/
		/*
		 * rp.enterPhone(CommonUtil.getPropertyValue("reg", "ph"));
		 * rp.enterEmail(CommonUtil.getPropertyValue("reg", "email"));
		 * rp.enterAdd(CommonUtil.getPropertyValue("reg", "add"));
		 * rp.enterCity(CommonUtil.getPropertyValue("reg", "city"));
		 * rp.enterState(CommonUtil.getPropertyValue("reg", "state"));
		 * rp.enterPostalcode(CommonUtil.getPropertyValue("reg", "postalcode"));
		 * rp.selectCty(CommonUtil.getPropertyValue("reg", "cnm"));
		 * rp.enterUsername(CommonUtil.getPropertyValue("reg", "username"));
		 * rp.enterPass(CommonUtil.getPropertyValue("reg", "pass"));
		 * rp.enterConfirmPass(CommonUtil.getPropertyValue("reg", "confirmpass")); cp =
		 * rp.clickSubmitButton(); String actualTitle=cp.getConfirmationpagetitle();
		 * String expTitle=CommonUtil.getPropertyValue("confirmation", "msg");
		 * Assert.assertEquals(expTitle, actualTitle,"Title not Valid");
		 */

	}
	/*
	 * @Test public void verifySignOn() {
	 * 
	 * }
	 * 
	 * @Test public void verifyConfirmationPage() {
	 * 
	 * }
	 */
}
