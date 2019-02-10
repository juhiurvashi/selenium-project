package com.k2js.snapdealproject.testrunner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.k2js.snapdealproject.pageobject.SnapdealPage;
import com.k2js.snapdealproject.pageobject.StoragePage;
import com.k2js.snapdealproject.util.BrowserFactory;
import com.k2js.snapdealproject.util.CommonUtil;

public class VerifyStoragePage {

	// for verifying that whether the filter is displaying product properly or not
	public static void main(String[] args) throws IOException, InterruptedException {
		String brn = CommonUtil.getPropertyValue("config", "bname");
		String run_mode = CommonUtil.getPropertyValue("config", "rmode");
		String url = CommonUtil.getPropertyValue("config", "url");
		WebDriver driver = BrowserFactory.getBrowser(brn, run_mode);
		BrowserFactory.openURL(url);
		SnapdealPage sp = new SnapdealPage(driver);
		sp.clickComputers();
		sp.clickStorage();

		sp.selectCapacity1();

		StoragePage sp1 = new StoragePage(driver);
		int no = sp1.searchProduct1();
		if (no >= 2) {
			System.out.println("Search is more than or equal to 2 so it is Correct for first filter:Pass");
		} else {
			System.out.println("Search is incorrect for first filter:Fail");
		}

		/*
		 * int no1=sp1.searchProduct2(); if(no1>=2) { System.out.
		 * println("Search is more than or equal to 2 so it is Correct for second filter:Pass"
		 * ); } else { System.out.println("Search is incorrect for second Filter:Fail");
		 * }
		 */
	}
}
