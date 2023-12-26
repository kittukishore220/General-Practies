package com.array.arraylist;

import java.util.Stack;

public class Test1 {
	public void display() {
		Stack s = new Stack();
		s.push(222);
		s.push("nagesh");
		s.push("hyd");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		//System.out.println(s);

	}

	public static void main(String args[]) {
		Test1 t = new Test1();
		t.display();
	}

}
