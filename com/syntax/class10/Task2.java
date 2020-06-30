package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		
		String[] group1 = new String[5];
		
		group1[0]="musa";
		group1[1]="ali";
		group1[2]="metin";
		
		String[] group2= { null,null,"musa","ali",null,"metin",null};
		
		System.out.println("The length of group2 is "+group2.length);
		System.out.println(group2[2]);
	
	}
}
