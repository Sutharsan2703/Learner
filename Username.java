package com.chainsys.day9;

public class Username {

	public static void main(String[] args) {
		
		int age =2;
		if(age>18) {
			System.out.println("Eligible");
		}else
			throw new InvalidAgedException();
	}

}
