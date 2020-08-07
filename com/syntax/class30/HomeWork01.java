package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ItalicAction;

public class HomeWork01 {

	// Create an arrayList of drinks. If any drink has letter “a” or “e” replace it
	// with water.

	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();

		drinks.add("water");
		drinks.add("coke");
		drinks.add("pepsi");
		drinks.add("gazoz");
		drinks.add("ayran");
		drinks.add("su");
		
		System.out.println("ArrayList after add -->"+drinks);

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {

				drinks.set(i, "water");
			}
			
		}

		System.out.println("ArrayList after Replace it -->"+drinks);	
	}

}
