package com.syntax.class19;

public class ReverseString {

	// Create a method that will take a String as a parameter and returns reversed
	// String.
	// Method should be available to all classes within your project and accessible
	// by class name.

	public static void reverseString(String name) {

		for (int i = name.length() - 1; i > -1; i--) {

			char a = name.charAt(i);

			System.out.print(a);

		}

	}

	public static void main(String[] args) {

		reverseString("MUSA");

	}
}
