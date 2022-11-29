package com.chainsys.loops;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int input = sc.nextInt();

		if ((input % 3 == 0) && (input % 5 == 0)) {
			System.out.println("The Entered number is FIZZ BUZZ");
		} else if (input % 3 == 0) {
			System.out.println("it is Fizz");
		}

		else if (input % 5 == 0) {
			System.out.println("it is Buzz");
		} else {
			System.out.println(input);
		}
	}

}
