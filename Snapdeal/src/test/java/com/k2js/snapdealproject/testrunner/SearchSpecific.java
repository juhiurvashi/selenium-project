package com.k2js.snapdealproject.testrunner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.k2js.snapdealproject.pageobject.SnapdealPage;
import com.k2js.snapdealproject.util.BrowserFactory;
import com.k2js.snapdealproject.util.CommonUtil;

public class SearchSpecific {
	
	//Selecting the filters
	public static void main(String[] args) throws IOException, InterruptedException {
		String brn=CommonUtil.getPropertyValue("config", "bname");
		String run_mode=CommonUtil.getPropertyValue("config", "rmode");
		String url=CommonUtil.getPropertyValue("config", "url");
		WebDriver driver=BrowserFactory.getBrowser(brn, run_mode);
		BrowserFactory.openURL(url);
		SnapdealPage sp=new SnapdealPage(driver);
		sp.clickComputers();
		sp.clickStorage();
		
		sp.selectCapacity1();
		
	}
}
