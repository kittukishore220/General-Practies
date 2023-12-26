package com.interfacemultiplelevelinheritance;

public class Animal implements AnimalEat, AnimalTravel, AnimalRun, AnimalWalk {

	@Override
	public void travel() {
		System.out.println("Animal is Eating");

	}

	@Override
	public void eat() {

		System.out.println("Animal is Traveling");
	}

	@Override
	public void run() {
		System.out.println("Animal is Runing");
	}

	@Override
	public void walk() {

		System.out.println("Animal is Walking");
	}

	public static void main(String[] args) {
		Animal A = new Animal();
		A.eat();
		A.travel();
		A.run();
		A.walk();
	}

}
