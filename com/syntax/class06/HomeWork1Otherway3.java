package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1Otherway3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double a, b, c;

		System.out.println("please enter first number ");
		a = scan.nextDouble();

		System.out.println("please enter second number ");
		b = scan.nextDouble();

		System.out.println("please enter third number ");
		c = scan.nextDouble();

		double largest;

		if (a > b) {
			if (a > c) {
				largest = a;
			} else {
				largest = c;
			}
		} else {
			if (b > c) {
				largest = b;
			} else {
				largest = c;

			}

		}

		System.out.println("largest number is " + largest);

	}

}
