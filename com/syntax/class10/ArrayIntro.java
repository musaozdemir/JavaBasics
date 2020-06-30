package com.syntax.class10;

public class ArrayIntro {
	public static void main(String[] args) {
		
//		Scanner   scan = new Scanner();
		int [] numbers = new int[4];
		
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		
		for (int i=0; i<=3; i++) {
			
			System.out.println("numbers "+ i + " value is " + numbers[i]);
		}
		
		int element0 = numbers[0];
		
		System.out.println("----------------");
		
		String[] carArray; // prefered way
		
	
		carArray = new String[3];
		
		carArray[0] = "BMW";
		carArray[1] = "Mercedes Benz";
		carArray[2] = "Ferrari";
		
		
		String car = carArray[0];
		System.out.println(car);
		
		
		System.out.println("----------------");
		
		
		String carArray1 []; // works but not prefered way.
		
		carArray1 = new String []{"toyota","audi","subaru"};
		
		String myCar = carArray1[2];
		
		System.out.println(myCar);
		
		
		System.out.println("----------------");
		
		
		
		char [] letters = new char[3];
		
		letters[0]='a';
		letters[1]='b';
		letters[2]='c';
		
		System.out.println(letters[0]+""+letters[1]+letters[2]);
				
		//Re-assigning	
		
		letters[1]='x';
			
		System.out.println(letters[0]+""+letters[1]+letters[2]);
				
	}
}
