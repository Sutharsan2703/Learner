package com.chainsys.patterns;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAdjacent {

	/*
	 * enter array size (4)
	 * 
	 * array value 9,9,4,5
	 * 
	 * sort array
	 * 
	 * array-1 && array -2
	 * 
	 * MaxProduct
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("(Array size ) Enter the number of number to find the Product: ");
		int arraySize = sc.nextInt(); // array size
		int i, j, k;
		int array[] = new int[arraySize]; // position to store array values
		System.out.println("Enter the array values: ");
		for (i = 0; i < array.length; i++) { // store array values on their address
			array[i] = sc.nextInt();
		}

		Arrays.sort(array); // array sort as ascending order
		System.out.println("\n" + "The Sorted Arrays are: " + "\n");
		for (k = 0; k < array.length; k++) {
			System.out.println(array[k]); // print sorted arrays
		}

		int maxProduct = array[array.length - 1] * (array[array.length - 2]);// product of max two numbers

		System.out.println("MaxProduct is : " + maxProduct);

	}

}
