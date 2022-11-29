package com.chainsys.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to Array: ");
		int num = sc.nextInt();
		int a[] = new int[num];
		int b[] = new int[num];
		int i;
		System.out.println("Enter element:");
		for (i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Reverse order of a string: ");
		for (i = a.length - 1; i >= 0; i--) {
			b[i] = a[i];
			System.out.println(b[i]);
		}
	}
}
