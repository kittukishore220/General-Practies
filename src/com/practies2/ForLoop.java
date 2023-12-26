 -8\[lw\+package com.practies2;

public class ForLoop {
	public void show() {
		int sum=0;
		for(int i=1;i<=10;i++ ){
			System.out.println(i);
			sum=sum+i;
			System.out.println("sum of 10 digits:"+sum);
		}
	}
	public static void main(String[] args) {
		ForLoop FL=new ForLoop();
		FL.show();
	}

}
