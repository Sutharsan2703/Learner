package com.chainsys.day6;

import java.util.Scanner;

public class Calculating {

	public static void main(String[] args) {
		
		add();
		sub();
		mul();
	}

	public static void add() {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		int add= a+b;
		System.out.println("Addition of the two values:  "+add);
	}
	public static void sub() {
		int x=880,y=88;
		int sub= x-y;
		System.out.println("Subtraction between the values are: "+sub);
	}
	public static void mul() {
		int p=16,q=p;
		int mul=p*q;
		System.out.println("Multiplication : "+mul);
	}
	
}
