package com.syntax.class04;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		
		
		// capture a name from user. 
		// print "your name is ....."
		// ask to user " enter your age" and print "your name is ..... and age is ...."
	
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("What is your name");
		
		String name = scan.nextLine();
		
		System.out.println("your name is "+ name );
		
		System.out.println("how old are you?");
		double age = scan.nextDouble();
		
		System.out.println("you are "+ age + " years old and your name is " + name );
				
	
}
	
	
}

