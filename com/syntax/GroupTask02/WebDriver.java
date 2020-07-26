package com.syntax.GroupTask02;

public interface WebDriver {

	void open();

	void close();

	String getTitle = "Boss";

}

interface TakesScreenShot {

	void getScreenShot();

}

interface PublicWebDriver extends WebDriver, TakesScreenShot {

	void navigate();
}

class ChromeDriver implements PublicWebDriver {

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

}

class FirefoxDriver implements PublicWebDriver {

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

}

class SafariDriver implements PublicWebDriver {

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
}
