package com.syntax.class04;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have any credit card?");

		String card = scan.nextLine();

		if (card.equals("yes")) {

			System.out.println("please enter limit of your credit card");

			int limit = scan.nextInt();

			if (limit > 1000) {
				System.out.println("please pay your balance immedietly");
			} else {
				System.out.println("sound good. you can spend some more of your ceredit limit");
			}

		} else {
			System.out.println("we will offer you a new credit card.");
		}

	}
}
