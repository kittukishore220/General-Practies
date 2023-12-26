package com.OOPSploymorphisum.methodoverloading;

public class AdditionDisplay {
	public void sum(int a, int b) {
		//return "Addition Of Two Numbers is:" + (a + b);
		System.out.println(a+b);
	}

	public void sum(int a, int b, int c) {
		//return "Addition Of Three Nmber is:" + (a + b);
		System.out.println(a+b+c);
	}

	public String sum(int a, int b, int c, int d) {
		return "Addition Of Four Numbers:" + (a + b + c + d);

	}

	public String sum(int a, int b, int c, int d, int e) {
		return "Addition Of Four Numbers:" + (a + b + c + d + e);

	}

	public String sum(double a, double b) {
		return "Addition of Two Numbers:" + (a + b);
	}

	public String sum(String name) {
		return "Students Name is:" + name;

	}

	public static void main(String[] args) {
		AdditionDisplay A = new AdditionDisplay();
		A.sum(20, 30);
		A.sum(50, 60, 70);
		A.sum(30, 20, 50, 100);
		A.sum(20, 80, 200, 40, 30);
		A.sum(25.5, 50.00);
		A.sum("kishore");
	}
}