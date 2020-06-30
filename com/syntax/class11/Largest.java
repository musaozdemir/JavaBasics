package com.syntax.class11;

public class Largest {
public static void main(String[] args) {
	
	// find largest number in array
	
	
	int[] numbers = { 23,56,73,16,80,90,39,100};
	
	int largest = 0;
	
	
	for (int num :numbers) {
		if (num > largest) {
			largest = num;
			
		}
	}
	
	System.out.println(largest);
}
}
