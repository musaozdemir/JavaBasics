package com.syntax.class25;

public class Computer {

	String name;
	int price;

	public Computer(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void priceInfo() {
		System.out.println(name + " price is " + price);
	}

	public void runOffice() {
		System.out.println("this computer runs Office programs");
	}

	public void internet() {
		System.out.println("this computer can connect to internet");
	}
}

class Apple extends Computer {

	public Apple(String name, int price) {
		super(name, price);
	}

	public void internet() {
		System.out.println("this computer can connect to internet with safari");
	}

}

class Lenovo extends Computer {

	public Lenovo(String name, int price) {
		super(name,price);
	}
		public void internet() {
			System.out.println("this computer can connect to internet with Chrome");
		}
	

}

class Hp extends Computer {

	public Hp(String name, int price) {
		super(name,price);
	}
	public void printer(){
		System.out.println(name+" sell printer also");
	}

	}



class Dell extends Computer {

	public Dell(String name, int price) {
		super(name, price);
	}
	
	public void monitor() {
		System.out.println(name+" sell monitors also");
	}
	}
	
