package com.chainsys.loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range limit for fibbonacci: ");
		int lim = sc.nextInt();

		int num1 = 0, num2 = 1;
		System.out.println(num1);

		for (int i = num1; i < lim; i++) {

			i = num1 + num2;
			num1 = num2;
			num2 = i;
			System.out.println(num1);
		}

	}

}
