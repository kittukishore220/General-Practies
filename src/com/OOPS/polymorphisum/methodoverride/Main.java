 package com.OOPS.polymorphisum.methodoverride;

public class Main {
	public static void main(String[] args) {
		SBI sbi=new SBI();
		double result1=sbi.getRateOfInterest();
		System.out.println("SBI interest in %:"+result1);
		HDFC hdfc=new HDFC();
		double result2=hdfc.getRateOfInterest();
		System.out.println("HDFC interest in %:"+result2);
		AXIS axis=new AXIS();
	double result3=	axis.getRateOfInterest();
	System.out.println("AXIS interest in %:"+result3);

	}
		
		
	

}
