package com.scannerclass;

import java.util.Scanner;

public class ScannerAddition {
	public static void addition(int a, int b) {
		int c = a + b;
		System.out.println("a+b=" + c);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value");
		int a = sc.nextInt();
		System.out.println("Enter b Value");
		int b = sc.nextInt();
		ScannerAddition.addition(a, b);
	}

}
