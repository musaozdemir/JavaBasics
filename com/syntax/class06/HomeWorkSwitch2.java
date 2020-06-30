package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkSwitch2 {

	public static void main(String[] args) {
		
		//HomeWork: Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
	
		Scanner scan = new Scanner(System.in);
		
		
		double num1;
		double num2;
		char operator;
		double resault = 0;
		
		System.out.println("please enter your first number");
		
		num1 = scan.nextDouble();
		
		System.out.println("please enter your second number");
		
		num2 = scan.nextDouble();
		
		System.out.println("please enter your operator (+,-,*,/):");
		
		operator = scan.next().charAt(0);
		
		System.out.println(operator);
		
		
		
		switch (operator) {
		
			case ('+'):
				resault = num1 + num2;
			break;
			case ('-'):
				resault = num1 - num2;
			break;
			case ('*'):
				resault = num1 * num2;
			break;
			case ('/'):
				resault = num1 / num2;
			break;
		default: 
			 
			System.out.println("invalid operator!");
		
		}
		
		if (operator == '+' || resault == '-' ||resault == '*' ||resault == '/') {
		System.out.println("The resault " + num1 + " " + operator + " " + num2 +" is: "+ resault);
		} 
		
		
		
	}
}
