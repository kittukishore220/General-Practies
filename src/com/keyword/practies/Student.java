
package com.keyword.practies;

public class Student {
	static int id;
	static String name;
	static String college = "khammam institute of technology and science";

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void display() {
		System.out.println(id + " " + name + " " + college);
	}

	public static void main(String[] args) {
		Student s1 = new Student(111, "kishore");
		Student s2 = new Student(222, "sandeep");
		Student s3 = new Student(222, "sai");

		s1.display();
		s2.display();
		s3.display();

	}
}
