package com.chainsys.day3Exercise;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		System.out.println("Enter the Mark");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();

		if ((marks > 25) && (marks < 100)) {
			if (marks > 50)
				if (marks > 80) {
					System.out.println("A");
				}

				else if ((marks > 60) && (marks <= 80)) {
					System.out.println("B");
				}

				else {
					System.out.println("C");
				}

			else if (((marks > 45) && (marks <= 50))) {
				System.out.println("D");
			}

			else if (((marks > 25) && (marks <= 45))) {
				System.out.println("E");
			}
		} else if (marks <= 25) {
			System.out.println("F");
		} else {
			System.out.println("Invalid data");
		}

	}
}
