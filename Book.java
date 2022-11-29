package com.chainsys.day6;

import java.util.Scanner;

public class Book {

	Scanner sc=new Scanner(System.in);
	 
	   {System.out.println(" Enter in order as 1.BookId  2.Name  3.Price  4.Rating 5.Language   6.copies     \");");}	
	int bookId = sc.nextInt();
		String name = sc.next();
		float price = sc.nextFloat() ;
		float rating = sc.nextFloat();
		String language= sc.next();
		int noOfCopies = sc.nextInt();
//Class - Blue print - define dataMembers and function/method
	
	
	/*	public void sharingreview(String bookName) {
			if(bookName.trim() != null) {
				System.out.println("worth to read, 4*");
			}
			else {
				System.out.println("Invalid");
			}}
		public void order(String bookName)
		{
			if (bookName.trim() != null) {
				System.out.println("No. of copies required: ");
			}
		}*/
	public void order()
	{
		
		System.out.println("bookid: "+bookId);
		
		System.out.println("name: "+name);
		
		System.out.println("Price: "+price);
		System.out.println("rating"+rating);
		
		System.out.println(language);
		
		System.out.println(noOfCopies);
	
	
	System.out.println("Book Ordered \n");}
	

}
