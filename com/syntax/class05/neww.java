package com.syntax.class05;

import java.util.Scanner;

public class neww {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		char ch = 0;
		System.out.println("please enter your quiz note");
		
		double quiz = scan.nextDouble(); 
		
		System.out.println("please enter your mid term note");
		
		double midTerm = scan.nextDouble(); 
		
		System.out.println("please enter your final note");
		
		double finalscore = scan.nextDouble(); 
		
		double avaragenote = ((quiz + midTerm + finalscore)/3);
		
		System.out.println(avaragenote);
		
		if (avaragenote >=90) {
			ch= 'A';
		} else if (avaragenote >= 70 && avaragenote<90 && avaragenote <=100) {
			System.out.println("your note is B");
		}else if (avaragenote >= 50 && avaragenote < 70) {
			System.out.println("your note is C");
		}else if (avaragenote<90 && avaragenote >= 0) {
			System.out.println("your note is F");
		} else {
			System.out.println("something wrong");
		}
		System.out.println(ch);
}
	}

