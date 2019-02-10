package com.k2js.exceptionlearning.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1 {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("");
		System.out.println("Hello World");
	}
}
