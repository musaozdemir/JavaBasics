package com.syntax.class14;

public class HomeWork03 {
	public static void main(String[] args) {

		// B-Create a String and print it in reverse order (Sunday → yadnuS).

		String day = "Sunday";
	
		for (int i = day.length() - 1; i >= 0; i--) {

			char letters = day.charAt(i);
			System.out.print(letters);

		}


		
		
		System.out.println();

	
		String newString = "";
		for (int i = day.length() - 1; i >= 0; i--) {

		
			newString += day.charAt(i);

		}

		System.out.println(newString);
	}
}
