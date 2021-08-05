package com.syntax.IQ;

public class Q2 {
	
	public static void main(String[] args) {
		
		
		
		
		String a="Hello";
		String b="Hello";
	
		StringBuffer sb=new StringBuffer("Hello Syntax");
		a=a.concat(" Syntax");
		System.out.println(a);
		sb=sb.append(" Technologies");
		System.out.println(sb);
		
		
		
		
		//check the number is prime or not
		
		int num=11;
		boolean isPrime = true;
		
		
		if (num>1) {
			for(int i=2 ; i<num; i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		
		
		System.out.println("given number: "+num+" is prime? " +isPrime);
		
		
	}

}
