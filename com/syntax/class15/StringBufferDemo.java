package com.syntax.class15;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		StringBuffer strBuffer = new StringBuffer("Hello");
		
		strBuffer.append(" Friends ");
		
		System.out.println(strBuffer); //Hello Friends
		
		
		String str="Hello"; // String is immutable object=not changable
		str.concat(" Friends"); //new object creadted that new value is "Hello Friends" --> no one takes it
		System.out.println(str); //Hello 
	}

}
