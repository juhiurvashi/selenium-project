package com.k2js.TestNGsample.module1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTestRunner {
	@Parameters({"bn","rm","url"})
	@BeforeClass
	public void getEnterData(@Optional("Chrome") String b,@Optional("local") String r,@Optional("http://google.com") String u)
	{
		System.out.println("Read data from properties file,Run rowser name, add url,add run mode");
		System.out.println("send data to browser factory and get driver ");
	}
	static int i=1;
	@BeforeMethod(groups= {"Smoke"})
	public void precondition()
	{
		System.out.println("......................");
		System.out.println("Starting TC"+ i);
		/*System.out.println("Read data from properties file,Run browser name, add url,add run mode");
		System.out.println("send data to browser factory and get driver ");*/
		System.out.println("Open URL");
		System.out.println("create home page object");
	}
	@AfterMethod(groups= {"Regression"})
	public void postCondition1()
	{
		System.out.println("close the browser");
		System.out.println("Completed Test Case"+i++);
		System.out.println("......................");
	}
	@BeforeMethod(groups= {"Regression"})
	public void precondition1()
	{
		System.out.println("......................");
		System.out.println("Starting TC"+ i);
		/*System.out.println("Read data from properties file,Run rowser name, add url,add run mode");
		System.out.println("send data to browser factory and get driver ");*/
		System.out.println("Open URL");
		System.out.println("create home page object");
	}
	@AfterMethod(groups= {"Smoke"})
	public void postCondition()
	{
		System.out.println("close the browser");
		System.out.println("Completed Test Case"+i++);
		System.out.println("......................");
	}
	
	@BeforeGroups(groups= {"Regression"})
	public void grp()
	{
		System.out.println("Regression");
	}
	@Test(priority=20,groups={"Regression"})
	public void verifyHomePage()
	{
		//System.out.println(".....................");
		//System.out.println("Starting TC1");
		/*System.out.println("Read data from properties file,Run rowser name, add url,add run mode");
		System.out.println("send the data to browser factory and get the driver");
		System.out.println("Open URL");
		System.out.println("Create Home Page class");*/
		System.out.println("Read expected title from properties file");
		System.out.println("Get actual title for Home page Class");
		System.out.println("validate expected tiltle with actual title");
		/*System.out.println("Close the browser");
		System.out.println("Finsh TC1");
		System.out.println("..................");*/
	}
	@Test(priority=10,groups= {"Smoke"})//(dependsOnMethods="verifyHomePage")
	public void verifyRegpage()
	{
		//System.out.println("........................");
		//System.out.println("Starting TC2");
		/*System.out.println("");
		System.out.println("Read data from properties file,Run rowser name, add url,add run mode");
		System.out.println("send the data to browser factory and get the driver");
		System.out.println("Open URL");
		System.out.println("Create Home Page class");*/
		System.out.println("call a method to home page class that clicke register link");
		System.out.println("It navigate to Register page");
		System.out.println("Read first name from the properties file");
		System.out.println("pass first name to enter first aname method");
		/*System.out.println("close the browser");
		System.out.println("Finish TC2");
		System.out.println("..........................");*/
	}
	
		

}
