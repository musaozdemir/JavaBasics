package com.syntax.class19;

public class Task0001 {

	// Create a method that will accept an array as parameters and will return a sum
	// of all elements from
	// that array. Method should be visibly only within same package and accessible
	// by the creating
	// an instance of the class.

	public void sumofarray (int[] numbers) {

		int sum = 0;

		for (int i = 0; i > numbers.length; i++) {
			int nums = numbers[i];
			sum = sum + nums;
			

		}
		System.out.println(sum);

	}
 
}

