package com.syntax.GroupTask02;

public class MarksTest {

	public static void main(String[] args) {
		
		Marks a = new StudentA(30,60,90);
		double avarageA=a.getpercentage();
		System.out.println(avarageA);
		
		Marks b = new StudentB(30,60,90,100);
		double avarageB=b.getpercentage();
		System.out.println(avarageB);
		
		
		
		
	}
}
