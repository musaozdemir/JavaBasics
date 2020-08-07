package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
		
	
	//Create an arrayList of words. Remove every word that ends with “e”.

     ArrayList<String> words =new ArrayList<>();
     
     words.add("refine");
     words.add("regteangle");
     words.add("door");
     words.add("appple");
     words.add("book");
     words.add("Sanitize");
     words.add("define");
     words.add("hope");
     words.add("cape");
     
     System.out.println(words);
     
    Iterator<String> wordsIT = words.iterator();
     
    while(wordsIT.hasNext()) {
    	if(wordsIT.next().endsWith("e")) {
    		wordsIT.remove();
    		
    	}
    	
    }
     
    System.out.println(words);
     
     



	}

}
