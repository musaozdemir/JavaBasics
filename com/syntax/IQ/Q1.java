package com.syntax.IQ;

public class Q1 {
		
	public static void main (String[] args) {
	
	// swap 2 numbers

	int a = 10;
	int b = 30;
	a=a+b;
	b=a-b;
	a=a-b;

	System.out.println(a+" "+b);
	
	
	String x = "Hello" ; //5
	String y = "Welcome" ; //7
	x = x + y ; //HelloWelcome
	
	y = x .substring(0, x.length()- y .length());
	x = x .substring( y .length());
	System. out .println( x );
	System. out .println( y );
	
	x=x.concat("abc");
	System.out.println(x);
	
}
}
