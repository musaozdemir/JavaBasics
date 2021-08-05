package com.syntax.IQ;

public class Q4 {
public static void main(String[] args) {
	
	String str = " Hih9898jhjh%%^$%^ oio " ;
	str = str.replaceAll("[^A-Za-z]","");
	int num = str.length();
	System.out.println("number of alpha character in str--> " + num);
	System.out.println(str);
	
	
	
	String myString = "Today is Wednesday and it is Java Class" ;
	String[] array = myString.split(" ");
	int lengthofarray = array.length;
	System.out.println("num of words in my string: "+lengthofarray);
	
	System.out.println(array[1]);
	
}
}
