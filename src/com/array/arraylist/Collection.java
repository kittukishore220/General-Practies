package com.array.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection {
	public static void display() {
		ArrayList al=new ArrayList();
		al.add(111);
		al.add("naresh");
     	al.add("hyd");
     	al.add(5000);
	System.out.println(al);
	System.out.println("=============\n");
	//for loop
	for(int i=0;i<al.size();i++) {
		System.out.print(al.get(i)+" ");
	}
	System.out.println("=============\n");
	//advanced for loop
	for(Object obj:al) {
		System.out.print(obj+" ");
	}
	System.out.println("=============\n");
	//***using for each method
	al.forEach(obj-> System.out.print(obj+" "));
	
	//using List Iterator
	System.out.println("=============");
	ListIterator itr=al.listIterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	
	//using Iterator
	System.out.println("=============");
	Iterator litr=al.iterator();
	while(litr.hasNext()) {
		System.out.print(litr.next()+" ");
	}
	}
	
	//private, default, protected, public-Class, methods, variables
	//void int String boolean etcc....-methods.before..method signature 
	//static- method, variable
	//final-" "
	
	public static void main(String[] args) {
		Collection.display();
	}

}
