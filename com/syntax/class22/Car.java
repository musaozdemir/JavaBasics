package com.syntax.class22;

public class Car {
	
	String make;
	
	public Car() {
		System.out.println("I am non argument conscructor of parents class");
	}

	
}

class Tesla extends Car{
	
	boolean autopilot;
	
	
	public Tesla(){
		System.out.println("I am non argument conscructor of child class");
	}
	
	void info() {
		System.out.println("we bouilt "+make+" that has autopilot feaure ="+autopilot);
	}
}