package com.syntax.class02;

public class PracticeCompoundOprerators {

	public static void main(String[] args) {

		// 1. Declare variable and increase by 100 using shorthand operator
		// 2. Declare variable and decrease by 67 using shorthand operator
		// 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using
		// shorthand operator
		// each person should get an equal piece of cake
		// 4. Declare variable cakePiece=25 and divide cakePiece between 7 people .
		// Using shorthand operator
		// found out how many pieces of cake left after it was distributed equally among
		// 7 people

		int a = 10;

		// 1. Declare variable and increase by 100 using shorthand operator

		a += 100;

		System.out.println(a);
		
		//2. Declare variable and decrease by 67 using shorthand operator
		
		int b = 220;
		
		b -= 67;
		
		System.out.println(b);
		
		//3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
		
		int cakepiece = 11;
		
		cakepiece /= 4;
		
		System.out.println(cakepiece + " piece of cake for each person");
		
		// 4. Declare variable cakePiece=25 and divide cakePiece between 7 people .
		// Using shorthand operator
		// found out how many pieces of cake left after it was distributed equally among
		// 7 people
		
		int cakepiece2 = 25;
		
		cakepiece2 %= 7;
		
		System.out.println(cakepiece2 + " cakepiece left.");
		
		
		
		
		
		
		
		
		
	}

}
