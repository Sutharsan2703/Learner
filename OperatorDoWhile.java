package com.chainsys.day7;

import java.util.Scanner;

public class OperatorDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char in;
		do {
			System.out.println("Enter two number : ");

			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Enter the operator:  (+,-,*,/,%) ");
			char op = sc.next().charAt(0);

			switch (op) {
			case '+': {
				System.out.println("add " + (a + b));
				break;
			}
			case '-': {
				System.out.println("sub " + (a - b));
				break;
			}
			case '*': {
				System.out.println("mul  " + (a * b));
				break;
			}
			case '/': {
				System.out.println("div  " + (a / b));
				break;
			}
			case '%': {
				System.out.println("mod  " + (a % b));
				break;
			}
			default: {
				System.out.println("Enter valid ");
				break;
			}
			}
			System.out.println("Do you want to continue ?3 only 'y' or 'n'");
			in = sc.next().charAt(0);

		} while (in=='y');
	}
}
