package com.syntax.class16;

public class MethodsWithReturnValue {
	
	public static void main(String[] args) {
		
		//create a String and based and on the number of chachter define wheather Stirng is long or short
		//long if length >10, short<10.
	
	
	String str="I lou";
	
	int length = str.length();
	
	if (length>=10 ) {
		System.out.println("created String is long");
	} else {
		System.out.println("created String is short");
	}
	
	
	}

}
