package com.syntax.GroupTask02;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car truck=new Truck(10000, 0, "ggggg", 100);
		
		double salesPriceForTruck=truck.calculateSalePrice();
		System.out.println("new sales truck price after discount " +salesPriceForTruck+"truck color is "+truck.color);
		
		Car sedan=new Sedan(10000, 0, "white", 25);
		
		double salesPriceForSedan=sedan.calculateSalePrice();
		System.out.println("new sales sedan price after discount " +salesPriceForSedan+"sedan color is "+sedan.color);
		
	}

}
