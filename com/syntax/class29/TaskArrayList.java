package com.syntax.class29;

import java.util.ArrayList;

public class TaskArrayList {
	public static void main(String[] args) {
		
	
	ArrayList<String> names = new ArrayList<>();
	
	names.add("Pele");
	names.add("Maradona");
	names.add("Ronaldo");
	names.add("Roberto carlos");
	names.add("Alex");
	
	System.out.println("our names array is empty -> "+names.isEmpty()); 
	
	
	System.out.println("Our names array list is"+names);
	
	int namesSize = names.size();
	System.out.println("names array size="+namesSize);
	
	
	}
}
