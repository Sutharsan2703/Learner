package com.chainsys.day3;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		System.out.println("Enter your age"); 
		Scanner sc= new Scanner(System.in);
		int userAge= sc.nextInt();
		System.out.println("Enter Your Citizenship:");
		String nationality =sc. next();
		String state1 ="Tamilnadu", state2="Kerala";
		System.out.println("Enter your State:");
		String state =sc.next();
		System.out.println("Voter Id availability: ('y' or 'n')");
		char voterId= sc.next().charAt(0);
		 if (nationality .equals("Indian")||(nationality .equals("INDIAN"))||(nationality .equals("indian"))){
			 if(userAge>18) {
				 if((state .equals(state1))||(state .equals(state2)))
				 {  if(voterId == 'y')
				   {
			        System.out.println("user is Eligible to Vote :)");
			       }
				   else 
					 { System.out.println("Show VoterId to Vote");}}
		         else if((state != ("Tamilnadu"))||(state !=("Kerala"))){ 		
		        	 System.out.println("No Election scheduled for your State!");}
			 }
		 else { System.out.println("Not Elligible");}}
	}}