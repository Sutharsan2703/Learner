package com.chainsys.day3Exercise;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float discount = 10;
		int price = 100;
		System.out.println("Enter the quantity of items purchased: ");
		int unit = sc.nextInt();

		if (unit >= 10) {
			float discountAmount = ((unit * price) / 10);
			float total = (unit * price) - discountAmount;
			System.out.println("Total Amount to be paid by the User is Rs. " + total);
		} else {
			float total = (unit * price);
			System.out.println("Amount to be paid is: Rs. " + total);
		}

	}
}
