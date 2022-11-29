package com.chainsys.loops;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month to check the Season:  ");

		int in = sc.nextInt();

		switch (in) {
		case 1:case 2:case 3:
			System.out.println("Spring season! ");
		break;
		case 4:case 5:case 6:
			System.out.println("Summer Season !!");
		break;
		case 7:case 8:case 9:
			System.out.println("Monsoon Season! ");
		break;
		case 10:case 11:case 12:
			System.out.println("Winter season  ");
			break;
		default:
			System.out.println("Enter valid Month (1 to 12)");
		}
	}

}
