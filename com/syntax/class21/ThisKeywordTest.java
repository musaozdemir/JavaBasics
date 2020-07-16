package com.syntax.class21;

public class ThisKeywordTest {

	public static void main(String[] args) {
		
		ThisKeyword	number= new ThisKeyword(100,200);
		
		number.sum(10, 20);
		
		ThisKeyword number1=new ThisKeyword();
		number1.sum(20, 50);
		
		
	}
}
