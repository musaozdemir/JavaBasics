package com.syntax.class17;

import org.omg.CosNaming.IstringHelper;

public class Task01 {

	public static void main(String[] args) {
		
		Task01 obj = new Task01();
		
		String email = obj.createEmail("musa", "ozdemir", "gmail");
		
		System.out.println(email);
		
		
		System.out.println("----------------------------");
		
		
		Task01 object = new Task01(); 
		
		boolean number = object.isPrime(20);
		System.out.println(number);
	}
	
	//Create a method createEmail(). Based on values of users name, lastName and email type,
	//your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

	String createEmail (String name, String lastname, String emailType){
		
		String mail =name.toLowerCase() + lastname.toLowerCase()+"@"+emailType+".com";
		
 		return mail;
	}
		
		//Write a method to return whether given number is prime or not?
 		
 		boolean isPrime(int a) {
 			boolean prime = true;
 					
 					if (a>1) {
 						for (int i=2; i<=2/i; i++) {
 							if (a%i == 0) {
 								prime = false;
 								break;
 							}
 						}
 					}else {
 						prime = false;
 					}
 				return prime;
 				
 		}
 		
 		
// 		Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
// 			score > 90 - A
// 			score >80 - B
// 			score >70 - C
// 			score > 50 - D
// 			anything else - F
 		
 		

 		
	

}
