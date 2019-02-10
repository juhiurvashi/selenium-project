package com.k2js.exceptionlearning.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex3 {
	public static void main(String[] args) {
		try
		{
			FileInputStream fis=new FileInputStream(".//TestData/NTData.xlsx");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Hello World");
		}
	}
}
