package com.syntax.class15;

public class ReplaceFunction {

	public static void main(String[] args) {
		
		String me="I am a good tester, i am a good person";
		
		String str="Hello";
		
		str=str.replace('e', 'E');
		System.out.println(str);
		
		me = me.replace("good", "great");
		System.out.println(me);
		
		me = me.replace("we", "usa");
		System.out.println(me);
//		str=str.replace(str.length(1), str.length(2)); do not work with int	
		
		String fromApplication ="Phone number is 1234567890";
		System.out.println("fromApplication= "+fromApplication);
		fromApplication=fromApplication.replaceAll("[A-Z]", "");
		System.out.println(fromApplication); //hone number is 1234567890
		
		fromApplication=fromApplication.replaceAll("[a-z]", "").trim();
		System.out.println("new String value is="+fromApplication);//1234567890
		
		
		String another = "Hello12345";
		another=another.replaceAll("[A-Z]", "").replaceAll("[a-z]","");
		System.out.println(another);
		
		String anotherway="Hello12fdhfkl1123kr4t5990350";
		anotherway = anotherway.replaceAll("[A-Za-z]", "");
		System.out.println(anotherway);
		
		
		
		String mix = "Hello76588 friends 0976886";
		
		mix=mix.replaceAll("[0-9]", "");
				System.out.println(mix);
				
		String mix1 = "Hello $%&*^#@ friends *&^%$#@! 66";
		mix1=mix1.replaceAll("[^A-Za-z0-9]", " ");
		System.out.println(mix1);
		
		
	}
}
