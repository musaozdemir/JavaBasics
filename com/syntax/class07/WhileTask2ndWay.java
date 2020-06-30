package com.syntax.class07;

public class WhileTask2ndWay {
public static void main(String[] args) {
		
		
		boolean workDay = true;
		
		int day = 1;
		
		while (workDay && day <= 6) {
			if (day < 6) {
				
				System.out.println("I need a day off");
				day++;
			} else {
				System.out.println("I do not need a day of  any more");
				day++;
			} 
		} 
		
		
		System.out.println();
		
		
		
		
	}
	

}
