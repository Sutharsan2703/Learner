package com.chainsys.loops;

public class AdditionOutput {

	public static void main(String[] args) {
		int a = 4; // 4
		a++; // 5
		a += a; // 10
		--a; // 9
		a = 7 + a; // 16
		a *= a; // 256
		a -= 3; // 253

		System.out.println("a = " + a); // 253

	}

}
