package com.chainsys.day9;

public class Exception {

	public static void main(String[] args)  throws InvalidAgeException{
		int age =2;
		
		
		String name="aa";
		
		try {
			if(name.length()<5)
				System.out.println("Invalid");
		} catch(NullPointerException np) {
			System.out.println(np.getMessage());
		}
		
		
		if(name.length() < 5)
			throw new InvalidUserNameexception();
		
		if(age>18) {
			System.out.println("valid");
		}else
			throw new InvalidAgeException();

	}

}
