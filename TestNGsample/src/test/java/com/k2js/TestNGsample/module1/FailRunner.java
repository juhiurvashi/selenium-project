package com.k2js.TestNGsample.module1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;
@Test(retryAnalyzer=FailRunner.class)
public class FailRunner implements IRetryAnalyzer {

	int mincount=0;
	int maxcount=2;
	public boolean retry(ITestResult t) {
			if(mincount<maxcount)
			{
				mincount++;
				return true;
			}
		return false;
	}
	
}
