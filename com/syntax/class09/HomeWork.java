package com.syntax.class09;

public class HomeWork {

	public static void main(String[] args) {

		// 12345
		// 1234
		// 123
		// 12
		// 1
		// 12
		// 123
		// 1234
		// 12345

		int i;
		int j;

		System.out.println("java 9 home work 1");
		System.out.println("");

		for (i = 5; i >= 1; i--) {

			for (j = 5; j >= 1; j--) {

				System.out.print(j);
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("java 9 home work 2");
		System.out.println("");

		for (i = 5; i >= 1; i--) {

			for (j = 1; j <= 5; j++) {

				System.out.print(i);
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("java 9 home work 3");
		System.out.println("");

		for (i = 5; i >= 1; i--) {

			for (j = i; j <= 5; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 4; i >= 1; i--) {

			for (j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("");
		System.out.println("java 9 home work 4");
		System.out.println("");

		for (i = 5; i >= 1; i--) {

			for (j = i; j >= 1; j--) {

				System.out.print(i);
			}
			System.out.println("");
		}

	}
}
