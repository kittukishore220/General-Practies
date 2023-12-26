package com.anilinterviwquestions;

public class Blocks {
	Blocks() {
		System.out.println("constructor ");
	}

	{
		System.out.println("instance  block");
	}
	static {
		System.out.println("static block ");
	}

	
	  public static void display() { 
		  System.out.println("static  method ");
		  }
	  
	  public void print() {
		  System.out.println("normal method ");
		  }
	 

	public static void main(String args[]) {

		Blocks b1 = new Blocks();
		
		display();
		b1.print();
		Blocks b2 = new Blocks();
		Blocks b3 = new Blocks();
		
		
	}
}
