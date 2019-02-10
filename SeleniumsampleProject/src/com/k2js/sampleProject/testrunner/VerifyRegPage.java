package com.k2js.sampleProject.testrunner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.k2js.SampleProjectProject.pageObject.ConfirmationPage;
import com.k2js.SampleProjectProject.pageObject.HomePage;
import com.k2js.SampleProjectProject.pageObject.RegPage;
import com.k2js.SampleProjectProject.util.BrowserFactory;
import com.k2js.SampleProjectProject.util.CommonUtil;

public class VerifyRegPage {
	public static void main(String[] args) throws IOException {
		String brn = CommonUtil.getPropertyvalue("config", "bname");
		String run_mode = CommonUtil.getPropertyvalue("config", "rmode");
		String url = CommonUtil.getPropertyvalue("config", "url");

		System.out.println("brn = " + brn + " run Mode = " + run_mode + " url " + url);

		WebDriver driver = BrowserFactory.getBrowser(brn, run_mode);

		BrowserFactory.openURL(url);
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.clickRegLink();

		RegPage rp = PageFactory.initElements(driver, RegPage.class);
		String first_name=CommonUtil.getPropertyvalue("reg", "fn");
		rp.enterFirstName(first_name);
		rp.enterLastName(CommonUtil.getPropertyvalue("reg", "ln"));
		rp.enterPhone(CommonUtil.getPropertyvalue("reg", "ph"));
		rp.enterEmail(CommonUtil.getPropertyvalue("reg", "email"));
		rp.enterAdd(CommonUtil.getPropertyvalue("reg", "add"));
		rp.enterCity(CommonUtil.getPropertyvalue("reg", "city"));
		rp.enterState(CommonUtil.getPropertyvalue("reg", "state"));
		rp.enterPostalcode(CommonUtil.getPropertyvalue("reg", "postalcode"));
		rp.selectCountry(CommonUtil.getPropertyvalue("reg", "cnm"));
		
		rp.enterUsername(CommonUtil.getPropertyvalue("reg", "username"));
		rp.enterPass(CommonUtil.getPropertyvalue("reg", "pass"));
		rp.enterConfirmPass(CommonUtil.getPropertyvalue("reg", "confirmpass"));
		rp.clickSubmitButton();
		ConfirmationPage si=new ConfirmationPage(driver);
		String actual_data=si.getConfMessage();
		//System.out.println(actual_data);
		String exp_data = CommonUtil.getPropertyvalue("confirmation", "msg");
		System.out.println(actual_data+"  == "+exp_data);
		if (actual_data.equalsIgnoreCase(exp_data)) {
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}

	}
}
