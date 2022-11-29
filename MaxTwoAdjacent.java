package com.chainsys.patterns;

import java.util.Scanner;

public class MaxTwoAdjacent {

	/*array1 * array2 = 2
	 * array2* array3 = 6
	 * array6* array8 =48
	 * array5*array6  =30
	 * 
	 * print array6*8=48 as maximum
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int array[] = {9,9,4,5};
		
		int i;
		for( i=0;i<3;i++) {
			array[i]=array[0]*array[1];
			System.out.println(array[i]);
			array[i]++;
		}
	}

}
