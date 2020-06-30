package com.syntax.class08;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		
		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even
		//and odd integers.
		
		Scanner scan = new Scanner(System.in);
		
		int start ,  end , sumOdd = 0, sumEven = 0; 
		
		System.out.println("please enter starting number");
		
		start = scan.nextInt();
		
		System.out.println("please enter ending number");
		
		end = scan.nextInt();
		
		
		for (int i = start; i <= end ; i++) {
			
			if (i % 2 == 0){ 
				sumEven += i;
			}
			
			if (i %2 == 1) {
				sumOdd = sumOdd + i;
			}
		}
		
		System.out.println("The sum of even number is: " + sumEven);
		System.out.println(" ");
		System.out.println("The sum of odd number is: " + sumOdd);

		
	}
}
