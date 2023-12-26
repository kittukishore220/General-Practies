package com.general;

public class Addition2 {
	
	public void display(int a, int b) {

		int c = a + b;
		System.out.println("Addition:" + c);
	}

	public static void main(String[] args) {
		Addition2 a = new Addition2();
		a.display(5, 5);
	}
}
