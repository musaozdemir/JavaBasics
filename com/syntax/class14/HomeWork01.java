package com.syntax.class14;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {

		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? girl
		// Suggested baby name: MAIEL

		// Write a program that reads two people's first
		// names and if they expecting boy or girl?
		// Based on the input suggests a name for a baby:
		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? boy
		// Suggested baby name: DANRY

		Scanner scan = new Scanner(System.in);

		System.out.println("please enter mom's first name");
		String motherName = scan.nextLine();
		System.out.println("please enter dad's first name");
		String fatherName = scan.nextLine();
		System.out.println("is your baby boy or girl");
		String gender = scan.next();

		String babyName;
		
		if (gender.equalsIgnoreCase("boy")) {
			babyName = fatherName.substring(0, 3) + motherName.substring((motherName.length() - 2));
			
		}

		else if (gender.equalsIgnoreCase("girl")) {
			babyName = motherName.substring(0, 2) + fatherName.substring((fatherName.length() - 3));
			
		} else {
			babyName="unkown";
		}

		System.out.println(babyName.toUpperCase());
	}
}
