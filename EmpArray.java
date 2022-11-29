package com.chainsys.day5;

import java.util.Scanner;

public class EmpArray {

	public static void main(String[] args) {
		System.out.println("Enter no. of Employees:");
		Scanner sc=new Scanner(System.in);
	
		int emp = sc.nextInt();
		
		String[] name= new String[5];
		
		Array[] emp= new Array[5];
		
		emp[0] = new emp(12,"Ant","employee");
		emp[1] = new emp(13,"Bat","visiter");
		emp[2] = new emp(14,"cow","searcher");
		
		for(int i=0;i<= emp.length;i++) {
			System.out.println("Emp. name:  "+ emp[i].name);
			System.out.println("Emp. id: "+ emp[i].empid);
			System.out.println("Emp. desg: "+emp[i].desg);
			
		}
		
	}

}
