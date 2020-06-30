package com.syntax.class15;

public class Task01 {
	
	public static void main(String[] args) {

		// 1-Create a String that will hold a sentence.
		// Write a program to get a new String without any spaces.

		
		// 3-You have a String a=“Is it saturday? Is it raining? Do we have a Java Class
		// today?”
		// How would you find out how many sentences are in that String?

		String str = "Today is Sunday and date is june 28 2020";
		str = str.replace(" ", "");

		System.out.println(str);

		// 2-Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.

		String str1 = "abcd XYZSD 1234567890 !@#$%^&*";
		str1=str1.replaceAll("[^A-Za-z]", "");
		int numberOfAlphaChar=str1.length();
		System.out.println(numberOfAlphaChar);
		
		// 3-You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?”
		// How would you find out how many sentences are in that String?
		
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = a.split("[?]");
		int numberOfSentences = array.length;
		System.out.println(numberOfSentences);
		
		
	}
}
