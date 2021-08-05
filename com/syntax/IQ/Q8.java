package com.syntax.IQ;

import java.util.ArrayList;
import java.util.HashSet;

public class Q8 {
	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<>();
		aList .add( "John" );
		aList .add( "Jane" );
		aList .add( "James" );
		aList .add( "Jasmine" );
		aList .add( "Jane" );
		aList .add( "James" );
		
		
//		1st way
		
		HashSet<String> set = new HashSet<>(aList);
		System.out.println(set);
		
		
//		2nd way
		
		HashSet<String> hSet = new HashSet<>();
		for(String names:aList) {
			hSet.add(names);
		}
		
		System.out.println(hSet);
		
	}

}
