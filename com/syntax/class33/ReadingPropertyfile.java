package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyfile {

	public static void main(String[] args) throws IOException {
		
		///Users/musaozdemir/Desktop/Eclipse-workspace/JavaBasics/configs/Example.properties
		
		//1. identify path to the file you woyuld like to read
		String filePath="configs/Example.properties";
		
		//2. create an object of FileInputStream class
		FileInputStream fis = new FileInputStream(filePath);
		
		//3. to work with Property file we use Properties class in Java
		Properties prop = new Properties();
		prop.load(fis);
		
		
		String username=prop.getProperty("username");
		System.out.println(username);
		
		String city = prop.getProperty("city");
		System.out.println(city);
		
		String password = prop.getProperty("password");
		System.out.println(password);
		
		String address=prop.getProperty("address");
		System.out.println(address);
		
		
	}
}
