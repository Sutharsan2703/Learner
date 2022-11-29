package com.chainsys.array;

import java.util.Scanner;

public class ProductOfAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number array elements: ");
		int num = sc.nextInt();
		int[] a = new int[num];
		a = new int[num];
		int i, sum = 0, product = 1;
		System.out.println("Enter element:");
		for (i = 0; i < num; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
			product = product * a[i];
			System.out.println("Product of the array is: " + product);
			System.out.println("Sum of the Array is: " + sum);
		}
	}
}
