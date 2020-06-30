package com.syntax.class02;

public class PirimitiveCasting {

	
	public static void main(String[] args) {
		
		
		// casting in java is conversion of one type into an other type
		
		//pirimative and non-pirimitive casting
		
		// byte -> short -> int -> long -> float -> double 
		
		
		//1. widening (implicit casting) can done otomaticly. 
		
		
		
		double d = 7;
		System.out.println(d);

	
		
		// int i = 7.58; // compile error. type mistmach. 
		//connot from double to int. 
		
		int i = (int) 7.58;
		
		// narrowing( a large number into a byte) /explicitly/manually
		
		byte b = (byte) 123865;
		
		System.out.println(b);
				
		long l1 = 45;	
		long l2 = 3222222222l;
		
		int number1 = (int) l1;
		int number2 = (int) l2;
		
		System.out.println(l1);
		System.out.println(number2);
		
		
	}
}
