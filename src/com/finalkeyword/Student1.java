package com.finalkeyword;

public class Student1 {
	int id=111;
	String name="kishore";
	char section='A';
	String address="maripeda";
	final String  AdharNumber="2584569512";
	public void display() {
		 id=222;
		 name="pasha";
		 section='A';
		 address="khammam";
		  // AdharNumber="4568529761";
		System.out.println(id+" "+name+" "+section+"  "+address+"  "+AdharNumber+"  ");
	}
	public static void main(String[] args) {
		Student1 S=new Student1();
		S.display();
	}
}
