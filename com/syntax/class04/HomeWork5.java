package com.syntax.class04;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("how many year you are working woth company?");
		
		int year = input.nextInt();
		
		
		if (year > 2) {
			
			System.out.println("What is your annual income?");
			
			int salary = input.nextInt();
			
			if (salary > 50000) {
				
			System.out.println("you are eligible and your bounus is 5000$");
			
			} else {
				System.out.println("you are eligible and your bounus is 3000$");
			}
			
				
			}  else {
			
			System.out.println("you are not eligible!");
		}
	}
}
