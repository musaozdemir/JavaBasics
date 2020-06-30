package com.syntax.class02;

import java.util.Scanner;

public class ScannerIcinCalismam {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter your test result");
		
	int result = scan.nextInt();
	
	
	if (result > 90) {
		System.out.println("You pass");
		System.out.println("your note is AA");	
	}
	
	else if (result > 80) {
		System.out.println("You pass");
		System.out.println("your note is AB");	
	}

	else if (result > 70) {
		System.out.println("You pass");
		System.out.println("your note is BB");	
	}
	
	else if (result > 60) {
		System.out.println("You pass");
		System.out.println("your note is BC");	
	}
	
	else  {
		System.out.println("You fail");
	}
}
}
