package com.OOPSploymorphisum.methodoverloading;

public class Main {
	public static void main(String[] args) {
		ShoppingCart SC=new ShoppingCart();
		String item[]= {"mobile","tv","laptop"};
		double amount[]= {25000,45000,60000};
		SC.addToCart(item,amount);
	}

}
