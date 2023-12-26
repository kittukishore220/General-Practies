package com.inheritance.isrelationship;

public class Student4Details extends College {
	public static void information4() {
		String id = "16QP5A0402";
		String name = "Badri";
		String branch = "ECE";
		char section = 'B';
		double attendencefee = 200;
		double totalfee = collegefee + attendencefee;
		System.out.println("Student4 Details");
		System.out.println(id + "  " + name + " " + branch + "  " + totalfee);
		collegeDetails();
	}

}
