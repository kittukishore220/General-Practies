package com.OOPS.abstraction;

public abstract class Company {
	private double netSalary = 0.0;

	public Company(double grossSalary) {
		calculateNetSalary(grossSalary);
	}

	public void calculateNetSalary(double grossSalary) {
		if (grossSalary >= 50000) {
			netSalary = grossSalary - (grossSalary * 0.2);
		} else if (grossSalary >= 30000 && grossSalary <= 50000) {
			netSalary = grossSalary - (grossSalary * 0.1);
		} else {
			netSalary = grossSalary;
		}
		System.out.println("Net Salary of Employee:" + netSalary);
	}

}
