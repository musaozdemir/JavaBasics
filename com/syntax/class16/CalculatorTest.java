package com.syntax.class16;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		//call method add();
		
		Calculator c=new Calculator();
		
		c.add(100,200);
		c.add(10,20);
		c.add(10,10);
		c.sub(100, 33);
		c.mult(100,50);
		c.div(999, 3);
		System.out.println(c);
		
		
		
		Calculator x=new Calculator();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please put 1st number");
		int a= scan.nextInt();

		System.out.println("please put 2nd number");
		int b= scan.nextInt();
		
		System.out.print("a+b= ");
		x.add(a, b);
		System.out.print("a-b= ");
		x.sub(a, b);
		System.out.print("a*b= ");
		x.mult(a, b);
		System.out.print("a/b= ");
		x.div(a, b);
		
		
	}
}
