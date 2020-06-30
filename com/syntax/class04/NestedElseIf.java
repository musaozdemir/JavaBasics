package com.syntax.class04;

public class NestedElseIf {

	public static void main(String[] args) {
		
		boolean quiz = true;
	
		int note = 101;
		
		if (quiz) {
			
			if (note <= 100) {
				
				if(note >= 90  ) {
				System.out.println("Your note is A , Great job!");
			}
			else if (note >= 80) {
				System.out.println("Your note is B , Well done!");
			}
			else if (note >= 70) {
				System.out.println("Your note is C , Just Passed!");
			}
			else {
				System.out.println("You failed!");
			}
			}else {
					System.out.println("your note can not be more than 100!");
				}
		}
			
		else { 
			System.out.println("Please complete your quiz!");
		}
		}
		
		
		
		
		
	}

