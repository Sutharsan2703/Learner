package com.chainsys.loops;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		System.out.println("Enter the Gender male(M) Or female(F) :");
		char g = sc.next().charAt(0);

		if ((g == 'f') || (g == 'F')) {
			if (age > 20) {
				System.out.println("Woman");
			} else {
				System.out.println("Girl");
			}
		} else if ((g == 'm') || (g == 'M')) {
			if (age < 25) {
				System.out.println("Boy");
			} else {
				System.out.println("Man");
			}
		} else {
			System.out.println("Invalid input! ");
		}
	}
}
