package com.chainsys.day11;

public class Game {
//static float price=0;
	public static void play(String gameName,String size,float price ) {
		
		System.out.println("The game name is : "+gameName+"\n"+"Size of a game : "+size+"\n"+"Price Of game is: "+price);
		
		}
	public void play(String account,String gameName,int size,float price) {
		System.out.println("The game Account (mail) is : "+account+"\n"+"The game name is : "+gameName+"\n"+"Size of a game : "+size+"\t"+"MB"+"\n"+"Price Of game is: "+price+"\t"+"Rs");
		
	}
	
}
