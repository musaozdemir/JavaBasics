package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkSwicth {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("please enter your grade");
		
		String grade = scan.nextLine();
		
		String resault;
		
		
		switch (grade.toLowerCase()) {
		
		case "A":
			resault = "Excellent";
			break;
		case "B":
			resault = "Good";
			break;
		case "C":
			resault = "Average";
			break;
		case "D":
			resault = "Bad";
			break;
			
			default:
			resault = "Not accepable";
			break;
		}
			
		
		System.out.println("your reasult is " + resault);
		} 
		
		
	}

