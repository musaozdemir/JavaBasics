package com.syntax.class20;

public class Car {
	
	public static String make;
	protected String model, color;
	int price, door, speed;
	private int year;
	
	
	public void displayInfo() {
		System.out.println("we build "+year+" "+make+" "+model+" for price =$"+price);
	}
	
	// created constroctor
	Car(){
		
		System.out.println("I am a constroctor");
	}
	public static void main(String[] args) {
		
		Car car = new Car();
		
		/* 
		 Car --> class name
		 car --> referance name
		 new --> keyword
		 Car(); --> calling Constractor
		 */
		
		make="Bmw";
		car.model="320i";
		car.price=10000;
		car.year=2020;
		car.color="white";
		car.speed=200;
		car.door=2;
		
		
		Car car1 = new Car();
		
		car1.model="M5";
		car1.price=50000;
		car1.year=2021;
		car1.color="blue";
		car1.speed=200;
		car1.door=2;
		
		
		car.displayInfo();
		car1.displayInfo();
		
		
	
		
//		static String driver;
//		System.out.println(driver);
		

	}

}
