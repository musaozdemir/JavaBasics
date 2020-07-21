package com.syntax.repl;

class Main142 {
	String schoolName;
	int batch;
	int year;
	String lastDayOfClass;
	
	Main142(){
	  System.out.println("I am non argument constructor");
	  }
	  
	  Main142(String schoolName, int batch, int year, String lastDayOfClass){
	    this.schoolName=schoolName;
	    this.batch=batch;
	    this.year=year;
	    this.lastDayOfClass=lastDayOfClass;
	    
	  }
	  
	  
	  public void dispInfo() {
		  System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	
}
	
