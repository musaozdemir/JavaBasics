package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		String file = "configs/Example.properties";
		
		
		FileInputStream fis = new FileInputStream(file);
		
		Properties p = new Properties();		
		p.load(fis);

		System.out.println(p);
		System.out.println("address is -->" +p.getProperty("address"));
		p.setProperty("street", "New brook drive");
		
		//specifying path for different file
		String newFile = "configs/newFile.properties";
		
		//if File is not there it will be created
		FileOutputStream fos = new FileOutputStream(newFile);
		
		p.store(fos, "added aditional key to newFile");
		
		
		
		
		
		
	}

}
