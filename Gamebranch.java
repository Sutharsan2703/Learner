package com.chainsys.day11;

import java.util.Scanner;

public class Gamebranch extends Game{
	
	public void play(String account,String gameName,int size,float price) {
		System.out.println(" "+account+"\n"+gameName+"\n"+size+"\n"+price);
	if(size>500) {
		System.out.println("Want to download over Mobile Data or Wait for Wi-Fi! ");
	}else {System.out.println("Download");}
	}
	
	public void purchase(String company,int noOfMonths,String paymentMethod) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of games required from the developer: ");
		int packOfGames= sc.nextInt();
		int pay=packOfGames*118;
		System.out.println("  ");
		System.out.println("\n"+company+"  Game Developers  "+"\n"+"  Expiring lisence of months   "+noOfMonths+"\n"+"  Payment Method is:  "+paymentMethod+"\n"+"   Amount to be Paid is Rs. "+pay);
	}
}

