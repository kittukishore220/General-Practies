package com.array.arraylist;


import java.util.ArrayList;

public class Test {

	public void display() {
		/*int id = 111;
		String name = "rajesh";
		double salary = 5000.00;
		char grade = 'A';*/
		
		ArrayList test = new ArrayList();

		test.add (111);
		test.add("rajesh");
		test.add(5000);
		test.add('A');
		System.out.println(test);
		//System.out.println(test.size());
		//System.out.println(test.get(1));
		//System.out.println(test.remove(2));
		//System.out.println(test);

	}

	public static void main(String args[]) {
		Test al = new Test();
		al.display();
	}
}



