package com.k2js.TestNGsample.module1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeInformation {
	@BeforeTest
	public void tests2()
	{
		System.out.println("Before Test Run");
	}
	
	@BeforeSuite
	public void saveBeforeTestpaths()
	{
		System.out.println("Save old test results");
	}
	@AfterTest
	public void suitmethod()
	{
		System.out.println("Suit");
	}
}
