package com.chainsys.day3Exercise;

import java.util.Scanner;

public class WithdrawATM {

	public static void main(String[] args) {

		String Name = "Mac";
		int cash = 1000000;
		int pin1 = 2345;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin");
		int pin = sc.nextInt();

		if (pin1 == pin) {
			System.out.println("enter 1 for Withdraw amount or enter 2 to check balance");
			int n = sc.nextInt();

			switch(n) {
			case 1:

				System.out.println("Enter the Amount: (within limit of not exceeding Rs.45,000) ");
				int debit = sc.nextInt(); {
				if (debit <= 45000) {
					System.out.println("Receive Rs. " + debit);
					System.out.println("Balance Available is : " + (+cash - +debit));
				} else {
					System.out.println("Entered Amount is not within limit ! Try again within limits");
				}
				break;
			}
			case 2: {
				System.out.println("Your balance is: Rs. " + cash);
				break;
			}
			
			default: {
				System.out.println("Invalid Entry!");
			}break;

			}
		} else {
			System.out.println("invalid transaction! ");
		}
	}
}
