package com.syntax.class13;

public class Car {

	//define car features
	
	String make;
	String model;
	String color;
	int year;
	int speed;
	
	
	// define behavior in from of methods
	
	void drive() {
		System.out.println("Car can drive");
	}

	void reverse() {
		System.out.println("Car can reverse");
	}
	
	void transportPeople() {
		System.out.println("Car can transport people");
		
	}
	
	void stop() {
		
		System.out.println("Car can stop when press break");
		System.out.println("Car stopped!");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		Car c1 = new Car();
		c1.make="Toyota";
		c1.model="Corolla";
		c1.color="Yellow";
		c1.year=2011;
		c1.speed=160;
		
		System.out.println(c1.make+" "+c1.model+" "+c1.color+" "+c1.year+" "+ c1.speed);
		
		c1.drive();
		c1.transportPeople();
		c1.stop();
		c1.reverse();
			
	}
	
	
	
}


