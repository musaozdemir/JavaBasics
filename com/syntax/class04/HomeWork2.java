package com.syntax.class04;

import java.util.Scanner;

public class HomeWork2 {
 
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("please enter your age");
		
		byte age = scan.nextByte();
		
		if (age >= 18) {
			
			System.out.println("we can issue your driver licence");
		} else{
			
			System.out.println("we can not issue your driver licence. please come back when you turn 18.");
		}
		
		
		
		
		
		
		
		
	}
}
