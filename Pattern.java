package com.chainsys.day9;

public class Pattern {
	/*
	 * pattern
	 * 7	- 1010101	=85
	 * 5	-  10101	=21
	 * 3	-	101		=5
	 * 1	-	 1		=1
	 * 
	 * */
	public static void main(String[] args) {
		int num[]= {85,21,5,1};
int i,j;

		for(i=0;i<num[3];i++)//outer loop for no. of rows
		{
			for(j=0;j<num[3];j++)//inner loop for spaces
			{
			System.out.print(num[i]);//to leave space
			
	
			//for(k=0;k<=2;k++)//inner loops for no. of columns
		//	{
				//int ans=k%2;//binary printer
			//	System.out.println();}
			}
			System.out.println();//ending line for each row
		//num[0]++;	
		}
	
	System.out.println();
	}
	}
