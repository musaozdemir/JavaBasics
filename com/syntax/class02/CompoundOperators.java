package com.syntax.class02;

public class CompoundOperators {

	public static void main(String[] args) {

		int num = 100;
		num = num + 100;
		num = num + 100;
		
		
		
		System.out.println(num);//300
		
		//we can use compound operators, which are shorter. 
		
		num += 100;
		
		System.out.println(num);//400
		
		
		//long way 
		// num = num - 50;
		
		//short way
		
		num -= 50;
		
		System.out.println(num);//350
		
			
		num /= 7;
		
		System.out.println(num);//50
		
		num *= 2;
		
		System.out.println(num);//100
		
		num %= 9;
		
		System.out.println(num);//1
		
		
		
		
		
	}

}
