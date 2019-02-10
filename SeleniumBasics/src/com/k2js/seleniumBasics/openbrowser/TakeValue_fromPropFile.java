package com.k2js.seleniumBasics.openbrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TakeValue_fromPropFile {
 public static void main(String[] args) throws IOException {
	//FileInputStream fis=new FileInputStream("C:\\Users\\IBM_ADMIN\\Desktop\\selenium\\Practicals\\SeleniumPracticals\\SeleniumBasics\\TestData\\config.properties");//\\.TestData\\config.properties
	//FileInputStream fis=new FileInputStream(".\\TestData\\config.properties");
	FileInputStream fis=new FileInputStream("..\\SeleniumBasics\\TestData\\config.properties");
	Properties p=new Properties();
	p.load(fis);
	String bname=p.getProperty("bn");
	String rm=p.getProperty("runmode");
	System.out.println(bname+"\t  "+rm);
	
}
}
