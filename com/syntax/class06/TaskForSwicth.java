package com.syntax.class06;

import java.util.Scanner;

public class TaskForSwicth {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("please enter your country name");

		String country = scan.nextLine();

		String language;

		switch (country.toLowerCase()) {

		case "turkey":
			language = "Turkish";
			break;

		case "united states":
		case "united kingdom":
		case "canada":
			language = "english";
			break;

		case "germany":
		
			language = "german";
			break;

		case "albania":
			language = "albanian";
			break;

		case "france":
			language = "franch";
			break;

		case "russia":
			language = "russian";
			break;

		default:
			language = "unknown";

		}

		
		System.out.println("your language is " + language);
	}

}
