package com.chainsys.day10;

public class ExeptNullPointEr {

	public static void main(String[] args) {
		
		String name=null;
		try {
		if (name !=null) {
			System.out.println(name);}
		
			 catch(NullPointerException e) {
				 System.out.println(e.getMessage());
			 }
	}
	catch(/*NullPointer*/Exception e)
	{
		//System.out.println(e.getMessage());
		//e.printStackTrace();
	}
		

	}

}
