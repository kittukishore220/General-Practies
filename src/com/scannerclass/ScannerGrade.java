package com.scannerclass;

import java.util.Scanner;

public class ScannerGrade {
	public static void marks(int a) {
		if(a<=100&&a>=80){
			System.out.println("Your Total Marks is "+a+" A Grade");
		} else if(a<=79&&a>=60){
			System.out.println("Your Total Marks is "+a+" B Grade");
		} else if(a<=59&&a>=40){
			System.out.println("Your Total Marks is "+a+" C Grade");
		}else {
			System.out.println("Your Total Marks is "+a+" D Grade");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
				System.out.println("Enter marks");
				int a=sc.nextInt();
				ScannerGrade.marks(a);	
		}
	
}
		
		
		