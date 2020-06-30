package com.syntax.class09;

import java.util.Scanner;

public class HotelRooms {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("how many floors does your hotel");
	
	int floors = scan.nextInt();
	
	System.out.println("how many roos in each floor");
	int rooms = scan.nextInt();
	
	for ( int i=1; i<= floors; i++) {
		
		System.out.print("floor #" + i + " --> ");
		
		for (int j=1; j<= rooms; j++ ) {
			
			System.out.print(i+"."+j+" ");
		}
			System.out.println();
	}
}
}
