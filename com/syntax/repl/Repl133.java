package com.syntax.repl;

public class Repl133 {
		  
		  static int countA(String s){
		    
		    int number=0;
		    char a='a';
		    char aA='A';
		    
		    for(int i=0; i < s.length() ; i++){
		      
		      if (s.charAt(i) == a || s.charAt(i) == aA){
		      number++;
		      }
		    }
		    
		    return number;
		    
		    }
		    
		    
		  
			
			
			//test case below (dont change):
			public static void main(String[] args){
			  
				System.out.println(countA("aaA")); //3
				System.out.println(countA("aaBBdf8k3AAadnklA")); //6
			}
		}


