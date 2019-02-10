package com.k2js.ExcelLearning.ExcelPractice;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelRWUtil {
	static FileInputStream fis = null;
	static Workbook wb = null;
	static Sheet s = null;

	static {
		try {
			fis = new FileInputStream(".//TestData/NTData.xlsx");
			wb = WorkbookFactory.create(fis);
			s = wb.getSheet("Sheet1");
		} catch (Exception e) {

		}
	}

	static public int getTCCount() {
		int rowCount = s.getPhysicalNumberOfRows();
		int count = 0;
		{
			for (int j = 0; j < rowCount; j++) {
				Row r = s.getRow(j);
				if (r.getCell(1).getStringCellValue().equalsIgnoreCase("verifyRegisterPage")
						&& (r.getCell(2).getStringCellValue().equalsIgnoreCase("Y"))) {
					count++;
				}
			}
			System.out.println();
		}

		return count;

	}
	static public int getTCCount(String tcName){
		int rowCount = s.getPhysicalNumberOfRows();
		int count=0;
		//for(int i=0;i<rowCount;i++)
		{
			//Row r=s.getRow(1);
			//Row r1=s.getRow(2);
			for(int j=0;j<rowCount;j++)
			{
				Row r=s.getRow(j);
				if(r.getCell(1).getStringCellValue().equalsIgnoreCase("verifyRegisterPage")&&(r.getCell(2).getStringCellValue().equalsIgnoreCase("Y")))
				{
					count++;
				//System.out.println(" row "+ j+" cell "+c.getStringCellValue()+"\t");
				}
			}
			System.out.println();
		}
		
	
		return count;

	}
	static public int getTestCaseDataCount(String tcName)
	{
		int rowCount = s.getPhysicalNumberOfRows();
		for(int j=0;j<rowCount;j++)
		{
			Row r=s.getRow(j);
			if(r.getCell(1).getStringCellValue().equalsIgnoreCase("verifyRegisterPage")&&(r.getCell(2).getStringCellValue().equalsIgnoreCase("Y")))
			{
				return r.getPhysicalNumberOfCells()-3;
			}
		}
		return 0;
		
	}
	@DataProvider(name="ntd")
	public static String[][] storeTestCaseData(Method m)//(String TestName)
	{
		String TestName=m.getName();
		String[][] td=new String[getTCCount(TestName)][getTestCaseDataCount(TestName)+1];
		int ri=0;
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r=s.getRow(i);
			String testnameCelldata=r.getCell(1).getStringCellValue();
			String runstatusCelldata=r.getCell(2).getStringCellValue();
			if(testnameCelldata.equalsIgnoreCase(TestName)&&runstatusCelldata.equalsIgnoreCase("Y"))
			{
				int ci=0;
				for(int j=3;j<r.getPhysicalNumberOfCells();j++)
				{
					td[ri][ci++]=r.getCell(j).getStringCellValue();
				}
				td[ri++][ci]=i+"";
			}
		}
		return td;
		
	}
	

}
