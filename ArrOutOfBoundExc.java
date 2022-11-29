package com.chainsys.day10;

public class ArrOutOfBoundExc {

	public static void main(String[] args) {
		int i;
		int[] platformNo = { 3, 5, 7, 1};
		for(i=0;i<=5;) {
			System.out.println(platformNo[i]);
			i++;
		}

	}

}
