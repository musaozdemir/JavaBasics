package com.syntax.class32;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Task07 {

	
	//Create a collection of integers in which you can keep duplicates. 
	//Write a logic to find sum of all integers
	
	public static void main(String[] args) {
		
	
	
	Collection<Integer> number = new ArrayList<Integer>();
	
	number.add(99);
	number.add(21);
	number.add(80);
	number.add(100);
	number.add(100);
	number.add(21);
	
	System.out.println(number);
	
	
	Iterator it = number.iterator();
	
	while(it.hasNext()) {
		double num=it.next();
		
		
	}
	
	
	
//	
//	for( Integer num:number) {
//		int sum=0;
//		sum=num+sum;
//		
//		System.out.println(sum);
//	}
//	
	
	
	}
}
