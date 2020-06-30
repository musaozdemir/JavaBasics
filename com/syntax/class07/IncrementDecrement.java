package com.syntax.class07;

public class IncrementDecrement {

	
	public static void main(String[] args) {
		
		int x = 10;
		
		x = x + 1;
		x += 1;
		
		//an other way to add 1 into the VARIABLE
		
		x++; //post increment
		++x; //pre increment
		System.out.println(x);
		
		// 3++; compiler error. cannot use with number. only variables
		
		
		int y = 50;
		
		y--;
		
		System.out.println(--y);
	}
}
