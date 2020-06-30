package com.syntax.class14;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		// Accept username, password and confirm password from a user and check
		// following requirements:
		// Username and Password cannot be empty, if so→ message=“Username and Password
		// cannot be empty”.
		// Password should be minimum 8 characters, if less → message=“Password is too
		// short”.
		// Password cannot contain username if so, → message=“Password cannot contain
		// username”.
		// Password should match confirmed password, if not → message=“Passwords do not
		// match”
		// Only after all requirements met → message “Your username and password has
		// been created”

		// HW: continu asking user for username and password until all requarenmt are
		// met and credentials are created

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter user name");
		String username = scan.nextLine();
		System.out.println("Please enter your password");
		String password = scan.nextLine();

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}  
		
		else if (!(password.length() < 8)) {
				
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
		
		
}}
