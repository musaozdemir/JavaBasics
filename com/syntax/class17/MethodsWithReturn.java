package com.syntax.class17;

public class MethodsWithReturn {

	public static void main(String[] args) {
		
		
		MethodsWithReturn obj = new MethodsWithReturn();
		
		Boolean isItEven = obj.isEven(22);
		System.out.println(isItEven);
		
		
		String upperValue=obj.converToUppercase("Today is very good day");
		
		System.out.println(upperValue);
		
	}
	// create a method will accept an int value and return weather number is even 
	
	
	boolean isEven (int a) {
		
		boolean even;
		
		if (a%2==0) {
			even = true;
		} else {
			even = false;
		}
		
		return even;
		
	}
	
	
	// create a method that will accept 2 int values and return the largest number
	
	
	int getLargest (int a, int b) {
		
		int largest;
		
		if (a>b) {
			largest = a;
		} else {
			largest = b;
		}
		
		return largest; // return vlaue MUST be same type as Return that we dec;ared in method header.
		}
	
	
	// create a method that will accept String values and return that value all in uppercase
			
	String converToUppercase(String value) {
		return value.toUpperCase();
	}
	
		
	}

