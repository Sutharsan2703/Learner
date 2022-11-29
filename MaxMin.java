package com.chainsys.loops;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of arrays to find Maximum or Minimum: ");
		int num = sc.nextInt();

		int[] array = new int[num];
		System.out.println("Declare Array values for each Index:");
		for (int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < num; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("Minivalue is: " + min);
		System.out.println("Maximum value is: " + max);

	}

}
