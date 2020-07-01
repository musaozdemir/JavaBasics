package com.syntax.class16;

public class MethodsTask {

	


	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	void numbersEquals(int a, int b) {
		
		if (a>b) {
			System.out.println("bigger number is "+a);
		} else {
			System.out.println("bigger number is "+b);
		}
	}
	
	//Create a method that will take a number and prints whether the number is even or odd.
	void numbersOddOrEven(int number) {
		
		if (number %2==0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}
	
	
	//Create a method that will print whether given String is palindrome or not.
	

	
	
	
	
	
	//Create a method that will say Hello in different language based on the country
	//that will passed when method is executed.
		
	void hello(String Country) {
		
		Country = Country.toLowerCase();
		
		switch (Country) {
		
		case "usa":
		System.out.println("Hello");
		break;
		
		case "turkey":
		System.out.println("merhaba");
		break;
		
		case "spain":
		System.out.println("ola");
		break;
		}
		
		
		
	}
	
	
}
