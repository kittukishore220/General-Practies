package com.general;

public class DoWhileLoop {
	public void display() {
		int i=1;
		do {
			System.out.println("skill logic"+i);
		}
		while(i<=10);
	}
public static void main(String args[]) {
	DoWhileLoop dwl=new DoWhileLoop();
	dwl.display();
}
}
