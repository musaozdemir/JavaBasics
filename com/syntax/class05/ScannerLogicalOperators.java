package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogicalOperators {

	public static void main(String[] args) {
	
		//Take the age from the user than
		// if age is between 0-3 --> you are a baby
		// if age is between 4-5 --> you are a kid
		//if age is between 6-12 --> you are a child
		//if age is between 13-19 --> you are a teenager
		//if age is between 20-64 --> you are a adult
		//if age is more than or equal to 65 --> you are a senior
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("plese enter your age");
		
		int age = scan.nextInt();
		
		if (age > 0 && age < 4) {
			System.out.println("you are a baby");
		} else if  (age > 3 && age <6) {
			System.out.println("you are a kid");
		} else if (age > 5 && age <13) {
			System.out.println("you are a child");
		} else if  (age >12  && age <20) {
			System.out.println("you are a teenager");
		}else if  (age > 19 && age <64) {
			System.out.println("you are a adult");
		} else if  (age >= 65) {
			System.out.println("you are a sanior");
		} else {
			System.out.println("invalid enter");
		}
	}
}
