package com.k2js.sampleProject.testrunner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.k2js.SampleProjectProject.pageObject.HomePage;
import com.k2js.SampleProjectProject.pageObject.RegPage;
import com.k2js.SampleProjectProject.pageObject.ConfirmationPage;
import com.k2js.SampleProjectProject.util.BrowserFactory;
import com.k2js.SampleProjectProject.util.CommonUtil;

public class VerifySignInPage {
	public static void main(String[] args) throws IOException {
		String browser_name=CommonUtil.getPropertyvalue("config", "bname");
		String run_mode=CommonUtil.getPropertyvalue("config", "rmode");
		String browser_url=CommonUtil.getPropertyvalue("config", "url");
		System.out.println(browser_name+run_mode+browser_url);
		WebDriver driver=BrowserFactory.getBrowser(browser_name,run_mode);
		//driver.navigate().to(browser_url);
		BrowserFactory.openURL(browser_url);
		
		HomePage hp=new HomePage(driver);
		hp.clickRegLink();
		
		RegPage rp=new RegPage(driver);
		rp.enterFirstName(CommonUtil.getPropertyvalue("reg", "fn"));
		rp.enterLastName(CommonUtil.getPropertyvalue("reg", "ln"));
		rp.enterPhone(CommonUtil.getPropertyvalue("reg", "ph"));
		rp.enterEmail(CommonUtil.getPropertyvalue("reg", "email"));
		rp.enterAdd(CommonUtil.getPropertyvalue("reg", "add"));
		rp.enterCity(CommonUtil.getPropertyvalue("reg", "city"));
		rp.enterState(CommonUtil.getPropertyvalue("reg", "state"));
		rp.enterPostalcode(CommonUtil.getPropertyvalue("reg", "postalcode"));
		rp.enterUsername(CommonUtil.getPropertyvalue("reg", "username"));
		rp.enterPass(CommonUtil.getPropertyvalue("reg", "pass"));
		rp.enterConfirmPass(CommonUtil.getPropertyvalue("reg", "confirmpass"));
		rp.clickSubmitButton();
		
		
		//si.clicksignInLink();
	}		

}
