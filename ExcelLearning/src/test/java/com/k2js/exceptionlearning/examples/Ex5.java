package com.k2js.exceptionlearning.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Ex5 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(".\\TestData\\NTData.xlsx");
			Properties p = new Properties();
			try {
				p.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException fe) {
			
		}
	}
}
