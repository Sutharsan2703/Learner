package com.chainsys.day8;

import java.awt.List;
import java.util.ArrayList;
public class TestStu {

	public static void main(String[] args) {
		
		StudentClass stu= new StudentClass("abc",12);
		StudentClass stu1= new StudentClass("bac",13);
		
		ArrayList stuList= new ArrayList();
		stuList.add(stu);
		stuList.add(stu1);
		
		//System.out.println(stuList);
		
		for(Object object :stuList) {
			System.out.println(object);
			
		}
	}

}
