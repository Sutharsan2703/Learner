package com.chainsys.patterns;

import java.util.Scanner;

public class FascinatingNumbers {

	/*
	 * Fascinating - result must contains all digits from 1 to 9 present only once
	 * and not to be repeated
	 * 
	 * 327,273,219,192
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number (within limit of 1000 only) to check is it Facinating Number!");
		int num = sc.nextInt();
		int i, fas;
		if ((num == 327) || (num == 273) || (num == 219) || (num == 192)) {
			// int array[]=new int[3];
			for (i = 1; i <= 3; i++) {
				fas = num * i;
				// System.out.println(fas);
				System.out.print(fas);
				// System.out.print(+fas);
				// System.out.print(+fas);

				// array[0]=fas;
				// System.out.println(array);
				// array[0]++;

			}

		} else {
			System.out.println("Not a Fascinating Number! ");
		}
		System.out.println("\n"+"Fascinating Number!");

	}

}
