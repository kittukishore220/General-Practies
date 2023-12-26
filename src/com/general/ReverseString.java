 package com.general;

/*public class ReverseString {
	public static void display() {
		StringBuffer SB = new StringBuffer("konda kishore");
		SB.reverse();
		System.out.println(SB);

		System.out.println(SB.length());
	}

	public static void main(String[] args) {
		ReverseString.display();
	}

}*/
 class ReverseString{
	 void display() {
		 StringBuffer sb=new StringBuffer("konda kishore");
		 sb.reverse();
		 System.out.println(sb);
		 System.out.println(sb.length());
	 }
	 public static void main(String[] args) {
		 ReverseString r=new ReverseString();
		 r.display();
	}
 }