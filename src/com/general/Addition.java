package com.general;

public class Addition {
	public void operation() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Additon:" + c);
	}

	public static void main(String args[]) {
		Addition op = new Addition();
		op.operation();
	}
}
