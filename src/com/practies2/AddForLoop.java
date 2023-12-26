package com.practies2;

public class AddForLoop {
	public void addition() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// System.out.println(i);
			sum = sum + i;
			{
				System.out.println(sum);
			}
		}
	}

	public static void main(String[] args) {
		AddForLoop AFL = new AddForLoop();
		AFL.addition();
	}
}
