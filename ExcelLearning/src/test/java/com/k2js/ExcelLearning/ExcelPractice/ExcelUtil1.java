package com.k2js.ExcelLearning.ExcelPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil1 {
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

	static public void getFirstRowThirdCellY() throws EncryptedDocumentException, InvalidFormatException, IOException {

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
}
