package com.syntax.class08;

public class BreakandContinue {

	public static void main(String[] args) {

		System.out.println("--------BREAK-------");
		// we want to count from 1 to 10
		// we want to the loop when reach 4

		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("we are outside of the loop");

		System.out.println("");

		System.out.println("--------CONTINUE-------");

		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("we are outside of the loop");

		System.out.println(" ");

		System.out.println("--------skip num 5  6 7-------");
		System.out.println(" ");

		for (int i = 1; i <= 10; i++) {

			if (i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);

		}

		System.out.println("we are outside of the loop");

		System.out.println(" ");

		System.out.println("-print num 1 to 100 and skip between 35 and 55-");
		System.out.println(" ");
		
		
		
		for (int i = 1; i <= 100; i++) {
			
			if (i>=35 && i<=55) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
