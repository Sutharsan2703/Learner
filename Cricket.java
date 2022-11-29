package com.chainsys.day3Exercise;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		Scanner ps = new Scanner(System.in);
		System.out.println("Enter batters scored by Our team");

		System.out.println("Opener 1");
		int batter1 = ps.nextInt();
		System.out.println("non-striker");
		int batter2 = ps.nextInt();
		System.out.println("One down");
		int batter3 = ps.nextInt();
		System.out.println("Wicket Keeper");
		int batter4 = ps.nextInt();
		System.out.println("Middle order");
		int batter5 = ps.nextInt();
		System.out.println("Bat All-rounder");
		int batter6 = ps.nextInt();
		System.out.println("bowl All-Rounder");
		int batter7 = ps.nextInt();
		System.out.println("Spinner");
		int batter8 = ps.nextInt();
		System.out.println("Seamer");
		int batter9 = ps.nextInt();
		System.out.println("Seamer-");
		int batter10 = ps.nextInt();
		System.out.println("Bowler");
		int batter11 = ps.nextInt();

		int first = (batter1 + batter2 + batter3 + batter4 + batter5 + batter6 + batter7 + batter8 + batter9 + batter10
				+ batter11);

		int target = first + 1;
		System.out.println("Runs Scored on First innings: " + first);
		System.out.println("Target for second innings is " + target);

		System.out.println("Enter Team opponent Score");
		System.out.println("Opp 1-");
		int opp1 = ps.nextInt();
		System.out.println("Opp 2");
		int opp2 = ps.nextInt();
		System.out.println("Opp 3-");
		int opp3 = ps.nextInt();
		System.out.println("Opp 4");
		int opp4 = ps.nextInt();
		System.out.println("Opp 5");
		int opp5 = ps.nextInt();
		System.out.println("Opp 6");
		int opp6 = ps.nextInt();
		System.out.println("Opp 7");
		int opp7 = ps.nextInt();
		System.out.println("Opp 8");
		int opp8 = ps.nextInt();
		System.out.println("Opp 9");
		int opp9 = ps.nextInt();
		System.out.println("Opp 10");
		int opp10 = ps.nextInt();
		System.out.println("Opp 11");
		int opp11 = ps.nextInt();

		int second = (opp1 + opp2 + opp3 + opp4 + opp5 + opp6 + opp7 + opp8 + opp9 + opp10 + opp11);
		System.out.println("Runs Scored on Second innings: " + second);

		if (second >= target) {
			System.out.println("Team Batted second Innings beats the opponent ");
		} else if (first == second) {
			System.out.println("scores are level & Match Draw");
		} else {
			System.out.println("Team batted First innings beats the Opponents");

		}

	}

}
