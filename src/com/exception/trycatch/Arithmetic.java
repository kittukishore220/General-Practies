package com.exception.trycatch;

import com.inheritance.isrelationship.Main;

public class Arithmetic {
	public static void Display(int a,int b,String name) {
		int c = 0;
		int len=0;
		try {

			c = a / b;
			len=name.length();
		} catch (ArithmeticException ae) {
			//System.out.println(c);
			ae.printStackTrace();
		}catch(NullPointerException npe) {
			//System.out.println(len);
		}System.out.println("Addition:"+c);
		System.out.println("length:"+len);

	}

	public static void main(String[] args) {
		Arithmetic.Display(40, 3,"kishore");
	}
}
