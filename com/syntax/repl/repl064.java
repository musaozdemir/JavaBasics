package com.syntax.repl;

import java.util.Scanner;

public class repl064 {
public static void main(String[] args) {
	
	 	Scanner inp;
	    int end;
	    System.out.print("Int:");
	    //write your code below
	    
	    
	    Scanner scan = new Scanner(System.in);
	    
	    end = scan.nextInt();
	    int x = 0;
	    
	   do {
	     if (end>0) {
	     System.out.print(x + " ");
	     x++;
	     }
	     
	   }while (x<(end*2));
	   
	   
	   

	    
}
}
