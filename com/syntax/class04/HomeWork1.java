package com.syntax.class04;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter amount of loan");
		
		int loan = scan.nextInt();
		
		if (loan <= 200000) {
			System.out.println("your loan is approved!");
		} else {
			System.out.println("we can not give you loan this time.");
		}
		
		
	}
}
