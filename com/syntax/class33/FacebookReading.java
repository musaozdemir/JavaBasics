package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FacebookReading {
	
	//Create a property file to store following configurations:
	//browser=chrome
//	url=https://facebook.com
//	username
//	password
//	Read file and extract values of browser & url

public static void main(String[] args) throws IOException {
		
		String file = "configs/Facebook.properties";
		
		
		FileInputStream fis = new FileInputStream(file);
		
		Properties p = new Properties();		
		p.load(fis);

		
		p.setProperty("browser", "chrome");
		p.setProperty("url", "https://facebook.com");
		p.setProperty("username", "musaozdemir");
		p.setProperty("password", "musa123456789");
		
//		//specifying path for different file
		String Facebook = "configs/Facebook.properties";
		
		//if File is not there it will be created
		FileOutputStream fos = new FileOutputStream(Facebook);
		
		p.store(fos, "added aditional key to newFile");
		
		
		
}
	
	

}
