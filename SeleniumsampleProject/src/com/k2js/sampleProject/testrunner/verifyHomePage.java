package com.k2js.sampleProject.testrunner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.k2js.SampleProjectProject.pageObject.HomePage;
import com.k2js.SampleProjectProject.util.BrowserFactory;
import com.k2js.SampleProjectProject.util.CommonUtil;

public class verifyHomePage {
	public static void main(String[] args) throws IOException {
		String brn = CommonUtil.getPropertyvalue("config", "bname");
		String run_mode = CommonUtil.getPropertyvalue("config", "rmode");
		String url = CommonUtil.getPropertyvalue("config", "url");

		System.out.println("brn = " + brn + " run Mode = " + run_mode + " url " + url);

		WebDriver driver = BrowserFactory.getBrowser(brn, run_mode);
		BrowserFactory.openURL(url);

		HomePage hp = new HomePage(driver);
		String actual_data = hp.getHomepagetitle();
		String exp_data = CommonUtil.getPropertyvalue("home", "exp_title");
		System.out.println(actual_data+"  == "+exp_data);
		if (actual_data.equalsIgnoreCase(exp_data)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
