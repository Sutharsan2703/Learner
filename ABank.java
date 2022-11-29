package com.chainsys.day11;

public class ABank {
static int balance=0;
	//no object created (Declared as Static)
	public static void  deposit(int amount,int accNo) {
		//method definition
		balance=balance+ amount;
		System.out.println("Transaction number 1: ");
		System.out.println("Your balance ': "+balance);
	}
	
	//3000
	
	//object is created
	public void deposit(int amount,int accountNo,String depositName) {
		//3000
		
		balance=balance+amount;	//3000+2000=5000
		System.out.println("Transaction number 2: ");
		System.out.println("Your balance ': "+balance+"  amount depositted by : "+depositName);
		
	}
	
	//object is created
	
	public void deposit(int amount,String IFSC, int mobileNo,String depositerName) {
		//5000
		int interest=100;
		balance=balance+amount+interest;//3000+2000=5000
		System.out.println("Transaction number 3: ");
		System.out.println("Total balance =  "+balance);
	}
	
/*

//Overriding - - We will method with same signature, but not in same class

//ABank -- Multiple branches  (minimum balance is to be.. )
//ABank - Saving - minimum balance=100;-city- metro

//ABank - remote -balance --;()-- fruitful - customer - remove minimum -100  */

}