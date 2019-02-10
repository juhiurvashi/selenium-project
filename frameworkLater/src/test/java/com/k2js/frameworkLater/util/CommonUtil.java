package com.k2js.frameworkLater.util;

import java.io.File;
import java.io.FileInputStream;
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
	public static String getpropertyValue(String fn,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./testData/"+fn+".properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	public static String getTimeDate()
	{
		DateFormat dateFormat=new SimpleDateFormat("dd_MM_yyyy HH_mm_ss");
		Date date=new Date();
		return dateFormat.format(date);
	}
	
	public static void takesScreenshot(WebDriver driver) throws IOException
	{
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File(""));
	}
}
