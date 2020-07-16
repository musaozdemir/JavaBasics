package com.syntax.class20;

public class ConstructorTypes {

	
	ConstructorTypes(){
		
		System.out.println("I am a constructor");
	}
	
	ConstructorTypes(String str){//non argument constructor
		System.out.println("I am a constructor with 1 String parameter "+str);
	}

	ConstructorTypes(int num){ // parameterized constructor
		System.out.println("I am a constructor with 1 int parameter "+num);
		
	}
	
	ConstructorTypes(double num){
		System.out.println("I am a constructor with 1 double parameter "+num);
		
	}
	
	ConstructorTypes(String name, int age){
		System.out.println("I am a constructor with 2 parameter "+name+" "+age);
		
	}
	

	public static void main(String[] args) {
		
		ConstructorTypes obj = new ConstructorTypes("musa",22);
		
		System.out.println("I am a code inside main method");
		
		speak("Heelloo");
		
		
	}

	
	static void speak(String str) {
		System.out.println(str);
	}
}
