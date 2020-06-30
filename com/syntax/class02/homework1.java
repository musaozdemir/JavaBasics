package com.syntax.class02;

public class homework1 {

	public static void main(String[] args) {

		/*
		 * Primitive data types
		 * 
		 * byte int 
		 * short 
		 * long (should be and with l or L) 
		 * boolean (false or true)(dont put yes or no for values) 
		 * float (should be and with f or F) (double a gore kisa ondalik sayilar) 
		 * double ( daha uzun ndalik sayilar) char (need to put '')
		 *
		 */

		byte num1 = 127;
			
		short num2 = 100;
		int num3 = 1234000000;
		long num4 = 9876543212345L;
		float num5 = 11.9F;
		double num6 = 0.123;
		char add = '#';
		char letter = 'x';

		boolean good = true;
		boolean bad = false;
		
		num1 = 111;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(add);
		System.out.println(letter);
		System.out.println(good);
		System.out.println(bad);

		float PI_float = (float) Math.PI;
		double PI_double = Math.PI;

		System.out.println(PI_float);
		System.out.println(PI_double);
		
	}

}
