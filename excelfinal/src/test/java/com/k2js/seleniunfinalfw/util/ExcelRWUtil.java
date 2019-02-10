package com.k2js.seleniunfinalfw.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
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

	static public int getTCCount(String testname) {
		int rowCount = s.getPhysicalNumberOfRows();
		int count = 0;
		{
			for (int j = 0; j < rowCount; j++) {
				Row r = s.getRow(j);
				if (r.getCell(1).getStringCellValue().equalsIgnoreCase(testname)
						&& (r.getCell(2).getStringCellValue().equalsIgnoreCase("Y"))) {
					count++;
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
	public static void writeXl(int row,int cell,String msg) throws IOException
	{
		Row r=s.getRow(row);
		Cell c=r.getCell(cell);
		c.setCellValue(msg);
		FileOutputStream fos=new FileOutputStream(".//TestData/NTData.xlsx");
		wb.write(fos);
		fos.close();
	}
}
