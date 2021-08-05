package com.syntax.IQ;

public class Q6 {

	public static void main(String[] args) {
		
	
	String original = "HelleH";
	char[] array = original.toCharArray();
	String reverse = "";
	
	for(int i=array.length-1; i>=0; i--) {
		reverse=reverse+array[i];
	}
	
	if(original.equals(reverse)) {
		System.out.println(original+" is palindrome");
	}else {
		System.out.println(original+" is not palindrome");

	}
}
	
}
