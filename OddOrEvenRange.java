package com.chainsys.loops;

import java.util.Scanner;

public class OddOrEvenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get Odd or Even");
		int getNumber = sc.nextInt();
		int i;
		for (i = 1; i <= getNumber; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " Even");
			}

			else {
				System.out.println(i + " Odd");
			}
		}
	}

}
