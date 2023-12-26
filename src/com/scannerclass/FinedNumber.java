package com.scannerclass;

import java.util.Scanner;

public class FinedNumber {
	public static void evenOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int i = sc.nextInt();
		if (i % 2 == 0) {
			System.out.println("Your Entered is Even number");
		} else {
			System.out.println("Your Entered is Odd Number");
		}
	}

	public static void main(String[] args) {
		FinedNumber.evenOdd();

	}
}
