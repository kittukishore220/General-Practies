package com.general;

public class Mult {
	public void operation() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("multiplication" + c);
	}

	public static void main(String args[]) {
		Mult m = new Mult();
		m.operation();
	}
}
