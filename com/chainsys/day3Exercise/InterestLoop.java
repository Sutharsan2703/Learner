package com.chainsys.day4;

import java.util.Scanner;

public class InterestLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principle Amount: ");
		int principle = sc.nextInt();
		System.out.println("Enter The Interest Percentage: ");
		int interest = sc.nextInt();
		System.out.println("Enter the Term: ");
		int term = sc.nextInt();

		// interest=(principle*rate*term)/100

		// rate= (principle*term)/(interest*100)

		int rate = (principle / interest) * term;

		System.out.println("rate of Interest; " + rate);

		int total = principle + rate;
		System.out.println("Total Amount to be paid : " + total);

		int month = total / (term * 12);
		System.out.println("Paid per month: " + month);

		for (int i = total; i >= 0;) {
			System.out.println("" + i);
			i = i - month;
		}
	}

}
