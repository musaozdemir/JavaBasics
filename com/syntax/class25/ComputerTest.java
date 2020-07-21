package com.syntax.class25;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer apple = new Apple("apple",10000);
		Computer lenovo = new Lenovo("Lenovo",5000);
		Computer hp = new Hp("Hp",1000);
		Computer dell = new Dell("Dell",2000);
		
		
		Computer[] computers = {apple,lenovo,hp,dell};
		
		for(Computer c: computers) {
			c.priceInfo();
			c.runOffice();
			c.internet();
			System.out.println("--------------");
			
		}
		
	}
}

