package com.chainsys.patterns;

import java.util.Scanner;

public class PyramidNumPattern {

	/*
	 * 1 2 2 3 3 3 4 4 4 4
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows for Pyramid : ");
		int num = sc.nextInt();
		int n = 1;
		for (int i = 0; i < num; i++) {
			// System.out.println(" ");

			for (int j = 0; j <= i; j++) {
				for (int k = 0; k <= num - i; k++) {
					System.out.print(" ");
				}
				System.out.print(" " + n);
			}
			System.out.println();
			n++;
		}

	}

}
