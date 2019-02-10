package com.k2js.exceptionlearning.examples;

public class Ex10 {
	static int div(int i,int j)
	{
		try
		{
			//return i/j;
		}
		catch(Exception e) {
			//return 0;
		}
		finally
		{
			System.out.println("Hello");
			return 100;
		}
	}
	public static void main(String[] args) {
		System.out.println(div(10,0));
	}
}
