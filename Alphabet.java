package com.chainsys.patterns;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter (1 to 26)Alphabet order Pattern to print (Right angle Triangle)");
		System.out.println("Enter 6 to print upto F: ");
		int num = sc.nextInt();
		if (num <= 26) {

			char alpha = 'A'; // initializing char a
			for (int i = 0; i < num; i++) { // loop to print (vertical)rows
				for (int j = 0; j <= i; j++) { // loop (horizontal)columns to actual performance we expect (i loops as
												// no of rows one is A and two for BB and three for CCC etc..s)
					System.out.print(alpha); // print output on same line
				}
				System.out.println(); // enter new line after printing each loop exists
				alpha++; // increment the character value
			}

		} else {
			System.out.println("Enter limit within 1 to 26 as Alphabet order (1 for 'A' --- 26 for 'Z'");
		}
	}
}