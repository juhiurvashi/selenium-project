package com.k2js.exceptionlearning.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex8 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("pom.xml");
			int i = 10 / 0;
		} catch (FileNotFoundException e) {
			System.out.println("Hello");
		} catch (Exception fe) {
			System.out.println("Hello World");
		}
	}
}
