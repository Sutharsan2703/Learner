package com.chainsys.day2;

public class TestBook {
	public static void main(String[] args) {
		Book book1= new Book();
		book1.BookTitle = "Java";
		book1.bookISBN= 456789;
		book1.author="James";
		book1.noOfPages=770;
		book1.nameOfPublication="pqr Publications"; 
		book1.address="No.16,makkabmanaya, iannehc";
		book1.mailId="fedcba@xyz.com";
		book1.phoneNumber=7890654321l;
		book1.availability=true;
		book1.cost="INR .545";
	System.out.println("\n Title:\t");
	System.out.println(book1.BookTitle);
	System.out.println("\n ISBN Number is: \t");System.out.println(book1.bookISBN);
	System.out.println("\n Name of the Author: \t");System.out.println(book1.author);
	System.out.println("\n Number of Pages: \t");System.out.println(book1.noOfPages);
	System.out.println("\n Name of thePublication: \t");System.out.println(book1.nameOfPublication);
	System.out.println("\n Address of the Publisher: \t");System.out.println(book1.address);
	System.out.println("\n Publishers MailId: \t");System.out.println(book1.mailId);
	System.out.println("\n For Details: \t");System.out.println(book1.phoneNumber);
	System.out.println("\n Availability status: \t");System.out.println(book1.availability);
	System.out.println("\n Cost of the Book: \t");System.out.println(book1.cost);
}
}
