package com.syntax.class14;

public class StringMethods {

	public static void main(String[] args) {
		
		//1st way to create a String using String literak --> most popular way
		String name="musa";
		
		//2nd way to create string
		String name1 = new String();
		name1="musa";
		
		System.out.println(name);
		System.out.println(name1);
		
		// methods of String class
		
		System.out.println("------- .length() methods ----------");
		
		String school="Syntax";
		//tells how many charcters are in the String
		int size = school.length();
		System.out.println(size);
		
		String greetings = "HeLLo Syntax Students";
		int sizeOfGreetings = greetings.length();
		System.out.println(sizeOfGreetings);
		
				
		System.out.println("------- .toUpperCase() methods ----------");
		
		String city = "Washington DC";
		
		String CityWithUpperCase=city.toUpperCase();
		
		System.out.println(CityWithUpperCase);
		
		String CityWithLowerCase=city.toLowerCase();
		
		System.out.println(CityWithLowerCase);	
		
		
		
		System.out.println("------- .concat() methods ----------");
		
		String country="USA";
		String capital="Washington DC";
		
		// + with String serves as concatenation operator
		// + with numbers serves as arithmetic operator
		
		System.out.println(country+" = "+capital);
		System.out.println(country.concat(capital));//will work only if both values are String type
		
		int day=27;
		String month="June ";
		
		
		System.out.println(month+day);
		//		System.out.println(month.concat(day)); DIDNT WORK
		
		System.out.println("------- .isEmpty() methods ----------");
		
		
		// if length of the String is =0 than it is empty
		
		String str = "Hello";
		boolean isEmpty = str.isEmpty();
		
		System.out.println(isEmpty);
	
		String str1 = "";
		boolean isEmpty1 = str1.isEmpty();
		
		System.out.println(isEmpty1);
	
		
		System.out.println("------- .trim() methods ----------");
	
		String cat = "My cat name is Tom";
		String dog = "           My dog name     is      karabas        ";
		
		System.out.println("<<<<<<before trim method>>>>>>");
		System.out.println(cat);
		System.out.println(dog);
		
		
		System.out.println("<<<<<<after trim method>>>>>>");
		String cat1=cat.trim();
		System.out.println(cat1);
		String dog1=dog.trim();
		System.out.println(dog1);
		
		String a="        ";
		String dog2=dog.replace(a,a);
		System.out.println(dog2);
		
		
		System.out.println("------- .contains() methods ----------");
		
		String sttr = "Good afternoon all";
		
		boolean contains=sttr.contains("afternoon");
		System.out.println(contains);
		
		
		String searchValue = "good";
		
		
		boolean isItThere=sttr.contains(searchValue);
		System.out.println(isItThere);
		
		System.out.println(sttr.contains(" "));
		
		
		System.out.println("------- .startsWith() methods ----------");
		
		String drink = "water";
		System.out.println(drink.startsWith("w"));
		
		
	
		
		System.out.println("------- .endsWith() methods ----------");
		
		boolean ends = drink.endsWith("a");
		System.out.println(ends);
		
		System.out.println("-----an other example");
		
		String str2 ="Hello Everyone, hope you are well.";
		
		System.out.println(str2.startsWith("Hello"));
		System.out.println(str2.endsWith("."));
				
		
		System.out.println("------- .equals() methods ----------");
		
		String string1 = "Saturday";
		String string2 = "saturday";
		
		boolean check = string1.equals(string2);
		
		System.out.println(check);
		
		boolean equality = string1.equalsIgnoreCase(string2);
		System.out.println(equality);
		
		System.out.println("------- .charAt() methods ----------");
		
		String season = "Sumer";
		
		char character =season.charAt(4);
		System.out.println(character);
		
		System.out.println("------- .indexOf() methods ----------");
		
		int index = season.indexOf('m');
		System.out.println(index);
		
		String hello="Hello Friends";
		int indexOfFriends=hello.indexOf("Friends");
		System.out.println("indexOfFriends="+indexOfFriends);
		
		System.out.println("------- .substring() methods ----------");
		
		String message="youarethebesttttt";
		String messageNew=message.substring(1);
		
		System.out.println("message="+message);
		System.out.println("messageNew="+messageNew);

		String middleWord=message.substring(4, 8);
		System.out.println("middleWord4-8 "+middleWord);
		
		int indexx=message.length();
		String delete = message.substring(indexx);
		System.out.println("resault="+delete);
	
	
	}
}
