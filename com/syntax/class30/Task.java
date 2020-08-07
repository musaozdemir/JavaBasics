package com.syntax.class30;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Task {

	public static void main(String[] args) {
		
		//Create an arraylist of cars and retrieve all the values using 3 different ways.

		//Create an arrayList of words. Remove every word that ends with “e”.
		
		
		
		
		ArrayList<String> car = new ArrayList<String>();
		
		car.add("Bmw");
		car.add("Tesla");
		car.add("Toyota");
		car.add("Mercedes");
		car.add("Ferrari");
		
		System.out.println(car);
		
		for (String cars:car) {
			System.out.print(cars+" ");
		}
		
		System.out.println("");
		for(int i=0;i<car.size();i++) {
			String car1 = car.get(i);
			System.out.print(car1+ " ");
		}
		
		
		
		
		
	}
}
