package com.syntax.class04;

import java.util.Scanner; //Scanner komutunu tanitman lazim

public class ScannerIfElse {
	public static void main(String[] args) {
	
		Scanner myScanner = new Scanner(System.in); //kendine bi scanner olusutur.
													// ismini sen belirler(myScanner burda)
		
		
		
		System.out.println("plase put a number");
		
		int num1 = myScanner.nextInt(); // num1 i yazilan rakam olarak ata.
		
		System.out.println("num1 is " + num1);
	
	
		System.out.println("plase put an othernumber");
		
		int num2 = myScanner.nextInt();
		
		System.out.println("num2 is " + num2);
	
	
	if (num1>num2) {
		System.out.println(num1 + " larger than " + num2);
	} else if (num1<num2) {
		System.out.println(num1 + " smaller than " + num2);
	} else {
		System.out.println(num1 + " equal to " + num2);
	}
	
	
	
	}
	
}
