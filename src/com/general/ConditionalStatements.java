package com.general;

public class ConditionalStatements {
	public void simple(int a) {
		int num=00;
		if(num < 100) {
			System.out.println("enter number less then 100");
		}
		if(num > 50) {
			System.out.println("enter number grater then then 50");
}
		else
			System.out.println("invalid number");
	}
		
	 public static void main (String args[])
	 {
		 ConditionalStatements cs=new ConditionalStatements();
		 cs.simple(30);
	 }
			
		
	
}