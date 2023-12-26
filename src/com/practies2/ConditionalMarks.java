package com.practies2;

public class ConditionalMarks {
	public static void grade(int a) {
	
		if(a>=80 && a<=100 ) {
			System.out.println("A grade");
		}
		else if(a>60&&a<79) {
			System.out.println("B grade");
		}
		else if(a>40 && a<59) {
			System.out.println("C grade");
		}else {
			System.out.println("D grade");
		}
		}
		public static void main(String[] args) {
			//ConditionalMarks SW= new ConditionalMarks();
			//SW.grade(89);
			ConditionalMarks.grade(25);
		}
	} 


