package com.syntax.class07;

public class WhileTask1 {

	public static void main(String[] args) {
		
		
		boolean workDay = true;
		
		int day = 1;
		
		while (workDay) {
			if (day < 6) {
				
				System.out.println("I need a day off");
				day++;
			} else {
				System.out.println("I do not need a day of  any more");
				workDay=false;
			} 
		} 
		
		
		System.out.println();
		
		
		
		
	}
	
}
