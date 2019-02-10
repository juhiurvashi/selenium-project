package com.k2js.exceptionlearning.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex7 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("");
			int i = 10 / 0;
		} catch (FileNotFoundException e) {
			System.out.println("Hello");
		} catch (ArithmeticException ae) {
			System.out.println("World");
		}
	}
}
