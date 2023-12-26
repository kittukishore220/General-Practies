package com.interfacemultipleinheritance2;

public class Person implements PersonWork,PersonEat{

	@Override
	public void eat() {
		System.out.println("Person is Eating");		
	}

	@Override
	public void work() {
System.out.println("Person is Working");		
	}
public static void main(String[] args) {
	Person P=new Person();
	P.eat();

	P.work();
}


	}


