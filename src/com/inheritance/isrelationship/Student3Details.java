package com.inheritance.isrelationship;

public class Student3Details extends College {
	public static void information3() {
		String id = "16QP5A0409";
		String name = "Kishore";
		String branch = "ECE";
		char section = 'B';
		double attendencefee = 900;
		double totalfee = collegefee + attendencefee;
		System.out.println(" Student3 Details");
		System.out.println(id + "  " + name + " " + branch + "  " + totalfee);
		collegeDetails();
	}
}
