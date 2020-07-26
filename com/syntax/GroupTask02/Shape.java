package com.syntax.GroupTask02;

public interface Shape {
	void calculateArea();

	void calculatePerimiter();
}

class Square implements Shape {

	double x;
	double perimiter;
	double area;

	public void calculateArea() {
		area = x * x;

		System.out.println("The area of Square is=" + area);

	}

	public void calculatePerimiter() {
		perimiter = 4 * x;
		System.out.println("The Perimiter of Square is=" + perimiter);
	}
}

class Circle implements Shape {
	double d;
	double perimiter;
	double area;

	public void calculateArea() {
		area = 3.14 * d * d;

		System.out.println("The area of Circle is=" + area);

	}

	public void calculatePerimiter() {
		perimiter = 2 * 3.14 * d;

		System.out.println("The Perimiter of Square is=" + perimiter);
	}
}



