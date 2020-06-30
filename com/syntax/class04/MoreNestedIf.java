package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isFriday = false;
		
		int date = 13;
		
		if (isFriday) {
			System.out.println("It is Friday. I am going to watch a movie.");
			if (date == 13) {
				System.out.println("I will watch scary movie.");
			} else {
				System.out.println("I will watch comedy.");
			}
			
		}else {
			System.out.println("It is not Friday. I am going to study JAVA.");
			
		}
		
	}

}
