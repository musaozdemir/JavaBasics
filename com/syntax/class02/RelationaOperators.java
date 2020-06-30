package com.syntax.class02;

public class RelationaOperators {

	public static void main(String[] args) {

		int a = 7;

		int b = 10;

		System.out.println(a > b);
	
		System.out.println(a < b);
		
		System.out.println(a == b);
		
		System.out.println(a != b);//different
		
		System.out.println(a >= b);
		
		System.out.println("--------------------");
		
		double i=10.78;
		double j=10.78;
		boolean result1 = i > j; // is i grater than j:
		
		System.out.println(result1); 
		System.out.println(i == j); // is i equal to j?
		
		boolean result2 = i != j; //is i different than j?
		System.out.println(result2);
		
		boolean result3 = i >= j;
		System.out.println(result3); // is i grater than j or equel to j
		
		boolean result4 = i <= j;
		System.out.println(result4);
		
		
	}

}
