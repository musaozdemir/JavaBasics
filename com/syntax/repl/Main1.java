package com.syntax.repl;

import java.util.Scanner;

class Main1 {

	
  public void method (int num ){
	
  System.out.println(num);
  }
  
  public void  method (String school){
	  
    System.out.println(school);
  }
  
  public void method(double num1){
    System.out.println(num1);
  }
  
 
  


 public  static void main (String [] args){
   
	 Scanner scan = new Scanner();
	 
	 
   Main1 obj = new Main1();
   
    obj.method(100);
    
  }
  

}