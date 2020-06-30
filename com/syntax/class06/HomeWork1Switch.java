package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1Switch {

	public static void main(String[] args) {
		
	

		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Please enter month of ypu were born");
		
		String month = scan.nextLine();
		
		String season;
		
		
		switch (month.toLowerCase()) {
		 
		case "december":
		case "january":
		case "february":
			season = "winter";
			break;
		case "march":	
		case "april":
		case "may":
			season = "spring";
			break;
		case "june":
		case "july":
		case "august":
			season = "fall";
			break;
		case "september":
		case "october":
		case "november":
			season = "summer";
			break;
			
		default:
			season = "unknown";
			
		}
		
		
		
//		if (month.equals("June") || (month.contentEquals("July")) || (month.contentEquals("August"))) {
//			
//			season = "Summer";
//			
//		} else if (month.equals("September") || (month.contentEquals("October")) || (month.contentEquals("November"))) {
//			
//			season = "Autumm";
//			
//		}else if (month.equals("December") || (month.contentEquals("January")) || (month.contentEquals("February"))) {
//			
//			season = "Winter";
//			
//		} else if (month.equals("March") || (month.contentEquals("April")) || (month.contentEquals("May"))) {
//			
//			season = "Spring";
//			
//		} else {
//			season = "invalid enter";
//		}

		System.out.println("you were born at " + season);
		
		
	}
}
