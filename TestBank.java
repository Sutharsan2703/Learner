package com.chainsys.day12;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		Bank b1=new Bank();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter User name");
		String userName=sc.next();
		System.out.println("Enter Tx id. ");
		int txPwd=sc.nextInt();
		b1.setUserName("A-z");
		b1.setTxPassword(54321);

		System.out.println(b1.getUserName());
		int txPassword=b1.getTxPassword();
		System.out.println(txPassword);
	}

}
