package com.chainsys.day10;

import java.util.Scanner;

public class MusicPl {
	Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int bill;
		char accountAccess;
		welcomeCustomer();
		//displayMenu();
		
		logOn();
		
		System.out.println("Enter Account to access! 'y' no 'n' ");
         accountAccess=sc.next().charAt(0);
        System.out.println("Enter amount to pay: only in Rs. ");
        bill=sc.nextInt();
        usage(accountAccess,bill);
	}
	
	public static void usage(char accountAccess,int bill) {
		if(accountAccess=='y') {
		System.out.println("Allowed to Login "+"\n"+accountAccess+"ready to pay(Rs. 30 or 49)?  )"+bill);}
		else
			System.out.println("Allowed to Login "+"\n"+accountAccess+"ready to pay(Rs. 30 or 49)?  )"+bill);
		
		
	}
	
	
	public static void displayMenu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select the type of account: "+"\n\t"+" 1 - budgetPack"+"\n\t"+"2 - partial Pack"+"\n\t"+"3 - classic"+"\n\t"+"4 - premium");
		System.out.println("Enter Music Music Account type  π΅πΆπΌ:-)");
		//String input = sc.nextLine();
		
		logOn();
	}
	
	
	public static void welcomeCustomer() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name: π");
		String userName= sc.nextLine();
		if(userName.length()>=3) {
			Boolean user = userName.matches("[a-z.A-Z]+");// validate- is that a name?
	if (user == true) {
		System.out.println("Welcome π"+ userName);
		System.out.println("Login to access β‘οΈ");
		displayMenu();
	}else System.out.println("Invalid");
		}else System.out.println("Invalid");
	}
	
	
	public static void logOn() {
		Scanner sc= new Scanner(System.in);
		System.out.println(" ");
		 int pack=sc.nextInt();
		if((pack<5)&&(pack>0)) {
		switch(pack) {
		case 1:
		
		System.out.println("Pay Rs.30 for 28 days π 20 advertisements per 100 minutes (contains 5 sec per ad) "+"\n"+"Is it ok?"+"\n"+"only y or n");
		char get=sc.next().charAt(0);
		if (get=='y') {
			System.out.println("Now you can choose the Genere of Music 1- HipHop 2- Classic 3-Rap");
			int g=sc.nextInt();
			switch(g) {
			case 1:
				{System.out.println("You selected Hip Hop πΆ Music "+"\n"+"Select Language & artist  : ");}break;
			case 2:
				{System.out.println("You selected Classic πΆ Music "+"\n"+"Select Language & Artist : ");}break;
			case 3:
				{System.out.println("You selected Rap πΆ Music "+"\n"+"Select Language & Artist : ");}break;
			default: System.out.println("invalid!");break;
			} break;
	
		}	
		else 
		{System.out.println("Upgrade to Premium β");
		}
		
	
		case 2:
			
			System.out.println("pay Rs 49 for 25 days π 5 advertisements per 60 minutes (contains 5 sec per ad) & only any one language + Two Generes +Three Artists can be picked!   "+"\n"+"Is it ok?"+"\n"+"only y or n");
			char getit=sc.next().charAt(0);
			if (getit=='y') {
				System.out.println("Now you can choose the Genere of Music 1- HipHop 2- Classic 3-Rap");
				int g=sc.nextInt();
				switch(g) {
				case 1:
					System.out.println("You selected Hip Hop πΆ Music "+"\n"+"Select Language & artist  : ");break;
				case 2:
					System.out.println("You selected Classic πΆ Music "+"\n"+"Select Language & Artist : ");break;
				case 3:
					System.out.println("You selected Rap πΆ Music "+"\n"+"Select Language & Artist : ");break;
				default: System.out.println("invalid!");break;
				} break;
		
			}	
			else 
			{System.out.println("Upgrade to Premium β");}
			
			
		
	}
		
	public static void logOn(String pack,int bill) {
		/*Scanner sc=new Scanner(System.in);
		pack = sc.next();
		if (pack.equals("basic")) {
			bill=30;
		}else if (pack.equals("Premium")) {
			bill=49;
		}else {System.out.println("Invalid");}*/
			
		
	}
		
	
	/*train
	 * 
	 * method definition
	 * method invoke--test
	 * train name,no,source , destination != null, source!= destination validation
	 * 
	 */
		
	

	}else {System.out.println("Enter valid pack details!");}
		
	}
		}
