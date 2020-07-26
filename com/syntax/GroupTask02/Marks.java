package com.syntax.GroupTask02;

//We have to calculate the average of marks obtained in three subjects by student A 

//and by student B. Create class 'Marks' with an abstract method 'getPercentage' that will be 
//returning the average percentage of marks. 
//Provide implementation of abstract method in classes 'A' and 'B'. 
//The constructor of student A takes the marks in three subjects as its parameters and 
//the marks in four subjects as its parameters for student B. Test your code

abstract class Marks {
	double science, math, history;

	Marks(double science, double math, double history) {
		this.science = science;
		this.math = math;
		this.history = history;

	}

	double getpercentage() {

		double avarage = (science + math + history) / 3;
		return avarage;
	}

}

class StudentA extends Marks{
	
	StudentA(double science, double math, double history){
		super(science,math,history);
	}
	

	double getpercentage() {

		double avarage = (science + math + history) / 3;
		return avarage;
	}
	
	}
class StudentB extends Marks{
	
	double economy;
	StudentB(double science, double math, double history, double economy){
		super(science,math,history);
		this.economy=economy;
	}
	

	double getpercentage() {

		double avarage = (science + math + history+economy) / 4;
		return avarage;
	}
	
	}




	
	
	
	
	
	


