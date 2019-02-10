package com.k2js.exceptionlearning.examples;

import java.io.FileInputStream;

public class Ex9 {
public static void main(String[] args) throws Exception{
	try
	{
		FileInputStream fis = new FileInputStream("pom.xml");
		int i = 10 / 0;
	}
	finally
	{
		System.out.println("Hello");
	}
}
}
