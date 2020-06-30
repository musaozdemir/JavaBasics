package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursda", "Friday" };
		
		System.out.println(weekdays[3]);
		
		System.out.println("after renamed");
		
		weekdays[3]="Thursday";
		System.out.println(weekdays[3]);
	
	
	double[] balances = {100000, 500.50 , 5500.50};
	
	System.out.println("Total  money is: " + (balances[0]+balances[1]+balances[2]));
	
	//2nd way
	
	double total = balances[0]+balances[1]+balances[2] ;
	
	System.out.println("total is " + total);
	
	//3rd way
	
	int total1 = (int)balances[0]+(int)balances[1]+(int)balances[2] ;
	
	System.out.println("total1 is " + total1);

	//4th way
	
	int total2 = (int)(balances[0]+balances[1]+balances[2]) ;
	
	System.out.println("total2 is " + total2);
		
	
	int i=10;
	int[] number = new int[i];
	
	number[0]=100;
	number[1]=50;
	number[5]=20;
	
	
	
	System.out.println(number[0]+"--"+number[1]+"--"+number[5]);
	}
}
