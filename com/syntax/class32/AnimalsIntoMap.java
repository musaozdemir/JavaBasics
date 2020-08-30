package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalsIntoMap {

	public static void main(String[] args) {

		Map<Integer, Animal> life = new LinkedHashMap<>();
		life.put(1, new Dog("Dog", "Grey"));
		life.put(2, new Monkey("Monkey", "Brown"));
		life.put(3, new Zebra("Zebra", "White and Black"));

		
		
		System.out.println(" 1.             Using EntrySet               ");
		
		Set<Entry<Integer, Animal>> entry = life.entrySet();

		System.out.println("         Access all variables and call all avaiable methods of Animals with for enhanced loop         ");
		for (Entry<Integer, Animal> e : entry) {
			Animal animal = e.getValue();

			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("------------");

		}
		
		System.out.println("         Access all variables and call all avaiable methods of Animals with for Iterator");

		//Write with Iterator
		
		Iterator <Entry<Integer, Animal>> iterator = entry.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, Animal> ent = iterator.next();
			Integer key = ent.getKey();
			Animal value = ent.getValue();
			
			System.out.println(value.type);
			System.out.println(value.color);
			value.eat();
			value.sleep();
			System.out.println("------------");
			
		}
		
		

	
		
		System.out.println(" 2.             Using values()               ");
		
		System.out.println("         Access all variables and call all avaiable methods of Animals with for enhanced loop");

		
		   Collection<Animal> values =life.values();
		
		for(Animal animal:values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("------------");
		}
		
		//Write with Iterator
		System.out.println("         Access all variables and call all avaiable methods of Animals with for Iterator");

		 Iterator<Animal> value = values.iterator();
		 while(value.hasNext()) {
			Animal animal= value.next();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("------------");
			 
		 }
		 
		 
		
		System.out.println(" 3.             Using KeySet()               ");
		
		System.out.println("         Access all variables and call all avaiable methods of Animals with for enhanced loop");

		
		Set<Integer> keys=life.keySet();
		
		for(Integer key:keys) {
			Animal animal=life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("------------");
		}
		
		System.out.println("         Access all variables and call all avaiable methods of Animals with for Iterator");

		//Write with Iterator
		
		Iterator<Integer> keyIt = keys.iterator();
		while(keyIt.hasNext()) {
			Integer key = keyIt.next();
			Animal animal=life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("------------");
		}
		

		
	}

}
