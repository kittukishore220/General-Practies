package com.inheritance.isrelationship;

public class Student2Details extends College {
	public static void information2() {
		String id = "16QP5A0405";
		String name = "Sainath";
		String branch = "ECE";
		char section = 'B';
		double attendencefee = 800;
		double totalfee = collegefee + attendencefee;
		System.out.println("Student2 Details");
		System.out.println(id + "  " + name + " " + branch + "  " + totalfee);
		collegeDetails();

	}
}
