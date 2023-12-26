package com.general;

public class ThisKeyword {
	int id;
String name;
String city;

public ThisKeyword(int id,String name,String city){
	this.id=id;
	this.name=name;
	this.city=city;
}

	public void display(){
		System.out.println(id+"   "+name+"    "+city+"    ");
	}

	public static void main(String args[]) {
		ThisKeyword tk = new ThisKeyword(102,"kumar","hyd");
		tk.display();

	}

}
