package com.syntax.class21;

public class Book {

	// Write program as a Book class that will have instance variables and 2
	// Constructors.
	// While creating an object make sure:

	// Instance variables are being initialized
	// Both Constructors are being executed

	public String name;
	public String writer;
	public int page;

	Book() {
		System.out.println("I love read but i dont have a time");

	}

	Book(String name, String writer, int page) {
//		this(20);
		this.name = name;
		this.writer = writer;
		this.page = page;

	}

	void displayinfo() {
		System.out.println("Book name is " + name + ". Book write by " + writer + " and book page is " + page);

	}

	public static void main(String[] args) {

		Book books = new Book("Animal farm", "Oliwer John", 433);
		Book book = new Book();
	
		book.displayinfo();
		books.displayinfo();
	}
}
