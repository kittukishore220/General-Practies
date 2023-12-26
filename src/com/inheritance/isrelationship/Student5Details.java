package com.inheritance.isrelationship;

public class Student5Details extends College {
	public static void information5() {
		String id = "15QP1A0472";
		String name = "Ajay Kumar";
		String branch = "ECE";
		char section = 'A';
		double attendencefee = 550;
		double totalfee = collegefee + attendencefee;
		System.out.println("Student Details");
		System.out.println(id + "  " + name + " " + branch + "  " + totalfee);
		collegeDetails();
	}
}
