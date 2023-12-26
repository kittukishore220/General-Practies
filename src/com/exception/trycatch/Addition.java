package com.exception.trycatch;

public class Addition {
	public static void display(int a,int b,String name) {
		int c=0;
		int len=0;
		try {
			c=a/b;
			len=name.length();

			
			
	}catch(ArithmeticException AE) {
			System.out.println("Result of Addition is:"+c);
			AE.printStackTrace();
			
		}catch(NullPointerException NE) {
			System.out.println("length of the name is:"+len);

			NE.printStackTrace();
		}
	}public static void main(String[] args) {
		Addition.display(50, 2,"kishore");
	}
}
