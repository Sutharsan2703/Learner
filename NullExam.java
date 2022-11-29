package com.chainsys.day10;

public class NullExam {

	public static void main(String[] args) {
		
		String name =null;
		if(name!=null)
			System.out.println(name);
		else
			//throw new Exception("null values passed");
			throw new NullPointerException("exception occured");
	}

}
