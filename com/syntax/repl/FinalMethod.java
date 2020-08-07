package com.syntax.repl;

public class FinalMethod {
	
	

	   final static void  m(String name){
	    for (int i=name.length()-1; i>0; i--){
	    	System.out.print(name.charAt(i));
	    }
}

	   public static void main(String[] args) {
		
		
		   FinalMethod.m("kaharamanmaras");
		   
		  
	}
	   
}
