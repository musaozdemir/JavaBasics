package com.syntax.class08;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		
		//Write a program to ask a user to enter item they want to buy 
		//and the price of that item.
		//Every time user enters money accumulate the amount and tell the user 
		//how much is left
		//to pay off. If user give more money program should return achange.
		//When ever a userdonewithpaymentsprogramshouldsay"Thankyouforshopping!"
		
		Scanner scan = new Scanner(System.in);
		
		double money;
		double totalAmount = 0;
		double remainingBalance;
		double change;
		
		System.out.println("please enter the item that you wana buy");
		String item = scan.nextLine();
		System.out.println("please enter the price of item:");
		double price = scan.nextDouble();
		
		do {
			 
			System.out.println("please enter payment amount");
		
			money = scan.nextDouble();
			
			totalAmount += money;
			
			if (totalAmount < price) {
				
				remainingBalance = price - totalAmount;
				System.out.println("you should give me more " + remainingBalance);
				
			} else if (totalAmount > price){
				
				change = totalAmount - price;
				System.out.println("thanks for shopping. your change is " + change);
				
			} else {
				System.out.println("thanks for shopping. you gave us excat amount");
			}
			
		} while (totalAmount < price);
		
		
		
	}
}
