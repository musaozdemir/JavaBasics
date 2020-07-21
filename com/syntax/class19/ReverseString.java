package com.syntax.class19;

public class ReverseString {

	
	//Create a method that will take a String as a parameter and returns reversed String. 
	//Method should be available to all classes within your project and accessible by class name.
	
	
	
	
	public  ReverseString (String name){
		
		name="musa";
		for (int i=name.length() ; i>0 ; i--) {
			
			String a=toString(name.charAt(i));
			
			//			
			System.out.print(name.charAt(i));
			
		
			
			
			
//			System.out.print(name.charAt(i));
			
		
			
		}

		
	}
	

	public static void main(String[] args) {
		
		ReverseString abc = new ReverseString("musaamusa");
		
//		
//	}
//
//	private String toString(char charAt) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//		
//	
	}
	}
	

