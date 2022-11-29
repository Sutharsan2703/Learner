package com.chainsys.day10;

import java.util.Scanner;

public class Train {
	Scanner sc= new Scanner(System.in);
//todo get source, destination validate print ticket
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("         Railways   ");
		processTicket();
		chooseRail(null, 0);
		locatePlace(null, null);
		
		
	
	}


	public static void chooseRail(String name,int railNo) {
		Scanner sc= new Scanner(System.in);
		String railName;
		System.out.println("Enter passenger name: ");
		 name = sc.next(); 
		if(name.length()>=3) {
			Boolean user = name.matches("[a-z.A-Z]+");
			if (user == true) {
		railNo = (int) ((float) Math.random() * 100067);
		System.out.println("    TrainNo		" + railNo);
		if(railNo<50000) {
			railName="Yellove Express";
			System.out.println("   Train Name   "+railName);
			
			
		}else {
			railName="Rockfort Express";
			System.out.println("   Train Name   "+railName);
			
		}
	
			}else System.out.println("Input must be Only a group of characters ");	
	}
		else System.out.println("Invalid Name size");
		
	}
	
	public static void processTicket() {

		int val = (int) ((float) Math.random() * 11067);
		System.out.println("   Ticket No: "+val);
	//	System.out.println("   Train Name   "+);
		
		
	}
	
	private static void locatePlace(String source,String dest) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter source");
		 source=sc.next();
			if(source.length()>=3) {
				Boolean user = source.matches("[a-z.A-Z]+");
				if (user == true) {
					System.out.println("Enter Destination");
					String destination=sc.next();
					
					if(destination.length()>=3) {
						Boolean destUser = source.matches("[a-z.A-Z]+");
						if (destUser == true) {
							
							
							System.out.println("Your Source is: (Note : It is the name of some native So it was been printed as per User's request) "+"\n"+"\n"+source+"\n"+"\n" );
							System.out.println("Your Destination is: (Note : It is the name of some native So it was been printed as per User's request) "+"\n"+"\n"+destination+"\n"+"\n" );
							System.out.println("   Railways Ticket   ");
							System.out.println(source+"\t"+"to"+"\t"+destination);
							System.out.println("Railway Booking Confirmed!  ");
						}else {
							System.out.println("Invalid!");
						}
					}else {System.out.println("Invalid!!");}
						
					
					
				}else {System.out.println("Invalid!!!");};
			}else {System.out.println("Invalid!! !!");};
	}
}
