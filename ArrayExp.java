package com.chainsys.day9;

public class ArrayExp {

	public static void main(String[] args) {
		int[] rollNo = { 3, 5, 1, 3, 5 };
		// for (int i = 0; i <= 5; i++) {
		// System.out.println(""+rollNo[i]);

		// }

		try {
			for (int i = 0; i <= 8; i++)
				System.out.println(rollNo[i]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
		} catch (ArithmeticException ab) {
			System.out.println(ab.getMessage());
		} catch (NullPointerException ac) {
			System.out.println(ac.getMessage());
		}

	int no1 = 12, no2 = 0, no3 = 12;

		try {
			int result = no1 + no2;
			System.out.println(result);
			float avg = no1 / no3;
			System.out.println(avg);
			int avg1 = no1 / no2;
			System.out.println(avg1);
		}catch (ArithmeticException av) {
			System.out.println(av.getMessage());
		}
		
		String name="aa";
		
		try {
			while(name.length()>5) {System.out.println("ok");}
				//System.out.println("Invalid");
		} catch(NullPointerException np) {
			System.out.println(np.getMessage());
		}
		
		
	}

}
