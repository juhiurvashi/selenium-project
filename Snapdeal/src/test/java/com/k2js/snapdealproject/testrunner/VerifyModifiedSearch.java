package com.k2js.snapdealproject.testrunner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.k2js.snapdealproject.pageobject.ModifySearch;
import com.k2js.snapdealproject.pageobject.SnapdealPage;
import com.k2js.snapdealproject.pageobject.StoragePage;
import com.k2js.snapdealproject.util.BrowserFactory;
import com.k2js.snapdealproject.util.CommonUtil;

public class VerifyModifiedSearch {
	
	//for verifying the checkbox,after clearing the filter from the product page whether it is reflecting on check box or not
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
		
		TimeUnit.SECONDS.sleep(5);
		ModifySearch ms=new ModifySearch(driver);
		ms.CapacityUnchecked();
		TimeUnit.SECONDS.sleep(5);
		WebElement b=ms.checkdeselectCapacity1();
		if(b.isSelected())
		{
			System.out.println("uncheck property Didn't work: Fail");
		}
		else
		{
			System.out.println("UnCheck  Property worked:Pass");
		}
	}
}
