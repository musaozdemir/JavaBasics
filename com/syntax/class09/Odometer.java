package com.syntax.class09;

public class Odometer {
	public static void main(String[] args) {

		// bougth new car
		// it start mileage with 00000 mileage and increases
		// it goes 0001,0002,0003,.....,9999

		int a, b, c, d;

		for (a = 0; a <= 9; a++) {
			for (b = 0; b <= 9; b++) {
				for (c = 0; c <= 9; c++) {
					for (d = 0; d <= 9; d++) {
						System.out.println(a + "" + b + c + d);
						if (b==0 && c==0 && d==0) {
							System.out.println("you need to take your car to oil change serves");
							continue;}
					}

				}

			}

		}
	}

}
