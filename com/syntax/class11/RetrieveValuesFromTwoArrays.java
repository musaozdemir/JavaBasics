package com.syntax.class11;

import java.time.Month;

public class RetrieveValuesFromTwoArrays {

	public static void main(String[] args) {
		
		String [][] months = {
				
				{"December","January","February"},
				{"March","April","May"},
				{"June","July","August"},
				{"September","October","November"}
		};
		
		int rows = months.length;
		
		int cols = months[0].length;
		
		System.out.println("length of rows:"+rows+" and length of cols:"+cols);
		
		for (int r=0; r<months.length; r++) {
			
			for ( int c=0; c<months[r].length; c++) {
				
				System.out.println(months[r][c]);
			}
			
			
			
		}
		
		
		
	}
}
