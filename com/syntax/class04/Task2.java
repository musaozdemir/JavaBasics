package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		
		//Create a Java program and store values of mortgage rate and mortgage price. 
				//First, program should check if rate is higher than 4.5 user will not buy a house, 
				//otherwise user will consider buying. Once user decides to buy a house, 
				//if price of the house is larger than 200000 than user will take a loan, 
				//otherwise user will pay cash.
				
				
				
				double mortgageRate = 4.4;
				int housePrice = 20000;
				
				if (mortgageRate >= 4.5) {
					System.out.println("You will not buy a house. Rate is too high to buy a loan.");
				}
				
				else {
					if (housePrice >= 200000) {
						System.out.println("you will take a loan.");
					} else {
						System.out.println("you will pay cash.");
					}
				}
				
				
	}
}
