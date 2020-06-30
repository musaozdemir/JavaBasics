package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		
		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using elements of array: “Saturday is Java coding Day”.
				
		String[] words = {"Saturday","is","Java","coding","day"};
		
		System.out.println(words[0]+" "+words[1]+" "+words[2]+" "+words[3]+" "+words[4]);
		System.out.println(" ");
		
		//arrayName.length(); 
		
		System.out.println(words.length); 
		
		
		
		
		System.out.println(" ");
		System.out.println("-------------");
		System.out.println(" ");
		
		
		
		
			String[] words2 = new String[5];
			
			words2[0]="Saturday ";
			words2[1]="is ";
			words2[2]="Java ";
			words2[3]="coding ";
			words2[4]="day";
	
			System.out.println(words2[0]+" "+words2[1]+" "+words2[2]+" "+words2[3]+" "+words2[4]);
			System.out.println(" ");
			
			
			
			System.out.println(" ");
			System.out.println("-------------");
			System.out.println(" ");
			
			
			// reserve but didnt assingth.
			
				String[] words3 = new String[10];
				
				words2[0]="Saturday ";
				words2[1]="is ";
				words2[2]="Java ";
				words2[3]="coding ";
				words2[4]="day";
		
				System.out.println(words3[7]);
				System.out.println(" ");
	
	
	}
	
}
