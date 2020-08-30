package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task02 {

//	Create a map of Best Buy store. Place
//	item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//	Retrieve all keys and values from a Best Buy map using EntrySet.

	public static void main(String[] args) {
		
		Map<Integer, String> bestBuy = new TreeMap<Integer, String>();
		
		bestBuy.put(2020001, "Printer");
		bestBuy.put(2020002, "Computer");
		bestBuy.put(2020003, "Coffee machine");	
		bestBuy.put(2020004, "Cell Phone");
		bestBuy.put(2020005, "Televison");
	
		
		Set <Entry<Integer, String>> entries = bestBuy.entrySet();
		
		System.out.println("-------------Print with eachLoop-----------");
		
		System.out.println(entries);
		
		for (Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" --> "+value);
			
		}
		
		System.out.println("-------------Print with Iterator-----------");
		
		Iterator<Entry<Integer, String>> iterator = entries.iterator();
		
		while(iterator.hasNext()) {
		Entry<Integer, String> ent = iterator.next();
		
		System.out.println(ent.getKey()+" --> "+ent.getValue());
		
		}
	}
	
	
}
