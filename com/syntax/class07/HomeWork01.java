package com.syntax.class07;

public class HomeWork01 {

	public static void main(String[] args) {

		for (int a = 1; a <= 100; a++) {

			System.out.print(a + " ");
		}

		System.out.println("");
		System.out.println(" ------------------------");

		for (int b = 100; b >= 1; b--) {
			System.out.print(b + " ");
		}

		System.out.println("");
		System.out.println(" ------------------------");

		for (int c = 20; c > 1; c -= 2) {
			System.out.print(c + " ");
		}

		System.out.println("");
		System.out.println(" ------------------------");

		for (int d = 20; d > 1; d--) {
			System.out.print(d + " ");
			d--;
		}

		System.out.println("");
		System.out.println(" ------------------------");

		for (int x = 21; x < 50; x += 2) {
			System.out.print(x + " ");
		}

		System.out.println("");
		System.out.println(" ------------------------");

		int y = 21;
		while (y < 50) {

			System.out.print(y + " ");

			y += 2;

		}

	}
}
