package com.syntax.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		
		//How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value 
		//then programmer expected.
		
		System.out.println("enter number");
		Scanner scan = new Scanner(System.in);
		
		try {
			int num = scan.nextInt();
		} catch(InputMismatchException ime){
			System.out.println("I am a beginning of the catch block");
			String num=scan.nextLine();
			
		}

	
	}

}
