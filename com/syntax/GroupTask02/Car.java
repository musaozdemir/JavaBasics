package com.syntax.GroupTask02;

public abstract class Car {
	
	double carPrice;
	String color;
	double salesPrice;

	
	Car(double carPrice, double salesPrice, String color){
		this.carPrice=carPrice;
		this.salesPrice=salesPrice;
		this.color=color;
	
	}

	double calculateSalePrice(){
		double salesPrice=0;
		return salesPrice;
		
	}
	
}

class Truck extends Car{
	
	int weight;
	Truck(double carPrice, double salesPrice, String color,int weight){
	
		super(carPrice,salesPrice,color);
		this.weight=weight;
		}
	
	double calculateSalePrice(){
		if (weight>200) {
			salesPrice=carPrice*0.9;
		}else {
			salesPrice=carPrice*0.8;
		}
		return salesPrice;
	
	}
	
	}

class Sedan extends Car{
	
	int length;
	Sedan(double carPrice, double salesPrice, String color,int length){
	
		super(carPrice,salesPrice,color);
		this.length=length;
		}
	
	double calculateSalePrice(){
		if (length>20) {
			salesPrice=carPrice*0.95;
		}else {
			salesPrice=carPrice*0.9;
		}
		return salesPrice;
	
	}
	
	}

