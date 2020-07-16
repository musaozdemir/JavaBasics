package com.syntax.class20;

public class StudentsGrades {
	
	public static String name;
	int grade1;
	int grade2;
	int grade3;
	
	public void displayInfo(){
		
		System.out.println("student name is "+name+ " ScienceGrade is "+ grade1+ " mathGrade is "+ grade2+ " historyGrade is "+ grade3);
		
		int avarageGrade= (grade1+grade2+grade3)/3;
		
		System.out.println("avarageGrade is " +avarageGrade);
		
	}
	
	public StudentsGrades (String studentName, int ScienceGrade,int mathGrade,int historyGrade) {
		
		name=studentName;
		grade1=ScienceGrade;
		grade2=mathGrade;
		grade3=historyGrade;
		
	}
	
	int calculateAvarageGrade() {
		
		int avarage= (grade1+grade2+grade3)/3;
		return avarage;
	
	}
	
}
