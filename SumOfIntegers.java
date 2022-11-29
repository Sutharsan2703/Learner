package com.chainsys.loops;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find average: ");

		// int in = sc.nextInt();
		int x = sc.nextInt();
		switch (x) {
		case 3:
			int n = 0;
			int i;
			for (i = 1; i <= 3; i++) {
				System.out.println(i);
				n = n + i;
			}
			System.out.println("Total  " + n);
			break;

		case 7:
			n = 0;
			for (i = 1; i <= 7; i++) {
				System.out.println(i);
				n = n + i;
			}
			System.out.println("Total  " + n);
			break;
		default: {
			System.out.println("Try again & Enter ONLY Three (3) or seven (7) ");
		}

		}
	}
}
