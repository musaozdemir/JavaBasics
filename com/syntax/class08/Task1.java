package com.syntax.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		// 1.Print numbers from 1 to 50 except those that are divisible by 3
		for(int x = 1; x<=50; x++) {
			
			if (x %3 == 0) {
				continue;
			} System.out.print(x+" ");
		}
		
		System.out.println("");
		//Create a program that will be asking user to apply for a credit card 10 times. 
		//As soon you get an “yes” from a user program should stop asking.
		
		Scanner scan = new Scanner(System.in);
		
		
		
		for (int a=1; a<=10 ; a++) {
			System.out.println("do you wana apply for credit card");
			String answer = scan.next();
			
			if (answer.contentEquals("yes")) {
				
				System.out.println("congrast. you are in dept!");
				break;
			}
			
		} 
		
		
		
		
	}
}
