package com.syntax.repl;

public class Repl159 {
	


		int method (int num1,int num2){
		  return num1+num2;
		}

		int method (int num1,int num2, int num3){
		  return num1+num2+num3;
		}

		int method (int num1,int num2, int num3, int num4){
		  return num1+num2+num3+num4;
		}

		public static void main(String[] args) {

		Repl159 obj = new Repl159();

		System.out.println(obj.method(10,10,10,10));
		System.out.println(obj.method(10,10,10));
		System.out.println(obj.method(10,10));
	
		


		}
		}
