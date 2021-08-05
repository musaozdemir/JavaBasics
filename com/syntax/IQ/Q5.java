package com.syntax.IQ;

public class Q5 {

	public static void main(String[] args) {

		String str = "Hello World";

		// 1st way;

		String newStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			newStr = newStr + str.charAt(i);
		}
		System.out.println(newStr);

		// 2nd way;

		char[] array = str.toCharArray();

		String newStr1 = "";

		for (int i = array.length-1; i >= 0; i--) {
			newStr1 = newStr1 + array[i];
		}
		
		System.out.println(newStr1);
		
		//Reverse a string word by word
		String s = "Todays is Sunday" ;
		String[] array2 = s.split(" ");
		String reversed="";
		for(int i=array2.length-1; i>=0; i--) {
			reversed=reversed+array2[i]+" ";
		}
		System.out.println(reversed);
		
	}
}
