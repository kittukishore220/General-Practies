package com.general;

/*public class Length {
	public void findLength(String name) {
		int len = name.length();
		System.out.println("length" + len);
	}

	public static void main(String args[]) {
		Length l = new Length();
		l.findLength("kondakishore");
	}
}*/
public class Length{
public void display(String name) {
	int len=name.length();
	System.out.println("Length:"+len);
} 	
public static void main(String[] args) {
	Length l=new Length();
	l.display("trysol global services");
}
}