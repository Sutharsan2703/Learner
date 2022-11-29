package com.chainsys.loops;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find average: ");
		int in = sc.nextInt();
		float n = 0;
		int i;
		for (i = 1; i <= in; i++) {
			System.out.println(i);
			n = n + i;
		}
		System.out.println("Total  " + n);
		float avg = n / in;
		System.out.println("Average :  " + avg);

	}

}
