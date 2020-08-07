package com.syntax.class30;


	
	//Create a class Insurance that will have an attribute as insuranceName and 
	//unimplemented behaviour as getQuote and cancelInsurance. 
	//Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and 
	//Class Pet has petType attribute. Create 3 objects of the sub classes and 
	//store them in ArrayList. 
	//Using for loop/advanced for loop/ iterator access all methods of the class. 

	
	public abstract class Insurance{
		
		public String insuranceName;
		
		public Insurance(String insuranceName) {
			this.insuranceName=insuranceName;
			
		}
		
		public  void getQuote() {
			
		}
		
		public  void cancelInsurance() {
			
		}
		
	}
	
	class Car extends Insurance{
		
		public String carModel;
		
		public Car(String insuranceName, String carModel) {
			
			super(insuranceName);
			this.carModel=carModel;
		}
		
		public void getQuote() {
			System.out.println("Get the Quote for "+carModel+" in "+insuranceName);
			
		}
		
		public void cancelInsurance() {
			
			System.out.println("Cancel insurance for "+carModel+" in "+insuranceName);

		}
		
	}
	
	class Pet extends Insurance{
		
		public String petType;
		
		public Pet(String insuranceName, String petType) {
			super(insuranceName);
			this.petType=petType;
			
			
		}
		
		public void getQuote() {
			System.out.println("Get the Quote for "+petType+" in "+insuranceName);
			
		}
		
		public void cancelInsurance() {
			
			System.out.println("Cancel insurance for "+petType+" in "+insuranceName);

		}
	}

	class Health extends Insurance{
	
		public Health (String insuranceName) {
			super(insuranceName);
		}
		
		public void getQuote() {
			System.out.println("getQuote method inside health class");
			
		}
		
		public void cancelInsurance() {
			System.out.println("cancelInsurance method inside health class");
			
		}
	
}

