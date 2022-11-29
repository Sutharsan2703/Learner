package com.chainsys.day8;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] mobileNumber = { 6789, 234567, 9867, 34567 };
		Arrays.sort(mobileNumber);
		for (int i = 0; i < mobileNumber.length; i++) {
			System.out.println(mobileNumber[i]);
		}
		System.out.println(Arrays.binarySearch(mobileNumber, 234567));

		int compare = Arrays.compare(mobileNumber, mobileNumber);
		System.out.println(compare);

		Arrays.fill(mobileNumber, 98765);
		System.out.println(mobileNumber[3]);
		Arrays.mismatch(mobileNumber, mobileNumber);
		
	}

}
