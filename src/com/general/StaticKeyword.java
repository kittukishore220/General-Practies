package com.general;

public class StaticKeyword {
	int id;
	String name;
	static String colleage = "kits";

	public StaticKeyword(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(id + "   " + name + "   " + colleage + "   ");
		// colleage.displayColleageAdress();
	}

	public static void main(String args[]) {
		StaticKeyword sk1 = new StaticKeyword(102, "rajesh");
		// StaticKeyword sk2 = new StaticKeyword(103, "naresh");
		sk1.display();
		// sk2.display();

	}

}

class Adress {
	public static void displayColleageAdress() {
		System.out.println("hyd");
		System.out.println("mumbai");
		System.out.println("bnglr");

	}
}
