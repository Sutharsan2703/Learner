package com.chainsys.day8;

public class Pattern3 {

	public static void main(String[] args) {
		int rows = 5;
		for (int i = rows; i >= 1; --i) {// for looping the rows
			for (int j = 1; j <= i; ++j) {// for looping the columns
				System.out.println("  * ");// prints the star pattern
			}
			System.out.println();// get newline
		}
	}

}
