package com.syntax.class28;



public class EmployeeTest {
	
	public static void main(String[] args) {
		
	

	Employee emp = new Employee();
	 
	emp.setsalary(100000000);
	double salary=emp.getSalary();
	System.out.println(salary);
	
	
	emp.setAge(1);
	System.out.println(emp.getAge());
	
	emp.setEmpId(-120);
	System.out.println(emp.getEmpId());
}
}

