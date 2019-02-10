package com.k2js.ExcelLearning.ExcelPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelReads {
/*	@Test(dataProvider="ntd",dataProviderClass=ExcelUtil.class)
	public void verifyHomepage(String title,String row)//() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//System.out.println(ExcelUtil.getRowCount());
		//System.out.println(ExcelUtil.getFirstRowCellCount());
		//ExcelUtil.getAllRowCellCount();
		//ExcelUtil.getFirstRowFirstCellData();
		//ExcelUtil.getFirstRowThirdCellData();
		//ExcelUtil.getFirstRowThirdCellY();
		//System.out.println(ExcelUtil.getTCCount());
		//ExcelUtil.getTestCaseDataCount("verifyHomePage");
		//ExcelUtil.printTestCasedata("verifyRegisterPage");
		for(String t[]:ExcelUtil.storeTestCaseData("verifyRegisterPage"))
		{
			for(String p:t) {
				System.out.println(p+"\t");
			}
			System.out.println();
		}
		
		System.out.println(title);
		System.out.println(row);
		
	}*/
	@Test(dataProvider="ntd",dataProviderClass=ExcelUtil.class)
	public void verifyRegisterPage(String... td)
	{
		System.out.println(td[0]);
	}
	
}