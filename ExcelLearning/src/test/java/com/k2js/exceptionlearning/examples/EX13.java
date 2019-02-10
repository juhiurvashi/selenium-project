package com.k2js.exceptionlearning.examples;

public class EX13 {
	public static void main(String[] args) {
		try {
			int i=10/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("....................");
			System.out.println(e);
			System.out.println("....................");
			System.out.println(e.getMessage());
			System.out.println("....................");
			System.out.println(e.toString());
		}
	}
}
