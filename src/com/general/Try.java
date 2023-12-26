package com.general;

public class Try {
	public void division (int a,int b,String name) {
		int c=0;
		try {
		c=a/b;
		}
		catch (ArithmeticException ae) {
			ae.getStackTrace();
		}
		System.out.println(c);
			
	}
}


