package com.syntax.class35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task02 {

	public static void main(String[] args) {

//		Create a static method that will return a List of Exceptions.
//		Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//		Call your method inside main and print name and details of all Exception objects.
		
		List<String> list =  listOfException();
		
		for(String ls:list) {
			System.out.println(ls);
		}
		
	}

	public static List<String> listOfException() {

		List<String> list = new ArrayList<>();

		int[] array = { 10, 20, 30 };

		try {

			System.out.println(array[3]);

		} catch (ArrayIndexOutOfBoundsException ioe) {
			list.add("first exception--> " + ioe.getMessage());

		}

		String str = null;
		

		try {
			System.out.println(str.length());
		} catch (NullPointerException npe) {
			String message2 = npe.getMessage();
			list.add("second exception--> " + message2);

		}

		
		int a=12;
		int b=0;
		
		try {
			System.out.println(a/b);
		} catch(ArithmeticException ae) {
			list.add("third exception--> "+ ae.getMessage());
			
		}
		
		
		
		String filePath=System.getProperty("user.dir") + "ata/SampleTestData.xls";
		
		try {
			
			FileInputStream fis =new FileInputStream(filePath);
			
		} catch (FileNotFoundException fnfe) {
			list.add("fourth exception--> "+fnfe.getMessage());
		}
		
		
		
		
		return list;

	}

}
