package com.syntax.repl;

public  class Car{
	  
	  String make;
	  String model;
	  int numberOfDoors;
	  int topSpeed;
	  double price;
	  
	  
	  Car (String make, String model, int numberOfDoors, int topSpeed, double price){
	    this.make=make;
	    this.model=model;
	    this.numberOfDoors=numberOfDoors;
	    this.topSpeed=topSpeed;
	    this.price=price;
	  
	    
	    System.out.println(make+" "+model+" "+ numberOfDoors+ " "+ topSpeed+ " "+price);
	  }
	  
	  Car (String make, String model, int topSpeed, double price){

	    this.make=make;
	    this.model=model;
	    this.topSpeed=topSpeed;
	    this.price=price;
	    numberOfDoors=4;

	    System.out.println(make+" "+model+" "+ numberOfDoors+ " "+ topSpeed+ " "+price);
	  }
	  
	  Car (int numberOfDoors, int topSpeed, double price){
	   
	    this.numberOfDoors=numberOfDoors;
	    this.topSpeed=topSpeed;
	    this.price=price;
	    System.out.println(make+" "+model+" "+ numberOfDoors+ " "+ topSpeed+ " "+price);
	  }
	  
	  Car (String make, String model, int numberOfDoors){
	    
	    this.make=make;
	    this.model=model;
	    this.numberOfDoors=numberOfDoors;
	    topSpeed=90;
	    price=0;
	    
	    
	    
	    System.out.println(make+" "+model+" "+ numberOfDoors+ " "+ topSpeed+ " "+price);
	   
	  }
	}