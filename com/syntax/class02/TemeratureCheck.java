package com.syntax.class02;

public class TemeratureCheck {

	public static void main(String[] args) {
		
		//Create a Java program and name it Temperature Check. Create variable to store temperature. 
		 //Your program should check if temperature is below 32 then it should print 
		 //"Water will freeze with temperature __", otherwise "Water will NOT freeze with temperature __".
		 
		 int storeTemrerature;
		 storeTemrerature = 30;
		 
		 if (storeTemrerature <= 32) {
			 System.out.println("Water will freeze with temperature " + storeTemrerature);
		 }
		 
		 else if (storeTemrerature > 35) {
			 System.out.println(" water is drinkable");
		 }
		 
		 else {
			 System.out.println("Water will not freeze with temperature " + storeTemrerature);
		 }
	}
}
