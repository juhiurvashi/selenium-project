package com.k2js.seleniumBasics.openbrowser;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class openIE {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Tools\\selenium_related_sw\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		//driver.close();
	}
}
