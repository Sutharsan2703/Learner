package com.chainsys.day10;

import java.util.Scanner;

public class MethodsEx1 {

	
	public static void displayMenu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select the type of account: "+"\n\t"+"budgetPack"+"\n\t"+"partial Pack"+"\n\t"+"classic"+"\n\t"+"premium");
		System.out.println("Enter Music Music Account type  🎵🎶🎼:-)");
		String input = sc.nextLine();}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		welcomeCustomer();
		displayMenu();
		budgetPack();
		partialPack();
	}
		
		public static void welcomeCustomer() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the name: 🙂");
			String userName= sc.nextLine();
			System.out.println("Welcome 🎉"+ userName);
			System.out.println("Login to access ➡️");}
		
		public static void budgetPack() {
			Scanner sc= new Scanner(System.in);
			System.out.println("20 advertisements per 100 minutes (contains 5 sec per ad) "+"\n"+"Is it ok?"+"\n"+"only y or n");
			char get=sc.next().charAt(0);
			if (get=='y') {
				System.out.println("Now you can choose the Genere of Music 1- HipHop 2- Classic 3-Rap");
				int g=sc.nextInt();
				switch(g) {
				case 1:
					System.out.println("You selected Hip Hop 🎶 Music "+"\n"+"Select Language & artist  : ");break;
				case 2:
					System.out.println("You selected Classic 🎶 Music "+"\n"+"Select Language & Artist : ");break;
				case 3:
					System.out.println("You selected Rap 🎶 Music "+"\n"+"Select Language & Artist : ");break;
				default: System.out.println("invalid!");break;
				} 
		
			}	
			else 
			{System.out.println("Upgrade to Premium ✅");
			}
}
			public static void partialPack() {
				Scanner sc= new Scanner(System.in);
				System.out.println("5 advertisements per 60 minutes (contains 5 sec per ad) & only any one language + Two Generes +Three Artists can be picked!   "+"\n"+"Is it ok?"+"\n"+"only y or n");
				char get=sc.next().charAt(0);
				if (get=='y') {
					System.out.println("Now you can choose the Genere of Music 1- HipHop 2- Classic 3-Rap");
					int g=sc.nextInt();
					switch(g) {
					case 1:
						System.out.println("You selected Hip Hop 🎶 Music "+"\n"+"Select Language & artist  : ");break;
					case 2:
						System.out.println("You selected Classic 🎶 Music "+"\n"+"Select Language & Artist : ");break;
					case 3:
						System.out.println("You selected Rap 🎶 Music "+"\n"+"Select Language & Artist : ");break;
					default: System.out.println("invalid!");break;
					} 
			
				}	
				else 
				{System.out.println("Upgrade to Premium ✅");}
				
			}
	

