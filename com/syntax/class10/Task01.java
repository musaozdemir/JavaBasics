package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
	
	
		char[] letters = new char[6];
		
		letters[0]='A';
		letters[1]='B';
		letters[2]='C';
		letters[3]='D';
		letters[4]='E';
		letters[5]='F';
		
		System.out.println("grade is " + letters[1]);
	
		System.out.println("");
		
		System.out.println("2nd way");
		
		System.out.println("");
		
		char[] letters2 = {'A','B','C','D','E','F'};
		
		System.out.println("grade is " + letters2[1]);
		
		System.out.println("");
		
		
		
		
		
	}
}
