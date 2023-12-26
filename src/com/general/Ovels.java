package com.general;

import java.util.Scanner;

public class Ovels {
	public void findOvelNumber(char a, char e, char i, char o, char u) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		char c = sc.next().charAt(0);
		switch (c) {
		case 'a':
			System.out.println("a is ovel");

			break;
		case 'e':
			System.out.println("e is ovel");

			break;
		case 'i':
			System.out.println("i is ovel");

			break;
		case 'o':
			System.out.println("o is ovel");

			break;
		case 'u':
			System.out.println("u is ovel");

			break;
		default:
			System.out.println("given charecter is consonent");
		}
	}

	public static void main(String args[]) {
		Ovels o = new Ovels();
		o.findOvelNumber('a', 'e', 'i', 'o', 'u');

	}

}
