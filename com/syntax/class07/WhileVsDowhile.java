package com.syntax.class07;

public class WhileVsDowhile {
	
	public static void main(String[] args) {
		
		// print hello 3 times.
		
		int x = 11;
		
		while (x <=3) { 
			
			System.out.println("hello");
			x++;
		}
		
		
		System.out.println("---------using do while loop---------");
		
		
		int y = 11;
		
		do {
			System.out.println("Hello");
			y++;
			
		} while(y <= 3);
		
	}

}
