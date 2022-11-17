package com.chainsys.day3;

import java.util.Scanner;

public class Operater {

	public static void main(String[] args) {
		//Unary -,++,--
		//x=5
		System.out.println("Enter Any Number: ");
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		System.out.println(x++);	//(x=x+1->x-5(+1)//5
		System.out.println(x);		//6
		System.out.println(++x);	//x=1+x=->1+6//7
		System.out.println(x--);	//7
		System.out.println(x);		//6
		System.out.println(--x);	//5
		System.out.println(x);		//5
	}

}
