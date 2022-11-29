package com.chainsys.day10;

public class ArithExcep {

	public static void main(String[] args) {
		int no1 = 12, no2 = 0, no3 = 12;

		try {
			int result = no1 + no2;
			System.out.println(result);
			float avg = no1 / no3;
			System.out.println(avg);
			int avg1 = no1 / no2;
			System.out.println(avg1);
		}catch (ArithmeticException av) {
			System.out.println(av.getMessage());
		}
	}

}
