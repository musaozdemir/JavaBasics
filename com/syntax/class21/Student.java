package com.syntax.class21;

public class Student {

	
	//Write a Student class   that have instance variables name and address. 
	//Create a constructor that will initialize those variables. 
	//Print name & address of given  student using displayInfo method.

	
	public String name;
	public String address;
	
	Student(String name, String address){
		this.name=name;
		this.address=address;
		
		}
	
	
	void displayInfo(){
		
		System.out.println("Student name is "+name+" and Student address is "+address);
	
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student("mike","greenligth st NY 17552.");
		
		obj.displayInfo();
		
	}
	
}



