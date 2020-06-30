package com.syntax.class09;

public class PrintHours {

	public static void main(String[] args) {
		
		// let us print the clock
		//00:00
		//00:01
		//.....
		//23:59
		
		
		for (int hour = 00; hour <=23 ; hour++ ) {
			
			for (int minutes = 00 ; minutes < 60 ; minutes++ ) {
				if (minutes < 10) {
				System.out.println(hour+":0"+minutes);
			}else {
				System.out.println(hour+":"+minutes);
			}
			}
		}
	}
	}
