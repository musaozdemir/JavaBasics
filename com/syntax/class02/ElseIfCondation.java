package com.syntax.class02;

public class ElseIfCondation {

	public static void main(String[] args) {

		double num1 = 10.7;
		double num2 = 10.7;

		if (num1 > num2) {
			System.out.println("number1 larger than number2");
		}

		else if (num1 < num2) {
			System.out.println("number2 larger than number1");
		}

		else {
			System.out.println("numbers are equal");
		}

		System.out.println("");
		System.out.println("----------------");
		System.out.println("");

		
		
		
		int day;
		
		

		day = 4;
		
		
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid Day");
		}

	}

}
