package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("please enter your city");
		
		String city = scan.nextLine();
		
		System.out.println("please enter your temperature as a Fahrenheit");
		
		int temp = scan.nextInt();
		
		System.out.println("The temperature is " + ((int)(temp-32)/1.8) + " Celsius in " + city );
	}
}
