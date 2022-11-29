package com.chainsys.day8;

public class pattern2 {

	public static void main(String[] args) {
		int i,j;
		char k='a';
		for(i=1;i<=7;i++) {
			for(j=1;j<i+1;j++) {
				System.out.println(k++ +" ");
			}
			System.out.println();
		}

	}

}
