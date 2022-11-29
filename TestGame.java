package com.chainsys.day11;

import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		
		Game game=new Game();
		
		Game.play("Gta", "1.6GB", 459);
	// error ? -it was declared as Static
		//	game.play("Candy Crush", "0.98 GB or 998 MB", 108.5);
		game.play("gameuser@gamemail.com","candy Crush",998, 128);
			
		Gamebranch g= new Gamebranch();
		g.play("newuser@gamemail.com", "Clash of Clans", 460, 458);
		
		g.purchase("EA Sports", 18, "Debit card");
		
		
	}

}
