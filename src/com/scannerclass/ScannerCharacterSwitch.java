package com.scannerclass;

import java.util.Scanner;

public class ScannerCharacterSwitch {
	//private static int aa;

	public static void display(char a, char e, char i, char o, char u) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Character");
		char c = sc.next().charAt(0);

		switch (c) {
		case 'a':
			System.out.println("Given Character is ovel " + c);
			break;
		case 'e':
			System.out.println("GivenCharacter is ovel " + c);
			break;
		case 'i':
			System.out.println("Given Character is ovel " + c);
			break;
		case 'o':
			System.out.println("Given Character is ovel " + c);
			break;
		case 'u':
			System.out.println("Given Character is ovel " + c);
			break;
		default:
			System.out.println("Given Character is consonent");

		}
	}

	public static void main(String[] args) {
		ScannerCharacterSwitch.display('a', 'e', 'i', 'o', 'u');
	}

}
