package com.syntax.class32;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class PersonTest {

	public static void main(String[] args) {
		
		
		Map<Integer, Person> person = new LinkedHashMap<Integer, Person>();
		
		person.put(01, new Person("musa", "Ozdemir", 33, 110000));
		person.put(02, new Person("yusuf eren", "Ozdemir", 29, 200000));
		person.put(03, new Person("sule", "Ozdemir", 02, 10000));
		
		
		Collection<Person> p = person.values();
		
		for (Person employee : p) {
			
			System.out.println();
			employee.displayinfo();
		}
		
		
		
	}
	
	
}
