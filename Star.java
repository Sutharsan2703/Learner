package com.chainsys.patterns;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of lines to print Star Pattern (Right angle Triangle)");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			{
				System.out.print("*");
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

	}

}
