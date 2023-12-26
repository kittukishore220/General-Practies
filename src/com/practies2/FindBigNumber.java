package com.practies2;

public class FindBigNumber {
	public void display() {
		int a=10;int b=40;int c=30;
		if(a>b&&a>c) {
		System.out.println("a is Big Number");
		}else if(b>c&&b>a){
			System.out.println("b is Big Number");
		}else if(c>a&&c>b){
			System.out.println("c is Big Number");
		}
	}
	public static void main(String[] args) {
		FindBigNumber FBN=new FindBigNumber();
		FBN.display();
	}

}
 