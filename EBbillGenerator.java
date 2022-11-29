package com.chainsys.day7;

import java.util.Scanner;

public class EBbillGenerator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the consumer Id:  ");
		int conId=sc.nextInt();
		System.out.println("Enter the Type of Consumer  (note: It must be begin with 'd' if Domestic and 'c' is Commercial tariff : )");
		char type=sc.next().charAt(0);
		if((type=='d')||(type=='c') ) {
		System.out.println("Enter the Name of the Consumer"); 
		String name=sc.next();
		System.out.println("Enter Number of Unit Consumed Previous reading: ");
		int pre=sc.nextInt();
		System.out.println("Enter the number of unit consumed currently: ");
		int cur=sc.nextInt();
		int reading=cur-pre;
		System.out.println(reading+" Unit consumed is calculated for bill  ");
		if(type=='d') {
			System.out.println("Enter the Unit as 1 for (1-100) & 2 for (101-500) & 3 for(501-700) & 4 for (701-1200) & 5 for (1200<unit)");
			int s=sc.nextInt();
			switch(s) {
			case 1://1-100 is free of cost
				int rs=0;
				System.out.println("There is free subsidy of Hundred unit ");break;
			case 2://101-500 is to pay rs. 10 per unit
			     rs=(reading-100)*10;
			     System.out.println("There is free subsidy of Hundred unit & the amount to be paid is: "+rs);break;
			
			}
			
		}
			
		}

	}

}
