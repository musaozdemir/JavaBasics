package com.syntax.GroupTask02;

public class ShapeTest {
	public static void main(String[] args) {
		
		Square square = new Square();
		square.x=5;
		square.calculateArea();
		square.calculatePerimiter();
		
		Circle circle = new Circle();
		circle.d=4;
		circle.calculateArea();
		circle.calculatePerimiter();
		
		
	}

}
