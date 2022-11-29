package com.chainsys.day8;

import java.util.Scanner;

public class GstBill {

	private static char result;

	/*
	 * get User name user to select category of Product actual GST % give amount of
	 * product name quantity and calc GST for purchase print bill amount
	 * 
	 * validate above
	 * 
	 * ask for coupon/discount
	 * 
	 * bill
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner
		int count=1;
		char again;
		do {
		long GST = 0, cost;
		System.out.println("Enter the name of the customer: (Note: It should be without space in case of space required use '.') ");
		String name = sc.next(); // get user name
		//String nm=name.trim();
		//System.out.println(nm);
		if(name.length()>=3) {
		Boolean user = name.matches("[a-z.A-Z]+");// validate- is that a name?
		if (user == true) {
			System.out.println("Enter the EmpId of the Attender: ");
			if (sc.hasNextInt()) { // val. emp id

				int id = sc.nextInt();
				System.out.println(
						"Enter the Category of Product : " + "\n" + "1 for Plastic" + "\n" + "2 or 3 for steel/Mobiles"
								+ "\n"/* +"3 for Mobiles"+"\n" */ + "4 for Textiles" + "\n" + "5 for Groceries");	// category
				int cat = sc.nextInt();
				int q;

				switch (cat) { // primary switch
				case 1:
					System.out.println("For Plastic Products the GST is 18% per quantity");
					System.out.println("Enter the product number: " + "\n" + "a.basket costs Rs.80" + "\n"
							+ "b. costs Rs.120" + "\n" + "c. costs Rs.180");
					char pro = sc.next().charAt(0);
					switch (pro) { // sub switch
					case 'a':
						System.out.println("Enter Quantity: ");

						q = sc.nextInt();
						cost = (q * 80);					//actual rate
						GST = cost + (cost * 18 / 100);		//rate includingGST
						System.out.println("The total amount included for the product with GST is " + GST);
						break;
					case 'b':
						System.out.println("Enter Quantity: ");
						q = sc.nextInt();
						cost = (q * 120);
						GST = cost + (cost * 18 / 100);
						System.out.println("The total amount included for the product with GST is " + GST);
						break;
					case 'c':
						System.out.println("Enter Quantity: ");
						q = sc.nextInt();
						cost = (q * 180);
						GST = cost + (cost * 18 / 100);
						System.out.println("The total amount included for the product with GST is " + GST);
						break;
					default:
						System.out.println("Invalid Input! (Note: inputs to be in limits of a,b,c)");break;
					}
					break;

				case 2:
				case 3:
					System.out.println("For Steels in kg/Mobiles on model Products the GST is 18% per quantity");
					System.out.println("Enter the product kg for Steel /model for mobiles: " + "\n" + "a. costs Rs.8000"
							+ "\n" + "b. costs Rs.12500" + "\n" + "c. costs Rs.18000");
					char prod = sc.next().charAt(0);
					switch (prod) {
					case 'a':
						System.out.println("Enter Quantity: ");
						q = sc.nextInt();
						cost = (q * 8000);
						GST = cost + (cost * 18 / 100);
						System.out.println("The total amount for the product included with GST is " + GST);
						break;
					case 'b':
						System.out.println("Enter Quantity: ");
						q = sc.nextInt();
						cost = (q * 12500);
						GST = cost + (cost * 18 / 100);
						System.out.println("The total amount for the product included with GST is " + GST);
						break;
					case 'c':
						System.out.println("Enter Quantity: ");
						q = sc.nextInt();
						cost = (q * 18000);
						GST = cost + (cost * 18 / 100);
						System.out.println("The total amount for the product included with GST is " + GST);
						break;
					default:
						System.out.println("Invalid Input! (Note: inputs to be in limits of a,b,c)");break;
					}
					break;
				case 4:
					System.out.println("For Textiles Products the GST is 12% per quantity");
					System.out.println("Enter the product letter: " + "\n" + "a. costs Rs.399" + "\n"
							+ "b. costs Rs.1280" + "\n" + "c. costs Rs.8550");
					char product = sc.next().charAt(0);
					switch (product) {
					case 'a':
						System.out.println("Enter Quantity: ");
						q = sc.nextInt();
						cost = (q * 399);
						GST = cost + (cost * 18 / 100);
						System.out.println("The total amount included for the product with GST is " + GST);
						break;
					case 'b':
						System.out.println("Enter Quantity: ");
						q = sc.nextInt();
						cost = (q * 1280);
						GST = cost + (cost * 18 / 100);
						System.out.println("The total amount included for the product with GST is " + GST);
						break;
					case 'c':
						System.out.println("Enter Quantity: ");
						q = sc.nextInt();
						cost = (q * 8550);
						GST = cost + (cost * 18 / 100);
						System.out.println("The total amount included for the product with GST is " + GST);
						break;
					default:
						System.out.println("Invalid Input! (Note: inputs to be in limits of a,b,c)");break;
					}
					break;
				case 5:
					System.out.println("For groceries Products the GST is: " + "\n"
							+ " 5% for Milk and Fruits or Vegetables" + "\n" + "18% GST for biscuits");
					System.out.println("Enter the product letter: " + "\n" + "a. Milk in litre " + "\n"
							+ "b. Vegetables and fruits in kg" + "\n" + "c. Biscuits per pack");
					char products = sc.next().charAt(0);
					switch (products) {
					case 'a':
						System.out.println("Enter Quantity of milk in litre: ");
						q = sc.nextInt();
						cost = (q * 45);
						GST = cost + (cost * 5 / 100);
						System.out.println("The total amount included for the product with GST is " + GST);
						break;
					case 'b':
						System.out.println("Enter Quantity of fruits and vegetables in kilogram: ");
						q = sc.nextInt();
						cost = (q * 65);
						GST = cost + (cost * 5 / 100);
						System.out.println("The total amount included for the product with GST is " + GST);
						break;
					case 'c':
						System.out.println(
								"Enter amount of Biscuits pack: " + "\n" + "d for rs. 10" + "\n" + "e for Rs.30");
						char bis = sc.next().charAt(0);
						switch (bis) {
						case 'd':
							System.out.println("Enter number of packs: ");
							q = sc.nextInt();
							cost = (q * 10);
							GST = cost + (cost * 18 / 100);
							System.out.println("The total amount included for the product with GST is " + GST);
							break;
						case 'e':
							System.out.println("Enter number of packs: ");
							q = sc.nextInt();
							cost = (q * 30);
							GST = cost + (cost * 18 / 100);
							System.out.println("The total amount included for the product with GST is " + GST);
							break;
						default:
							System.out.println("Invalid  ");break;
						}
						break;
					default:
						System.out.println("Invalid input!");
						break;
					}
					break;
				default: {
					System.out.println("Invalid Input! (Note: inputs to be in limits of a,b,c)");
					break;
				}

				}
				// billing phase
				while(GST>1) {
				System.out.println(
						"\n" + ".............................................................................");
				System.out.println("\n" + "					Happy shopping!");
				System.out.println("\n");
				System.out.println("\n");
				int ran = (int) ((float) Math.random() * 100067);
				System.out.println("		GST bill no: " + ran);
				System.out.println("\n");
				System.out.println("		Name of the customer: " + name);

				System.out.println("\n");
				System.out.println("		EmpId of the attender: " + id);
				System.out.println("\n");
				System.out.println("		Total bill amount to be paid is: " + GST);
				System.out.println(
						"\n" + ".............................................................................");
				System.out.println("\n");
				System.out.println("Do have any offer/coupon for discount ?  (Only y or n )");
				char result = sc.next().charAt(0);
				{if (result == 'y') {
					String code = "happycustomer";
					System.out.println("Enter coupon code!");
					String coupon = sc.next();
					if (code.equals(coupon)) {
						if ((GST>=100)&&(GST<=50000)) {
							System.out.println("Discount available for Rs.49/-");
							double disc = (GST - 49);
							System.out.println("\n"
									+ ".............................................................................");
							System.out.println("		Final bill amount to be paid is :" + disc + "\n"
									+ "		ThankYou Happy Customer ! Visit Again!  ");
							System.out.println("\n"
									+ ".............................................................................");
						break;
						} else {
							System.out.println("No more Discounts! purchased Less than Rs.100");
						break;}

					} else if (coupon.equals("wowshopping")) {
						if (GST >= 50000) {
							System.out.println("Discount available for Rs.4999/-");
							double disc = (GST - 4999);
							System.out.println("\n"
									+ ".............................................................................");
							System.out.println("		Final bill amount to be paid is :" + disc + "\n"
									+ "		ThankYou Happy Customer ! Visit Again!  ");
							System.out.println("\n"
									+ ".............................................................................");
						break;} else {
							System.out.println("No more Discounts! purchased Less than Rs.50000");
						break;}
					}

					else {
						System.out.println("Invalid!  ..Enter valid Coupon code");
					break;}
				}
				else if((result!='y')&&(result=='n')) {
					System.out.println("Coupon not available");
					System.out.println(
							"\n" + ".............................................................................");

					System.out.println("		Final bill amount to be paid is :" + GST + "\n"
							+ "		ThankYou Happy Customer ! Visit Again!  ");
					System.out.println(
							"\n" + ".............................................................................");
				break;
				}
				else
				{
					System.out.println("Invalid");

				}
				}
				}} else {
				System.out.println("Enter valid name  ");
			}
		} else {
			System.out.println("Enter valid id");}
		}else {System.out.println("invalid");}
		
		System.out.println(
				"Confirm Again? ( type only 'y' for Yes)   or   ('n' for no)");
		 again = sc.next().charAt(0);
		
	}while(again =='y');
		
while(again=='n') {
	System.out.println(
			"\n" + ".............................................................................");

	System.out.println("ThankYou Happy Customer ! Visit Again!  ");
	System.out.println(
			"\n" + ".............................................................................");
break;
	
}
	}
}