package com.general;

public class BigNumber {
	public void findBigNumber(int a, int b, int c, int d) {
		if (a > b && a > c && a > d) {
			System.out.println("a is big number");
		} else if (b > a && b > c && b > d) {
			System.out.println("b is big number");
		} else if (c > a && c > b && c > d) {
			System.out.println("c is big number");
		} else {
			System.out.println("c is big number");
		}
	}

	public static void main(String args[]) {
		BigNumber bn = new BigNumber();
		bn.findBigNumber(10, 60, 30, 40);
	}
}
