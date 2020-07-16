package com.syntax.class22;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		ScrumTeam obj = new ScrumTeam ();
		
		obj.getPaid();
		obj.companyName="Google";
		ProductOwner.companyName="d";
		obj.fullName="john doe";
		obj.salary=100000;
		//		obj.ssn prvt no visiable in different class.
		
		Tester obj1 = new Tester ();
		
		obj1.ettendsMeetings();
		obj1.test();
		
		
	}

}
