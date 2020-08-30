package com.syntax.class31;

import java.util.Iterator;
import java.util.TreeSet;

public class Task01 {
	
	//Create a Set collection in which you need to add names of the countries. 
	//In this set we want all objects to be sorted in alphabetical order. 
	//Using 2 different ways retrieve all elements from set.

	
	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<String>();
		
		
		names.add("John");
		names.add("micheal");
		names.add("Rob");
		names.add("Anna");
		names.add("Sebastian");
		names.add("Jay");
		
		
		System.out.println("======print 1st way=====");
		System.out.println(names);
		
		
		System.out.println("=====print 2nd way=====");
		for(String a:names) {
			
			System.out.print(a+" ");
		}
		System.out.println("");
		System.out.println("======print 3rd way======");

		Iterator<String> str =  names.iterator(); 
		
		while(str.hasNext()) {
			System.out.print(str.next()+" ");
			
		}
		
		
		
	}
}
