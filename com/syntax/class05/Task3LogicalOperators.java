package com.syntax.class05;

import java.util.Scanner;

public class Task3LogicalOperators {
	
public static void main(String[] args) {
	


// Write a program for user to enter his/hers birth month. Based on the month define the season.
// Example: if user is born in June, July or August → season ="Summer".
// At the end of the program we should see output as "You were born ______".
	
	Scanner scan = new Scanner(System.in); 
	
	System.out.println("Please enter month of ypu were born");
	
	String month = scan.nextLine();
	
	if (month.equals("June") || (month.contentEquals("July")) || (month.contentEquals("August"))) {
		
		System.out.println("You were born Summer");
		
	} else if (month.equals("September") || (month.contentEquals("October")) || (month.contentEquals("November"))) {
		
		System.out.println("You were born Autumm");
		
	}else if (month.equals("December") || (month.contentEquals("January")) || (month.contentEquals("February"))) {
		
		System.out.println("You were born Winter");
		
	} else if (month.equals("March") || (month.contentEquals("April")) || (month.contentEquals("May"))) {
		
		System.out.println("You were born Spring");
		
	} else {
		System.out.println("invalid enter");
	}
	
}
}

