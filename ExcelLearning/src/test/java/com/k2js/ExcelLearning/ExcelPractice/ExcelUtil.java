package com.k2js.ExcelLearning.ExcelPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.crypt.standard.StandardEncryptionInfoBuilder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtil {

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
	static public int getRowCount() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//FileInputStream fis=new FileInputStream(".//TestData/NTData.xlsx");
		//Workbook wb=WorkbookFactory.create(fis);
		//Sheet s=wb.getSheet("Sheet1");
		int rowCount=s.getPhysicalNumberOfRows();
		return rowCount;
	}
	static public int getFirstRowCellCount() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//FileInputStream fis=new FileInputStream(".//TestData/NTData.xlsx");
		//Workbook wb=WorkbookFactory.create(fis);
		//Sheet s=wb.getSheet("Sheet1");
		Row r=s.getRow(0);
		return r.getPhysicalNumberOfCells();
		
	}
	static public void getAllRowCellCount() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//FileInputStream fis=new FileInputStream(".//TestData/NTData.xlsx");
		//Workbook wb=WorkbookFactory.create(fis);
		//Sheet s=wb.getSheet("Sheet1");
		int rowCount=s.getPhysicalNumberOfRows();
		for(int i=0;i<rowCount;i++)
		{
			Row r=s.getRow(i);
			System.out.println((i+1)+" row cell count is "+r.getPhysicalNumberOfCells());
		}
	}
	static public void getFirstRowFirstCellData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//FileInputStream fis =new FileInputStream(".//TestData/NTData.xlsx");
	//	Workbook wb=WorkbookFactory.create(fis);
	//	Sheet s=wb.getSheet("Sheet1");
		/*Row r=s.getRow(0);
		Cell c=r.getCell(0);*/
		int rowCount=s.getPhysicalNumberOfRows();
		for(int i=0;i<rowCount;i++)
		{
			Row r=s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++)
			{
				Cell c=r.getCell(j);
				System.out.println(i+" row "+j+ " cell "+c.getStringCellValue()+"\t");
			}
			System.out.println();
		}
		
	}
	
	static public void getFirstRowThirdCellData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//FileInputStream fis =new FileInputStream(".//TestData/NTData.xlsx");
		//Workbook wb=WorkbookFactory.create(fis);
	//	Sheet s=wb.getSheet("Sheet1");
		int rowCount=s.getPhysicalNumberOfRows();
		for(int i=0;i<rowCount;i++)
		{
			Row r=s.getRow(i);
			//for(int j=0;j<r.getPhysicalNumberOfCells();j++)
			{
				Cell c=r.getCell(2);
				System.out.println(i+" row "+ "3rd cell "+c.getStringCellValue()+"\t");
			}
			System.out.println();
		}
		
	}
	static public void getFirstRowThirdCellY(){

		int rowCount = s.getPhysicalNumberOfRows();
		int count = 0;
		for (int i = 0; i < rowCount; i++) {
			Row r = s.getRow(i);

			Cell c = r.getCell(2);

			if (c.getStringCellValue().equalsIgnoreCase("Y")) {
				count++;
			}

		}
		System.out.println(count);

	}
	static public int getTCCount(String tcName){
		int rowCount = s.getPhysicalNumberOfRows();
		int count=0;
		
			for(int j=0;j<rowCount;j++)
			{
				Row r=s.getRow(j);
				if(r.getCell(1).getStringCellValue().equalsIgnoreCase("verifyRegisterPage")&&(r.getCell(2).getStringCellValue().equalsIgnoreCase("Y")))
				{
					count++;
				//System.out.println(" row "+ j+" cell "+c.getStringCellValue()+"\t");
				}
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
	
	public static void printTestCasedata(String testname)
	{
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r=s.getRow(i);
			String testnameCelldata=r.getCell(1).getStringCellValue();
			String runstatusCelldata=r.getCell(2).getStringCellValue();
			if(testnameCelldata.equalsIgnoreCase(testname)&&runstatusCelldata.equalsIgnoreCase("Y"))
			{
				for(int j=3;j<r.getPhysicalNumberOfCells();j++)
				{
					System.out.println(r.getCell(j).getStringCellValue()+"\t");
				}
				System.out.println(i);
			}
		}
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
		Cell c=r.createCell(cell);
		c.setCellValue(msg);
		FileOutputStream fos=new FileOutputStream(".//TestData/NTData.xlsx");
		wb.write(fos);
		fos.close();
	}
}
