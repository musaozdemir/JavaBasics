package com.syntax.class15;

import java.lang.reflect.Array;

public class SplitFunction {
	
	public static void main(String[] args) {
		
		String str = "Today is Sunday and we have a Java class";
		
		String[] array = str.split("Sunday");
		int howMonyElement=array.length;
		System.out.println(howMonyElement);
		for(String s:array) {
			System.out.print(s+"");
			
		}
	}

}
