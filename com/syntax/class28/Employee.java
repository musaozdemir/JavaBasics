package com.syntax.class28;

public class Employee {

	// make variable as private
	private double salary;
	private int age, empId;

	// cereate public methods(getters and setters to give access to private variables

	// cereating setters
		public void setsalary(double salary) {
			this.salary = salary;
		}

		public void setAge(int age) {
			if (age > 16) {
				this.age = age;
			}
		}

		public void setEmpId(int empId) {
			if (empId > 0) {
				this.empId = empId;
			}

		}
	
	
	// creating getters
	public double getSalary() {
		return salary;

	}

	public int getAge() {
		return age;
	}

	public int getEmpId() {
		return empId;
	}	
	
}
