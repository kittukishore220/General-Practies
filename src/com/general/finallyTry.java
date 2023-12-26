package com.general;

public class finallyTry {
public static void division(int a,int b,String name) {
	int c=0;
	int len=0;
	try {
		c=a/b;
		len=name.length();
	}catch(ArithmeticException ae) {
		System.out.println("catch block....1");
		ae.printStackTrace();
	}	catch(NullPointerException ne) {
		System.out.println("catch block....2");
		ne.printStackTrace();
	}finally {
		System.out.println("catch block....");

	}
	System.out.println("Division Result:"+c);
	System.out.println("Length of given String;"+len);
	}public static void main(String[] args) {
		finallyTry.division(50,7, null);
	}
	}


