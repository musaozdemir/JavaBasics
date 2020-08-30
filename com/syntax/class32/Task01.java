package com.syntax.class32;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task01 {

	
	//Create a map of countries with its capital that will store countries in alphabetical order.
	//Print all keys and values from a country map using for each loop and iterator.
	//Print all values from a country map using for each loop and iterator.

	
	
	public static void main(String[] args) {
		
		Map<String, String> countries = new HashMap<String, String>();
		
		countries.put("Turkey", "Ankara");
		countries.put("USA", "Washington DC");
		countries.put("Italy", "Rome");
		countries.put("South Africa	", "Pretoria");
		countries.put("France", "Paris");
		
		System.out.println("--------Print keys with Iterator--------");
		
		Iterator<String> keys = countries.keySet().iterator();
		while(keys.hasNext()) {
			System.out.println(keys.next());
		}
		
		System.out.println("--------Print keys with Foreach/enhansed loop--------");
		
		Set<String> keyss = countries.keySet();
		
		for(String  key:keyss) {
			System.out.println(key);
		}
	
		System.out.println("--------Print Values with Iterator--------");
		
		Iterator<String> values = countries.values().iterator();
		while(values.hasNext()) {
			System.out.println(values.next());
		}
		
		System.out.println("--------Print keys with Foreach/enhansed loop--------");
		
		Collection<String> valuess = countries.values();
		
		for(String  value:valuess) {
			System.out.println(value);
		}
	
	}
}
