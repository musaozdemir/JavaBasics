package com.syntax.repl;

public class Repl150Test {
	
	public static void main(String[] args) {
		
		Employeee obj = new Employeee();
		obj.age=35;
		obj.lastName="Smith";
		obj.name="Joe";
		obj.salary=35000;		
		obj.display();
		
		Student obj1 = new Student();
		
		obj1.lastName="Adam";
		obj1.name="Smith";
		obj1.age=15;
		obj1.grade=10;
		obj1.display();
		
		Retiree obj2 = new Retiree();
		obj2.lastName="Frank";
		obj2.name="Smith";
		obj2.age=15;
		obj2.seniorActivity="tour";
		obj2.display();
	}

}
