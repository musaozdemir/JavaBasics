package com.syntax.class20;

public class ConstructorTask1 {
	
	//Write a program that will have a constructor:
	//one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors 1 by 1.

	ConstructorTask1(){
		
		System.out.println("this Constructor has a non parameters");
	}
	
	ConstructorTask1(int year){
		
		System.out.println("this paramater with 1 parameter. year is "+year);

	}
}
