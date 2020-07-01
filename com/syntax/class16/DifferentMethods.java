package com.syntax.class16;

public class DifferentMethods {

	// lets create methods that says hello 10 times
	
	
	void sayHell0(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("Hello");
			
		}
			
	}
	
	
	// create that will print any word any number
	
	void printAnyWord(String word, int times ) {
		
		for (int i=0; i<times; i++)
			
			System.out.println(word);
		
		
		// create methods isHungry that will accept boolean value
		// and prints, if passed value is true --> "eat something", otherwise "go study" 
	}
		
		void isHungry(boolean areYouHungry) {
			
			if (areYouHungry) {
				System.out.println("eat something");
			} else {
				System.out.println("go ehad and study");
			}
			
		}
		
	
	
}
