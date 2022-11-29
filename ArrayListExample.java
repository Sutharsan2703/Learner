package com.chainsys.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// Array -> (Array list -can grow or shrink)<- list

		List phoneNumber = new ArrayList();
		phoneNumber.add(1111111122);
		phoneNumber.add(1111111134);
		phoneNumber.add(1111111125);
		phoneNumber.add(1111111144);
		System.out.println("Actual phone Number array " + phoneNumber);

		phoneNumber.add(222222212);
		phoneNumber.add(333333328);
		phoneNumber.add(444444465);
		phoneNumber.add(555555514);
		phoneNumber.add(2, 675456777);
		System.out.println("Update phone Number array " + phoneNumber);

		phoneNumber.remove(2);
		int phoneNumber1;

		/*
		 * int compare = Arrays.compare(phoneNumber1, phoneNumber);
		 * System.out.println(compare); List.sort(phoneNumber);
		 */
		System.out.println("after phone Number removal " + phoneNumber);

	}

}
