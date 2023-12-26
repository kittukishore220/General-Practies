package com.general;

public class WhileLoop {
	public void display() {
		int i = 1;
	//while (i <= 10)
		do	
		{
			System.out.println("skill logic" + i);
			i++;
		}
		while (i >= 10);
	}

	public static void main(String args[]) {
		WhileLoop wl = new WhileLoop();
		wl.display();
	}

}
