package com.OOPS.abstraction;

public class Employee extends Company {
	public Employee(double grossSalary) {
		super(grossSalary);
	}

	public static void main(String[] args) {
		Employee E = new Employee(50000);
	}

}
