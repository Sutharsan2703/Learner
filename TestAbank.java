package com.chainsys.day11;

public class TestAbank {

	public static void main(String[] args) {
		
		ABank bank = new ABank();
		
		//get start with OOP(Object oriented Programming)
		
		//static method to access - classname.methodname
		//no need to create object for static method - how to access?
		
		//class
		ABank.deposit(2000, 67895);
		ABank.deposit(300, 67895);

		//non-static class --> access with object
		//object
		bank.deposit(300, 67895, "kid");
	    bank.deposit(3000, "UB67895", 567890, "Mango");
	    
	    ABankbranch1 b1 = new ABankbranch1();
	   // balance=balance+amount;
	    b1.deposit(49000, "ECG56787", 98765430,"cat" );
	}

}
