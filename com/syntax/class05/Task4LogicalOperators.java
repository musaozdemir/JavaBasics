package com.syntax.class05;

import java.util.Scanner;

public class Task4LogicalOperators {
	
	public static void main(String[] args) {
	
	// Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
	// if the average score >=90 → grade=A
	// if the average score >= 70 and <90 → grade=B
	// if the average score>=50 and <70 → grade=C
	// if the average score<50 → grade=F	
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("please enter your quiz note");
		
		double quiz = scan.nextDouble(); 
		
		System.out.println("please enter your mid term note");
		
		double midTerm = scan.nextDouble(); 
		
		System.out.println("please enter your final note");
		
		double finalscore = scan.nextDouble(); 
		
		double avaragenote = ((quiz + midTerm + finalscore)/3);
		
		System.out.println(avaragenote);
		
		if (avaragenote >=90) {
			System.out.println("your note is A");
		} else if (avaragenote >= 70 && avaragenote<90 && avaragenote <=100) {
			System.out.println("your note is B");
		}else if (avaragenote >= 50 && avaragenote < 70) {
			System.out.println("your note is C");
		}else if (avaragenote<90 && avaragenote >= 0) {
			System.out.println("your note is F");
		} else {
			System.out.println("something wrong");
		}
		
}
}
