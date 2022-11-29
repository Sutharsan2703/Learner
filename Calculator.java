package com.chainsys.day11;

public class Calculator {

	//overloading
	 
	
	public static void main(String[] args) {
		
		addition();
		addition(0.8);
		addition(77.9f,66.9f,55);
		addition(55,10,0);
		addition(7,89);
	}

	
	//method definition
	//in the class there can use multiple methods with same name  within a class by passing or without passing arguments
	
	public static void addition() {
	int a=5,b=4;
	System.out.println("Addition of two "+(a+b));
	}
	
	public static void addition(double n) {
		System.out.println(n++);
		System.out.println(++n);
	}
	
	public static void addition(float a,float b,int e) {
		System.out.println("Addition of two float : "+(a+b+e));
		
	}
	
	public static void addition(int c,int d) {
		System.out.println("Addition of two int: "+(c+d));
		}
}
