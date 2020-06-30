package com.syntax.class14;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {

		// A-Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.

		String word = "abCde";

		if (!(word.length() % 2 == 0) && word.length() >= 3) {

			System.out.println(word.substring(((word.length() - 1) / 2), ((word.length() + 1) / 2)));
			int print = (word.length()/2);
			System.out.println(word.charAt(print));

		} else {

			System.out.println("your word is not odd please enter again");
		}

	}

}
