package com.syntax.class14;

import java.util.Scanner;

public class Task01Gelistirme {
public static void main(String[] args) {
	

	Scanner scan = new Scanner(System.in);

	do {
	
	System.out.println("Please enter user name");
	String username = scan.nextLine();
	System.out.println("Please enter your password");
	String password = scan.nextLine();
	
	
	}while ( || !password.isEmpty()) {
	
		System.out.println("Username and Password cannot be empty");
	}  
	
	if (!(password.length() < 8)) {
			
			if (password.contains(username)) {
				System.out.println("Password cannot contain username");
			} else if (!password.contains(username)) {
				System.out.println("contunie to check point");
				System.out.println("Please enter confirm password");
				String confirmPassword = scan.next();
				if (!confirmPassword.equals(password)) {
					System.out.println("Passwords do not match");
					
				} else {
					System.out.println("Your username and password has been created");
				}

			}
		}else {
			
			System.out.println("Password is too short and should be min 8 charthers");

		}

	
}

