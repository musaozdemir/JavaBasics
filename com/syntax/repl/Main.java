package com.syntax.repl;

import com.syntax.class25.Store;

public class Main {
	   
	   
    String schoolName;
    int batch;
    int year;
    
    Main(String schoolName, int batch, int year){
      this.schoolName=schoolName;
      this.batch=batch;
      this.year=year;
      
    }
   
   void info(){
     System.out.println("I am a student batch "+ batch+ " studying at "+ schoolName+" in the year of " + year);
   }
   
   	public static void main(String[] args) {
    
   Main obj = new Main("Syntax",6,2020);
   
   obj.info();
   
  
   



   	} 
 }
