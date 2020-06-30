package com.syntax.class02;

public class IfCondation {

	public static void main(String[] args) {
	
	// declare a number a compare if the number is larger than 100.
	// 
	
	int num = 178;
	
	boolean result = num > 100;
	
	System.out.println("let us check");
	
	if (num > 100) {
		System.out.println("my number is large");
	}
	
	else {
		System.out.println("my number is small");
	}
	System.out.println("The chack is complate");
	
	
	if (result == true ) {
		
		System.out.println("an other way to check");
	}
	
	
	System.out.println("-----------------------");
	
	int expectedHours = 15;
	int actualHours;
		actualHours = 20;
	
	if (actualHours >= expectedHours) {
		System.out.println("you will love java ");
	}
	
	else {
		System.out.println("you will not love java");
	}
	
	actualHours = 10;
	
	if (actualHours >= expectedHours) {
		System.out.println("you will love java ");
	}
	
	else {
		System.out.println("you will not love java");
	}
	
	System.out.println("-----------------------");
	
	double budget;
	budget = 10000;
	
	double carPrice;
	carPrice = 15000;
	
	if (budget > carPrice) {
		System.out.println("I will by this car");
		System.out.println("I am happy");
	}
	
	else { 
		System.out.println("I will not by this car");
		System.out.println("I will study java");
		
	}
	
	System.out.println("-----------------");
	
budget = 16000;
	
	if (budget > carPrice) {
		System.out.println("I will by this car");
		System.out.println("I am happy");
	}
	
	else { 
		System.out.println("I will not by this car");
		System.out.println("I will study java");
		}
	
	
	
	
	}
}
