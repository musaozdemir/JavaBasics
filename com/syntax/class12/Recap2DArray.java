package com.syntax.class12;

public class Recap2DArray {

	public static void main(String[] args) {
		
		String[][] animals = {
				
				{"cat","dog","bird","hamster"},
				{"tiger","lion","bear"},
				{"salmon","shrimp","hamsi"}
		};
		
		int howManyArrays = animals.length;

		System.out.println(howManyArrays);
		
		int secondAllayElements = animals[0].length;
		
		System.out.println("secondAllayElements: " + secondAllayElements);
	
		System.out.println("---------using for loops------------");
		
		for (int i=0; i<howManyArrays; i++) {
			
			for (int y=0; y< animals[i].length; y++) {
				String animal = animals[i][y];
				System.out.print(animal+" ");
			}
		System.out.println(" ");
		}
	
		System.out.println("-----------using enhanced for loop----------");
		
		for (String [] array : animals) {
			
			for (String animal:array) {
			System.out.print(animal+" ");
			}
			System.out.println("");
		}
		
	
	
	
	
	}
}
