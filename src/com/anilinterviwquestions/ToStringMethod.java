package com.anilinterviwquestions;

public class ToStringMethod {
		 int rollno;  
		 String name;  
		 String city;  
		  
		 ToStringMethod(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  

			
			  public String toString() { 
				  return rollno+" "+name+" "+city+" ";
			  }
			 
		 public static void main(String args[]){  
			 ToStringMethod s1=new ToStringMethod(101,"Raj","lucknow");  
			 ToStringMethod s2=new ToStringMethod(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }  
		}  


