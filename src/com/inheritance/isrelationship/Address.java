package com.inheritance.isrelationship;

public class Address {
	String HNo;
	String area;
	String village;
	String pincode;
	public Address(String hNo, String area, String village, String pincode) {
		super();
		HNo = hNo;
		this.area = area;
		this.village = village;
		this.pincode = pincode;
	}
public  void displayAddress() {
	System.out.println(HNo+" "+area+" "+village+"  "+pincode);
}
}
