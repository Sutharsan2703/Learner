package com.chainsys.day10;

public class TestArrOut {

	public static void main(String[] args) {
		
		int[] platformNo = { 3, 5, 7, 1};
		int i;
		try {
		for(i=0;i<=20;i++) 
			System.out.println(platformNo[i]);
			i++;
		}
		catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());}
		
			
	}

}
