package com.syntax.GroupTask02;

public class RegistrationTest {

	public static void main(String[] args) {
		Registration r = new Registration();
		r.setEmail("yahoo");
		r.enterEmail(r.getEmail());
		r.setUserName("Kristina");
		r.enterUserName(r.getUserName());
		r.setPassword("Kristina123");
		r.enterPassword(r.getPassword());
	}
}
