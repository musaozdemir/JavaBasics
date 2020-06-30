package com.syntax.class14;

public class School {

	public static void main(String[] args) {
		
	Student student = 	new Student();
	
	student.name="musa";
	student.lastname="ozdemir";
	student.grade='A';
	student.school="Syntax";
	student.studentId=259;
	
	student.homeWork(); // voidle belirttigimiz metodlarda icerigini okuyor. icinde ne varsa onu calistiriyor.
	student.study();
	
	
	System.out.println(student.name+" "+student.lastname+" "+student.grade+" "+student.studentId+" "+student.school);
	
	
	
	}
}
