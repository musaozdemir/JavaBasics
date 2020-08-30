package com.syntax.class33;

public class GettingSystemProperties {

	public static void main(String[] args) {
		
		///Users/musaozdemir/Desktop/Eclipse-workspace/JavaBasics/configs/Example.properties

		String username = System.getProperty("user.name");
		System.out.println(username);
		
		String os = System.getProperty("user.os");
		System.out.println(os);

		String director = System.getProperty("user.dir");
		System.out.println(director);

		String filePath = System.getProperty("user.dir")+"/configs/Example.properties";
		System.out.println(filePath);
		
	}
}
