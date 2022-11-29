package com.chainsys.day7;

import java.util.Scanner;

public class RePrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operator: ");
		char op=sc.next().charAt(0);
		
		
		add();
		sub();
		mul();
		mod();
		div();		}//operation method
	
		
		
		
		public static void add() {
			Scanner sc=new Scanner(System.in);
			int a =sc.nextInt();
			int b = sc.nextInt();
			int add= a+b;
			System.out.println("Addition of the two values:  "+add);
		}
		public static void sub() {
			Scanner sc=new Scanner(System.in);
			int a =sc.nextInt();
			int b = sc.nextInt();
			int sub= a-b;
			System.out.println("Subtraction between the values are: "+sub);
		}
		public static void mul() {
			Scanner sc=new Scanner(System.in);
			int a =sc.nextInt();
			int b = sc.nextInt();
			int mul=a*b;
			System.out.println("Multiplication : "+mul);
		}
		public static void div() {
			Scanner sc=new Scanner(System.in);
			int a =sc.nextInt();
			int b = sc.nextInt();
			int div=a/b;
			System.out.println("Division : "+div);
		}
		public static void mod() {
			Scanner sc=new Scanner(System.in);
			int a =sc.nextInt();
			int b = sc.nextInt();
			int mod=a%b;
			System.out.println("Modulus:  "+mod);}

}
