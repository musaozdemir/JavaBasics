package com.syntax.class20;

public class BetterCar {


	public static String make="BMW";
	protected String model, color;
	int year;
	private double price;

	
	public void displayinfo() {
		
		System.out.println("we build "+color+" "+year+" "+make+" "+ model+ " for price = $"+price);
	}
	
	
	public BetterCar(String carModel, String carColor, int carYear, double carPrice) {
		model=carModel;
		color=carColor;
		year=carYear;
		price=carPrice;
	}
	
	
	
}
