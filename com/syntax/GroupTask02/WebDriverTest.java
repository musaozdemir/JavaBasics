package com.syntax.GroupTask02;

public class WebDriverTest {

	public static void main(String[] args) {
		
		SafariDriver safari = new SafariDriver();
		safari.open();
		safari.close();
		safari.getScreenShot();
		safari.navigate();
		System.out.println(safari.getTitle);
		
		System.out.println("");
		System.out.println("---------");
		System.out.println("");
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.open();
		chrome.close();
		chrome.getScreenShot();
		chrome.navigate();
		System.out.println(chrome.getTitle);
		
		System.out.println("");
		System.out.println("---------");
		System.out.println("");
		
		FirefoxDriver fireFox = new FirefoxDriver();
		fireFox.open();
		fireFox.close();
		fireFox.getScreenShot();
		fireFox.navigate();
		System.out.println(fireFox.getTitle);
		
		
	}
}
