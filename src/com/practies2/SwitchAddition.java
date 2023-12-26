package com.practies2;

public class SwitchAddition {
	int a = 20;
	int b = 50;

	public  void addition() {
		switch (a + b) {
		case 10:
			System.out.println("case-1 value is:" + (a + b));
			break;
		case 20:
			System.out.println("case-2 value is:" + (a + b));
			break;
		case 30:
			System.out.println("case-3 value is:" + (a + b));
			break;
		case 40:
			System.out.println("case-4 value is:" + (a + b));
			break;
		case 50:
			System.out.println("case-5 value is:" + (a + b));
			default:
				System.out.println("value not matching");
		}

	}
	public static void main(String[] args) {
		SwitchAddition SW=new SwitchAddition();
		SW.addition();
	}

}
