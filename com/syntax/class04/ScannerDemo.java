package com.syntax.class04;

import java.util.Scanner; // import java.until.*; (import all class)??

public class ScannerDemo {

	public static void main(String[] args) {
		
		int a = 65;
		String s = "abc";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please write some text and press enter");
		
		String text = scan.nextLine();
		System.out.println("-------");
		System.out.println(text);
		
		// let me read an integer(age)
		
		System.out.println("pleae enter your age");
		int age = scan.nextInt();
		System.out.println("The age that you entred is " + age);
		
		System.out.println("pleae enter your age");
		double age2 = scan.nextDouble();
		System.out.println("The age that you entred is " + age2);
		
	}
}
