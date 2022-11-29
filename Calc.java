package com.chainsys.day3Exercise;

import java.util.Scanner;

//add, sub, multiply, divide, modulus, 
public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to be Operated: \t");
		int num1 = sc.nextInt();
		System.out.println("Enter the number to Operate \t");
		int num2 = sc.nextInt();
		System.out.println("Enter the Operand:  \t");
		char operator = sc.next().charAt(0);

		if ((operator == '+') || (operator == '*') || (operator == '-') || (operator == '/') || (operator == '%'))
			if ((operator == '+') || (operator == '*')) {
				if (operator == '+') {
					System.out.println("" + ((+num1) + (+num2)));
				} else {
					System.out.println("" + ((+num1) * (+num2)));
				}
			} else if ((operator == '-') || (operator == '/') || (operator == '%'))
				if (operator == '-') {
					System.out.println("" + ((+num1) - (+num2)));
				}

				else if (operator == '/') {
					System.out.println("" + ((+num1) / (+num2)));
				}

				else {
					System.out.println("" + ((+num1) % (+num2)));
				}
			else {
				System.out.println("Invalid Search");
			}

	}

}
