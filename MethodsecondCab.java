package com.chainsys.day10;

public class MethodsecondCab {

	public static void main(String[] args) {
		//method call / invocation
		
	cabBooking("Prime",5,65);
	cabBooking("Micro",4,8);
	cabBooking("Auto",3,25);
	}
// method with void return type with arguments
	//method definition
	
	public static void cabBooking(String car,int noOfMembers,int km) {
		System.out.println("Selection of car🚗  " +car+  "\n"+"//No. of Members👪  "  +noOfMembers+ "\n"+"//km    "+km+"\n");
		
	}
	
	//int - no. of members,km
	//String - Car type
	
}
