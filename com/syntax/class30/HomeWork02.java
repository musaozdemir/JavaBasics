package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork02 {

	public static void main(String[] args) {
		
		//Create an arrayList of even numbers from 1 to 50. 
		//Remove any number that is divisible by 5 from that arrayList.

		ArrayList<Integer> number = new ArrayList<>();
		
		for (int i=1 ; i<50; i++) {
			
			if (i%2 == 1) {
				number.add(i);
			}
		}
		
		System.out.println("new arrayList = "+number);
	
		
		Iterator<Integer> numberIT = number.iterator();
		
		while(numberIT.hasNext()) {
			int numberss = numberIT.next();
			
			if (numberss%5 ==0) {
				numberIT.remove();
				
			}
		}
		
		System.out.println("new arrayList after remove diviable 5 = "+number);
		
	}
}
