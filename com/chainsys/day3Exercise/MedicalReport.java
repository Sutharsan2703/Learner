package com.chainsys.day3Exercise;

import java.util.Scanner;

public class MedicalReport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of the Candidate: ");
		String name = sc.next();
		System.out.println("Enter the total number of classes held: ");
		float classHeld = sc.nextFloat();
		System.out.println("Enter the number of classes attended by the candidate:");
		float attendance = sc.nextFloat();
		System.out.println("name" + name);
		System.out.println("Total no. of class " + classHeld);
		System.out.println("class attended " + attendance);

		float result = ((attendance/classHeld)*100);
		System.out.println("Percentage of attendance :"+result);

		if(result > 75) {
			System.out.println("Student is allowed to sit in exam");
		}
		else 
		    System.out.println("Do the candidate have any medical cause?  (only y for Yes & n for No)");
		    char medi=sc.next().charAt(0);
		     System.out.println(""+medi);
		     { if(medi=='y')
				{System.out.println("Student is permitted!");}
		       else 
		      {
		    	  System.out.println("Student is not allowed to sit in the Exam  (Not elligible)");}
		}
	}}
	


