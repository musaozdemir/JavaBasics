package com.syntax.GroupTask02;

public class Registration {
	private String email;
	private String userName;
	private String password;

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void enterEmail(String email) {
		if (email.equals("yahoo")) {
			System.out.println(email);
		}
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void enterUserName(String userName) {
		if (userName.length() < 6) {
			System.out.println("error");
		} else {
			System.out.println(userName);
		}
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void enterPassword(String password) {
		if (password.contains(userName)) {
			System.out.println("error");
		} else if (password.length() < 6) {
			System.out.println("error");
		} else {
			System.out.println(password);
		}
	}
}
