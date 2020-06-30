package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {

		// we want to print
		// *****
		// *****
		// *****
		// *****

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print("*");
			}
			System.out.println(" ");
		}
	
		
		System.out.println("---------------");
		
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("---------------");
		
		//12345
		//12345
		//12345
		
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(j);
			}
			System.out.println(" ");
		}
	
	
	
System.out.println("---------------");
		
		//11111
		//22222
		//33333
		//44444
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(i);
			}
			System.out.println(" ");
		}
	
	}
}
