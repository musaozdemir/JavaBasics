package com.syntax.IQ;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {

		int[] numbers = { 32, 61, 16, 89, 74, 25 };
		Arrays.sort(numbers);

		System.out.println("Largest: " + numbers[numbers.length - 1]);
		System.out.println("second largest: " + numbers[numbers.length - 2]);
		System.out.println("smallest: " + numbers[0]);

	

	int[] num = { 1, 110, -1, 90, 16, 89, 74, 89, 25, 100 };
	
	int largest=0;
	int largest2=0;
	int smallest=0;
	
	for(int i=0; i<num.length; i++) {
	
		int element = num[i];
		if(element>largest) {
			largest2=largest;
			largest=element;
		
		}
		else if(element>largest2 && element!=largest) {
			largest2=element;
		}
		if(element < smallest) {
			smallest=element;
		}
	}
	System.out.println("largest: "+largest+" largest2: "+largest2+" smallest: "+smallest);

}
}
