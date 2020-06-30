package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		
		//we have 7 days of week
		// if day is 2,4 --> SDLC class
		// if day id 6,7 --> Java class
		// if day is 3 --> Review class
		// if day is 1,5 --> No class
		
		
		int day = 5;
		
		if (day == 2 || day == 4) {
			
			System.out.println("SDLC class");
			
		} else if (day == 6 || day == 7) {
			
			System.out.println("Java class");
			
		} else if (day == 3) {
			
			System.out.println("Review class");
	
		} else if (day == 1 || day == 5) {
			System.out.println("No class");
		} else {
			System.out.println("invalid enter");
		}
		
		System.out.println("---------------using String----------");
	
		// To compare the equality of two String we use .eguals()
		
		String day2 = "Friday";
		
		if (day2.contentEquals("Tuesday") || (day2.contentEquals("Thursday"))){
		
			System.out.println("SDLC class");
		} else if (day2.contentEquals("Saturday") || (day2.contentEquals("Sunday"))){
		
			System.out.println("JAVA class");
			
		} else if (day2.contentEquals("Monday") || (day2.contentEquals("Friday"))){
		
			System.out.println("No class");
			
		} else if (day2.contentEquals("Wednesday")){
		
			System.out.println("Review class");
		} else {
			System.out.println("invalid enter");
		}
		
	
		
		
		
	}
}
