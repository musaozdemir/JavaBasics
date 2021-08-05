package com.syntax.IQ;

public class Q99 {

	public static void main(String[] args) {
		
		String original = " a b c d e f g h k";
		
		String yeni="";
		
		char [] arrayOfChar = original.toCharArray();
		
		for (int i=0; i<arrayOfChar.length;i++) {
	
			char x = arrayOfChar[i];
				if (x != ' ') {
					yeni = yeni+x;
				}
			
		}
	
	System.out.println(yeni);
		
	}
}
