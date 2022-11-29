package com.chainsys.day2;

import java.util.Scanner;

public class TestCalc {

		public static void main(String[] args) {
		 Calc calc = new Calc();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Two Numbers for operations");
		 int num1= sc.nextInt();
		 int num2= sc.nextInt();
		 Calc.a= num1;
		 Calc.b= num2;
		 System.out.println(num1 +num2);
		}

}
