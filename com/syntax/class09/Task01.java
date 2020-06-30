package com.syntax.class09;

public class Task01 {
	public static void main(String[] args) {

		// $$$$
		// $ $
		// $ $
		// $ $
		// $$$$

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= 4; c++) {
				if (r == 1 || r == 5) {
					System.out.print("$");
				} else {
					if (c == 1 || c == 4) {
						System.out.print("$");
					} else {

						System.out.print(" ");

					}

				}

			}

			System.out.println("");
		}

		
		System.out.println("----------2nd way---------");
		
		

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= 4; c++) {
				if (r == 1 || r == 5 || c==1 || c==4) {
					System.out.print("$");
				} else {
					
				}
			
}
			System.out.println("");
		}
}
		
}