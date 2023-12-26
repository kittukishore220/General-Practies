package com.OOPSploymorphisum.methodoverloading;

public class ShoppingCart {
	public String payment(String UPI,double amount) {
		return "Payment Completed with UPI for Amount of:"+amount;
		}
	public String payment(String name,String password,double amount) {
		return "Payment Completed with Netbanking for Amount of:"+amount;
			}
	public String payment(long cardno,int cvv,String expiryDate,double amount) {
		return "Payment Completed with Credit/Debit for Amount of:"+amount;
		}
	public void addToCart(String item[],double amount[]) {
		double totalAmount=0.0;
		for(double d:amount) {
			totalAmount=d+totalAmount;
		}
		String message=payment("ikl2508/4@567",totalAmount);
			//	String message=payment(0, 0, null, 0);
				//String message=payment(0, 0, null, 0)
System.out.println("purchaged items"+item+"payment"+message);
		
		
	}

}
