package com.syntax.class08;

import java.util.Scanner;

public class LottaryGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lucky = 17;
		int num;
		
		do {		
		
			System.out.println("Please enter a number 1 to 20");
			
			num = scan.nextInt();
			
		}while (num != lucky);
	
			
			System.out.println("You are the winner");
		} 
		
		
				
	}

