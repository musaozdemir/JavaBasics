package com.syntax.class14;

public class StringDifferance {

	public static void main(String[] args) {
		
		String name = "musa";
		
		String name1 = new String("musa");
//		name1="musa";
		
		System.out.println(name);
		System.out.println(name1);
		
		if (name.equals(name1)) {
			System.out.println("Strings are equals using equal methods");
		} if (name==name1){
			System.out.println("Strings are equals using == operators");
		}
		else {
			System.out.println("names are not equal");
		}
	}
}
