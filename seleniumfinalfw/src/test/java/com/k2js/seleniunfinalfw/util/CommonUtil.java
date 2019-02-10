package com.k2js.seleniunfinalfw.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonUtil {
	public static String getPropertyValue(String fn, String key) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/"+fn+".properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	public static String getCorrectDate()
	{
		DateFormat dateformat= new SimpleDateFormat("dd_MM_yyyy HH_mm_ss");
		Date date=new Date();
		return dateformat.format(date);
		
	}
	
	public static void takeScreenShot(WebDriver driver) throws IOException
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\SaveFiles\\screenshot.png"));
	}
}
