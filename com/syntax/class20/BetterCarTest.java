package com.syntax.class20;

public class BetterCarTest {

	public static void main(String[] args) {
		
		BetterCar car = new BetterCar("X5","Red",2021,55000);
//		car = new BetterCar("X","Red",2021,55000); we can do reassigning like this 
		car.displayinfo();

		
		BetterCar car1 = new BetterCar("Model S","Gold",2019,90000);

		car1.displayinfo();
		
	}
	

}
