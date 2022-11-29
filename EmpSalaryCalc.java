package com.chainsys.mavendemo.salary;

import java.util.Scanner;

public class EmpSalaryCalc {

	/*display take home salary
	 * 
	 * input gross salary
	 * 
	 * deductions- pf,hra,ma
	 * 
	 * 
	 * yearly calculations
	 * yearly calculations
	 */
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employee:");
		int n=sc.nextInt();
		System.out.println("Enter Employee name: ");
		char empArray[]=new char[n];
		for(int i=0;i<empArray.length;i++) {
			
			String name[]= new String[i];
			String empName=new String(name[i]);
			System.out.println(name);}
			
	
			
		
		//salary();
		
		System.out.println("Enter gross Salary "); 
		int salary=sc.nextInt();
		 
		yearlyTakeHome(salary);
		//System.out.println(salary);
	monthlyTakeHome(salary);
	
	//float monthlyTakeHome=monthlyTakeHome(salary);
	//System.out.println(salary);
		
		boolean promotion=promotion("juniordeveloper",5);
		System.out.println(promotion);
		
		String role=roles("juniordeveloper");
		System.out.println(role);}
		
	

	public static float monthlyTakeHome(int salary) {
		float yearDeduct=(salary*6/100);
		System.out.println("yd "+yearDeduct);
		float monthDeduct=yearDeduct/12;
		System.out.println("md "+monthDeduct);
		float month=(salary/12)-monthDeduct;
		System.out.println("Salary take home per month is Rs. "+month);
		return month;
	
		
		
	}

	public static int yearlyTakeHome(int salary) {
		
		
		float year,PF,HRA, MA;
		float deduction;int takeHome;
		
		if (salary>500000) {
		
		 PF= (salary*3/100);
		 HRA=(salary*4/100);
		 MA=(salary*2/100);
		deduction=(PF+HRA+MA);
		takeHome=(int)(salary-deduction);
		}else 
		{
			 PF= (salary*2/100);
			 HRA=(salary*3/100);
			 MA=(salary*1/100);
			deduction=(PF+HRA+MA);
			takeHome=(int)(salary-deduction);
		}
		 System.out.println("PF deduction per year is : "+PF);
		 System.out.println("HRA deduction per year is : "+HRA);
		 System.out.println("MA deduction per year is : "+MA);
		 
		 System.out.println("Deduction per year is : "+deduction);
		 System.out.println("salary taken Home per year is : "+takeHome);
		return takeHome;
	
	
	}
	

public static Boolean promotion(String designation, int yearsOfExp) {
	
	if(yearsOfExp>6) {
		System.out.println("Yes");
		return true;
	}else
		return false;
}
	

public static String roles(String designation) {
	if(designation.equals("juniordeveloper"))
		return "You are into development";
	else 
		return "Admin";
}
	
}
	
	
//}
