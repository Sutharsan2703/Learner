package com.chainsys.day3Exercise;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length and Breadth: (in cm)");
		int length = sc.nextInt(), breadth = sc.nextInt();
		if ((length != 0) && (breadth != 0))
			if (length == breadth) {
				System.out.println("The entered is Square :)");
			} else {
				System.out.println("Rectangle");
			}
		else {
			System.out.println("Invalid entry");
		}
	}
}
