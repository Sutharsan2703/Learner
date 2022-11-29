package com.chainsys.day13;

import java.util.Scanner;

public class TestBankingApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BankingApp b1=new BankingApp();
		System.out.println("Enter the Acc. No");
		int a=sc.nextInt();
		if (a==1234) {
		b1.setAmt(1000);
		System.out.println("Enter ATM pin: ");
		String p=sc.next();
		b1.setATMpin(p);
		if(b1.getATMpin().equals("123")){
			b1.setName("abcde");
			b1.setAccNo(1234);
			b1.setAccType("current");
		int balance=b1.deposit();
		System.out.println("Balance Amount is "+balance);
		
		System.out.println("Enter the amount to withdraw 1: ");
		int n=sc.nextInt();
		b1.setAmt(n);
		int aftWithdraw=b1.withdraw(b1.getAmt());
		System.out.println("After withdraw 1, balance is: "+aftWithdraw);
		
		
		System.out.println("Enter the amount to withdraw 2: ");
		int x=sc.nextInt();
		b1.setAmt(x);
		
		int afterWithdraw=b1.withdraw(b1.getAmt());
		System.out.println("after withdrawal 2 bal: "+afterWithdraw);
		
			
		System.out.println("Final balance: ");
		//b1.setAmt(balance);
		b1.deposit();
		b1.setAmt(400);
		System.out.println(" Acc.Holder name:\t"+b1.getName()+"\n Amount brought Forward is \t"+b1.getAmt()+"\n Account Type: \t"+b1.getAccType()+"\n Account number : \t"+b1.getAccNo()+"\n"+"Annual Deposit by bank is: \t"+b1.getBal()+"\n Available Balance is: \t"+b1.deposit());
		
		}else
			System.out.println("invalid");}else
			{System.out.println("Invalid Acc.No.");}
		
		/*b1.deposit();
		BankingApp b2=new BankingApp
		*/
		
	}

}
