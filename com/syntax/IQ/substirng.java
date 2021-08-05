package com.syntax.IQ;

public class substirng {
	public static void main(String[] args) {
		
	String S="HELLOWORD";
	int start = 3;
    int end = 7;
    String news = "";
    for(int i=start; i<end ; i++){
    news = news + S.charAt(i);
        
    }
    
    System.out.println(news);
    System.out.println(S.substring(start,end));
    System.out.println(S.length());
    

}
}
