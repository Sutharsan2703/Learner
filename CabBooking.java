package com.chainsys.day7;

import java.util.Scanner;

public class CabBooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char again;

		do {
			System.out.println("Enter the type of Cab as ->(1 for Mini ) ->(2 for Micro)  ->(3 for Prime) ");

			int in = sc.nextInt();
			System.out.println("Enter the km to travel: ");
			int km = sc.nextInt();
			int total;
			switch (in) {
			case 1: {
				if (km >= 5) {
					System.out.println("Rs. 8 for each km ");
					total = km * 8;
					System.out.println("Total amount to be paid is: Rs. " + total + "  Order Booked for Mini!");
				} else {
					System.out.println("Please give above 5 km");
					break;
				}
				break;
			}
			case 2: {
				if (km >= 5) {
					System.out.println("Rs. 10 per km  ");
					total = 10 * km;
					System.out.println("Total amount to be paid is: Rs. " + total + "  Order Booked for Micro !");
				} else {
					System.out.println("Please give above 5 km");
					break;
				}
				break;
			}
			case 3: {
				if (km >= 8) {
					System.out.println("Rs. 12 per km  ");
					total = km * 12;
					System.out.println("Total amount to be paid is: Rs. " + total + "  Order Booked for PRIME!");
				} else {
					System.out.println("Please give above 8 km");
					break;
				}
				break;
			}
			default: {
				System.out.println("Please enter Valid details !");
				break;
			}
			}

			System.out.println(
					"Confirm with the type? ( type only 'y' for Yes)   or   Not satisfied and select again is('n' for no)");
			again = sc.next().charAt(0);
			if (again == 'y') {
				// Random rand = new Random();
				// int rn = rand.nextInt() + 0;
				// int bookingNumber =((int)(float)Math.random()*10000);
				// int bookingNumber = (int) ((double)Math.random()*10000);
				int bookingId = (int) ((float) Math.random() * 1000000);
				System.out.println("Cab Booked! random number is:  " + bookingId
						+ "   Cab number and Driver mobile number to be delivered in SMS shortly");
			} else {
				System.out.println("Booking cancelled!");
			}
		}

		while (again == 'n');

	}
}
