package com.syntax.GroupTask02;

public interface WebDriver {

	void open();

	void close();

	public String getTitle(); 

}

interface TakesScreenShot {

	void getScreenShot();

}

interface RemoteWebDriver extends WebDriver, TakesScreenShot {

	void navigate();
}

class ChromeDriver implements RemoteWebDriver {

	public void navigate() {
		System.out.println("ChromeDriver naviagtor");
	}

	public void open() {
		System.out.println("ChromeDriver open");

	}

	public void close() {
		System.out.println("ChromeDriver close");

	}

	public void getScreenShot() {

		System.out.println("ChromeDriver getScreenshot");

	}
	
	public String getTitle() {
		
		return null;
	}

}

class FirefoxDriver implements RemoteWebDriver {

	public void navigate() {
		System.out.println("FirefoxDriver naviagtor");
	}

	public void open() {
		System.out.println("FirefoxDriver open");

	}

	public void close() {
		System.out.println("FirefoxDriver close");

	}

	public void getScreenShot() {

		System.out.println("FireFoxDriver getScreenshot");
	}
    
	public String getTitle() {
		
		return null;
	}
}

class SafariDriver implements RemoteWebDriver {

	public void navigate() {
		System.out.println("SafariDriver naviagtor");
	}

	public void open() {
		System.out.println("SafariDriver open");

	}

	public void close() {
		System.out.println("SafariDriver close");

	}

	public void getScreenShot() {

		System.out.println("SafariDriver getScreenshot");
	}
	
	public String getTitle() {
		
		return null;
	}
}
