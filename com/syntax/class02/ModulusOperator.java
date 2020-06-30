package com.syntax.class02;

public class ModulusOperator {
	public static void main(String[] args) {

		double d1 = 14;
		double d2 = 4;
		double result = d1 / d2;
		
		
		System.out.println(d1);
		System.out.println(d1);
		System.out.println(result);
		
		
		System.out.println("---------------------");

		int i = 14;
		int j = 4;
		int result2 = i / j;
		double result3 = i / j;

		System.out.println(result2);

		System.out.println("the division is " + result3);
		
		int mod= i % j;
		
		System.out.println("the reminder is " + mod);
		
		System.out.println("---------------------");

		
		i = 16;
		j = 4;
		
		mod = i % j; // bolumden kalan kisim.
		
		System.out.println(mod);
		
		System.out.println("---------------------");
		
		float f1 = 12.5f;
		float f2 = 4.7f;
		
		float folatresult = f1/f2;
		double doubleresult = f1/f2;
		
		System.out.println("folat result is " + folatresult);
		System.out.println("double result is " + doubleresult);
		
		
		System.out.println("---------------- " );
		

	}
}
