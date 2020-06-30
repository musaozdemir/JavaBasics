package com.syntax.class02;

public class OrnekCalisma {
	public static void main(String[] args) {
		
//		Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say.
//		"The _______ of 2 numbers ___ and ___ is equal to _____"
		
//		Write a program to find the square of the number 3.9. You program should say "The square of the ____ is ____ "
		
//		Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
//		Your program should say. "The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"

		
		double a = 9.8;
		double b = 2.2;
		double c = a+b;
		double d= a-b;
		double e= a*b;
		double f= a/b;
		
		System.out.println(a+b+"toplam"+a+b+ (a+b));
		
		System.out.println("the " + "addition " + "of 2 numbers " + a + " and " + b + " is equel to " + c + '.');
		System.out.println("");
		System.out.println("the " + "subtraction " + "of 2 numbers " + a + " and " + b + " is equel to " + d + '.');
		System.out.println("");
		System.out.println("the " + "multiplication " + "of 2 numbers " + a + " and " + b + " is equel to " + e + '.');
		System.out.println("");
		System.out.println("the " + "division " + "of 2 numbers " + a + " and " + b + " is equel to " + f + '.');
		System.out.println("");
		System.out.println("********************************************************************");
		System.out.println("");
		
	
		double x=3.9;
		double y= x*x;
		
		System.out.println("The square of the " + x + " equal to " + y+ '.');
		System.out.println("");
		System.out.println("********************************************************************");
		System.out.println("");
		
		
		// width = 5 and  height = 8.
		
		int width = 5;
		int heigth = 8;
		int perimeter= (width+heigth)*2;
		int area = width * heigth;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + heigth + " is equal to " + perimeter + " and the area is " + area+ '.' );
		
		
	}
}
