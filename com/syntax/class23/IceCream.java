package com.syntax.class23;

public class IceCream {

	String flavor, brand, color;

	public IceCream(String flavor, String brand, String color) {

		this.flavor = flavor;
		this.brand = brand;
		this.color = color;

	}
}

class Gelato extends IceCream {

	public Gelato(String flovor, String brand, String color) {

		super(flovor, brand, color);

	}
}

class Sorbeto extends IceCream {

	// we can have own variables

	double price;

	public Sorbeto(String flovor, String brand, String color, double price) {

//		this.price=price; --> CE
		super(flovor, brand, color); // call to parents class constructor must be in first line --> super();
		this.price = price;

	}

}

class MiniSorbeto extends Sorbeto{
	
	int calories; 
	
	public MiniSorbeto(String flovor, String brand, String color, double price, int calories) {
		
		super(flovor, brand, color,price);
		this.calories=calories;
		
		
	}
}
