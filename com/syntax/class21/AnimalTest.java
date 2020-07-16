package com.syntax.class21;

public class AnimalTest {
	
	public static void main(String[] args) {
	
		
	//object of the parents class has an access to all variable of it is parents and own class
		
	Animal a = new Animal();
	a.breed="something";
	a.color="grey";
	a.paws=4;
	
	a.sleep();
	a.eat();
	
	
	
	Dog dog=new Dog();
	dog.breed="husky";
	dog.color="black";
	dog.paws=4;
	dog.tail=true;
	
	dog.eat();
	dog.sleep();
	dog.bark();
	
	Cat cat = new Cat();
	
	cat.breed="persian";
	cat.color="white";
	cat.paws=4;
	cat.tail=true;
	cat.fur="d";
	
	cat.eat();
	cat.sleep();
	cat.purr();
	
	System.out.println();
	
	
	}

}
