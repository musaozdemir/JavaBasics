package com.syntax.class31;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
	
	//Create a Set of cities in which you want to make sure that insertion order is maintained. 
	//Using Iterator remove any city that starts with “A”;
	
	
	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<String>();
		
		cities.add("Cape Town");
		cities.add("Johannesburg");
		cities.add("Durban");
		cities.add("Amasya");
		cities.add("Booleamfontain");
		cities.add("Proteria");
		cities.add("Ankara");
		cities.add("Port Elizabeth");
		cities.add("Century City");
		cities.add("Antalya");
		
		System.out.println("Original cities after complate adding"+cities);
		
		for(String city:cities) {
			if(city.startsWith("A")) {
				cities.remove(city);
			}
		}
		
		System.out.println(" cities after delete cities starts with 'a' "+ cities);

		
	}


}
