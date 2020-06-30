package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1Otherway {
	
	//1.Write a program to find largest of three double values using if-else..
	//if and logical operators provided by a user (numbers must be distinct)

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("please enter 3 number");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		
		System.out.println("num1= "+ num1 + " num2= " + num2 + " num3= " + num3 );
		
		int largest = 0;
	
		
		
		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
		}else if (num3 > num2 && num3 > num1) {
			largest = num3;
		}
		
		System.out.println("largest numner is " + largest);
			
		
	}
}
