package com.chainsys.day3Exercise;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:\n");
		int number = sc.nextInt();
		if ((number % 2) == 0) {
			System.out.println("The Entered Number is Even ");
		} else {
			System.out.println("The Entered Number is Odd  ");
		}
	}

}
