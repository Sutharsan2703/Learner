package com.chainsys.day11;

public class ABankbranch1 extends ABank {
	
	
	//ABank -- main - parent
	// - saving - 
	// -remote
	
	/*
	 * RBI- loan (9), saving (3), fd(4),rd, emp.
	 * 
	 * RBI - approval - axis,hdfc
	 * 
	 * loan - user request 5L -loan
	 * 
	 * RBI- loan()- ROI-9%
	 * RBI - Axis loan()- axis (copy) extends RBI - 9%
	 * 
	 * 
	 */
	

	public void deposit(int amount,String IFSC, int mobileNo,String depositerName) {
	//	balance=balance+amount;
	if(amount>50000) {
		System.out.println("Total Amount is:"+balance);
		System.out.println("Submit copy of PAN card ! for Access");
	}else System.out.println(amount);
	}
}
