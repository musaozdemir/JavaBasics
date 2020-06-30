package com.syntax.class11;

public class Task1 {
	private static final boolean String = false;

	public static void main(String[] args) {
	
	
	String[] country = {"USA","France","Italy","Germany","Russia","Japan","Canada"};
	
	String[] capital = {"Washington DC","Paris","Roma","Berlin","Moscow","Tokyo","Ottowa"};
	
	for (int i = 0; i<country.length; i++) {
		
		System.out.println("capital of "+country[i]+" is "+capital[i]);
		
	}
	
	System.out.println("");
	System.out.println("-----2nd way-----");
	System.out.println("");
	
	
	for (int i = 0; i<country.length; i++) {
		
		switch(country[i]) {
		
		case "USA":
			System.out.println("Washington DC");
			break;
		case "France":
			System.out.println("Paris");
			break;
		case "Germany":
			System.out.println("Berlin");
			break;
		case "Italy":
			System.out.println("Rome");
			break;
		case "Japan":
			System.out.println("Tokyo");
			break;
		case "Canada":
			System.out.println("Ottowa");
			break;
		default:
			System.out.println("not in the list");
		}
	}
	
	
	
	System.out.println("");
	System.out.println("--------");
	System.out.println("");
	
	int[] numbers = {20,30,40,50,60,70,80,90,100};
	int sum = 0;
	
	for (int num : numbers) {
		
		sum += num;
	}
		System.out.println("sum:"+ sum);
		
		
		
		System.out.println("");
		System.out.println("----other way----");
		System.out.println("");
		
		int total=0;
		
		for (int i=0; i<numbers.length; i++) {
			
			int num = numbers[i];
			total += num;
		}
		
		System.out.println("total of all the number;"+total);
	
	
	}

	private static String String(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

