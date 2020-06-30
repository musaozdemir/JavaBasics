package com.syntax.class11;

public class Array2D {

	public static void main(String[] args) {
		
		int[] [] numbers = new int [3][4]; //[row] [cols]
		
		// 1st row, row woth index 0
		numbers[0][0] = 10;
		numbers[0][1] = 15;
		numbers[0][2] = 20;
		numbers[0][3] = 25;
		
		// 2st row, row woth index 1

		numbers[1][0] = 32;
		numbers[1][1] = 36;
		numbers[1][2] = 40;
		numbers[1][3] = 44;
//		numbers[1][4] = 48; runtime error. outofbounds exception
		
		// 2st row, row woth index 2

		numbers[2][0] = 63;
		numbers[2][1] = 66;
		numbers[2][2] = 69;
		numbers[2][3] = 72;
	
		//print number 20
		
		System.out.println(numbers[0][2]);
		
		
		int [][] nums = {
				{10, 15, 20, 25},
				{32, 36, 40, 44},
				{63, 66, 69, 72}
		};
		
		System.out.println(nums[2][0]);
		System.out.println(nums[1][3]);
		
		
		
	}
}
