package com.inheritance.isrelationship;

public class Student1Details extends College {
	Address address;
	public static void information1() {
		String id = "16QP5A0403";
		String name = "Ashok Kumar";
		String branch = "ECE";
		char section = 'B';
		double attendencefee = 600;
		double totalfee = collegefee + attendencefee;
		System.out.println("Student1 Details");
		System.out.println(id + "  " + name + " " + branch + "  "  +totalfee+" ");
		collegeDetails();
		Address A=new Address("6-5-11","maripeda banglow","maripeda","506315");
		A.displayAddress();
	}

}
