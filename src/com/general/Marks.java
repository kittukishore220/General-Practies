package com.general;

import java.util.Scanner;

public class Marks {
	public void totalMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student marks");
		int l = sc.nextInt(0);
		if (100 >= 80) {
			System.out.println("A grade");
		} else if (100 >= 60 && 100 >= 80) {
			System.out.println("B grade");
		} else if (100>=40 && 100>=60) {
		
		System.out.println("C grade");
		}
		else{
		System.out.println("D grade");
		}
	}

	public static void main(String args[]) {
		Marks n = new Marks();
		n.totalMarks();

	}
}
