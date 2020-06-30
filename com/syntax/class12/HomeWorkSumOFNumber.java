package com.syntax.class12;

public class HomeWorkSumOFNumber {

	public static void main(String[] args) {

		int[][] numbers = {

				{ 10, 23, 56, 47 }, { 33, 668, 89 }, { 1, 9, 0 } };

		// regular for loop odd numbers sum

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[i].length; j++) {

				int element = numbers[i][j];
				if (element % 2 != 0) {

					sum += numbers[i][j];
				} 

			} 
			
			System.out.println(sum);
		}
	
		System.out.println(sum);
	}
	
}
