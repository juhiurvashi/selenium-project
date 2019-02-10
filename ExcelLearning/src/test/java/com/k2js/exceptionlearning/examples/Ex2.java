package com.k2js.exceptionlearning.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2 {
	public static void main(String[] args) {
		try
		{
			FileInputStream fis=new FileInputStream("");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Hello World");
		}
	}
}
