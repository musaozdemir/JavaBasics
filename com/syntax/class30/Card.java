package com.syntax.class30;

//Create a Card class that will have implemented  and unimplemented methods and 
//a constructor that will initializes credit card type.  
//Create 3 subclasses of a Card card. Create 3 objects of different card and 
//store them into LinkedList. 
//Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Card {

	public String cardType;


	public Card(String cardType) {

		this.cardType=cardType;
		System.out.println( "card Type is -->"+cardType);
	}

	public void buy() {
	}

	public void pay() {

	}

}

class Visa extends Card{
	
	public Visa(String cardType) {
		super(cardType);
		
	}
	
	public void buy() {
	
	System.out.println("you can buy with your "+cardType+" card.");
	}
	
	
	public void pay() {
		System.out.println("you can pay your "+cardType+" card back.");
	}

	
	
}

class Master extends Card{
	
	public Master(String cardType) {
		super(cardType);
		
	}
	
	public void buy() {
	
	System.out.println("you can buy with your "+cardType+" card.");
	}
	
	
	public void pay() {
		System.out.println("you can pay your "+cardType+" card back.");
	}

	
	
}

class AE extends Card{
	
	public AE(String cardType) {
		super(cardType);
		
	}
	
	public void buy() {
	
	System.out.println("you can buy with your "+cardType+" card.");
	}
	
	
	public void pay() {
		System.out.println("you can pay your "+cardType+" card back.");
	}

	
	
}

