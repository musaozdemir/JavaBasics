package com.syntax.class09;

public class NestedLoops {

	public static void main(String[] args) {
		
		for ( int i = 1; i <= 3; i++) {
			
			System.out.println("i am outer loop");
			
			for ( int j = 1 ; j <= 3; j++) {
			
				System.out.println(i);
			}
		}
	
	
for ( int x = 1; x <= 3; x++) {
			
			System.out.println("i am outer loop");
			
			for ( int y = 1 ; y <= 3; y++) {
			
				System.out.println("x =" + x + " y = " + y);
			}
		}
	
	
	
	
	}
}
