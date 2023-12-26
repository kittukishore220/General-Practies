package com.anilinterviwquestions;

public class HashCodeExample {

	public static void main(String[] args) {
		HashCodeExample h=new HashCodeExample();
		HashCodeExample h1=new HashCodeExample();
		HashCodeExample h2=new HashCodeExample();

		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());

	}

}
