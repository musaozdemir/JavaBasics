package com.syntax.class25;

public class HomeWork {
	
	final int sum (int num1, int num2 ) {
		
		int sum=num1+num2;
		return sum;
		
	}
	
	final int sum (int num1, int num2, int num3 ) {
		
		int sum=num1+num2+num3;
		return sum;
		
	}
	

	
	public static void main(String[] args) {
		
		HomeWork sum1 = new HomeWork();
		
		int newsum = sum1.sum(10,20);
		System.out.println(newsum);
		
		int newsum2 = sum1.sum(10, 20, 30);
		System.out.println(newsum2);
	
				
	}
	
	
	
}
