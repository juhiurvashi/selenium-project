package com.k2js.exceptionlearning.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Ex4 {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream(".\\TestData\\NTData.xlsx");
			Properties p = new Properties();
			p.load(fis);
			
		} catch (FileNotFoundException fe) {
			//System.out.println("Hello");
		} /*catch (IOException e) {
			System.out.println("World");
		}*/
	}
}
