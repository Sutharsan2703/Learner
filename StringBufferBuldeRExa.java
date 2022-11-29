package com.chainsys.day10;

public class StringBufferBuldeRExa {

	public static void main(String[] args) {
		//String is immutable
		
		String name="alpha";
		System.out.println(name);
		name.concat("beta");
		System.out.println("After concat: "+name);
		String firstname= name.concat("beta");
		System.out.println(name);
		
		//String(buffer and builder)
		StringBuffer firstName=new StringBuffer("Alpha");
		System.out.println(firstName);
		firstName.append("beta");
		System.out.println(firstName);
		
		StringBuilder edu=new StringBuilder("B.E., ");
		
		System.out.println(edu);
		edu.append("M.E., ");
		System.out.println(edu);
		
		edu.delete(0, 5);
		System.out.println(edu);
		
		
		
	}

}
