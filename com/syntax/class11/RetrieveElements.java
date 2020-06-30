package com.syntax.class11;

public class RetrieveElements {
public static void main(String[] args) {
	
	char[] grades = {'A','B','C','D','F'};
	
	for (int i=0; i<grades.length; i++) {
		System.out.print(grades[i]+" ");
	}
	
	
	System.out.println(" ");
	System.out.println(" ");
	
	System.out.println("----print using advanced loop----");
	System.out.println(" ");
	
	
	for (char element : grades) {
		System.out.print(element + " ");
	}
	
	
	
	System.out.println("");
	System.out.println("------------------");
	
	
	String[] fruits = {"apple","banana","orange","grapes","berries"};
	
	for(int i=0; i<fruits.length;i++) {
		if (fruits[i].equals("grapes")) {
			
			System.out.println(fruits[i] + " is my favorite fruit.");
		}
		else {
		System.out.println(fruits[i]+",");
		}
	}
	
	System.out.println("");
	System.out.println("------------------");
	
	for(String f : fruits) {
		if (f.equals("grapes")){
			System.out.println( f + " is my favorite fruit.");
		
		}else {
		System.out.println(f);
		}
	}
	
}
}
