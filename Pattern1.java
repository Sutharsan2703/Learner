package com.chainsys.day8;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		//to print * pattern in right angled triangle
	//	Scanner sc= new Scanner(System.in);
//System.out.println("Enter the number of line that the star pattern to be Printed");
	//int num=sc.nextInt();
	int num=5,i,j;
	for(i=0;i<num;i++)//outer loop for no. of rows
	{
		for(j=num-i;j>i-2;j--)//inner loop for spaces
		{
		System.out.print(" ");//to leave space
		}
		for(j=0;j<=i;j++)//inner loops for no. of columns
		{System.out.print(" * ");//star printer
		}
		System.out.println();//ending line for each row
		}
		
	}
	}


