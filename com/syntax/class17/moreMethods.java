package com.syntax.class17;

import com.syntax.class11.Largest;

public class moreMethods {
	
	public static void main(String[] args) {
		
		moreMethods obj = new moreMethods();
		
		int [] array = { 56, 46, 23 , 90};
		int largenumber = obj.largestFromArray(array);
		System.out.println("largest number is "+ largenumber);
		
		System.out.println("-----------------------");
		String [] words = obj.getWords("Good nigth friends");
		for(String word:words) {
			System.out.println(words);
		}
		
		}
		
		
	
	
	// create a method that should return the largest number from an array(gelsitirip 2d array de yap)

	
	int largestFromArray(int [] array) {

		int largest=array[0];
		
		for (int i=0; i<array.length; i++ ) {
			
			if (array[i]>largest) {
				largest=array[i];
			} 
			
		}
		
		return largest;
		
	}


	// create a method that will accept a String anf return word from String
	// Hello Words ,  Good nigth friends.
	
	String[] getWords(String str) {
		
		return str.split(" ");
		
	}




}
