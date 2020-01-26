package com.amazon.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonbase {
 protected static WebDriver driver;

public static WebDriver getdriver (String Browser){
	
	if (Browser.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver",
					"C:/Users/ASWIN/Desktop/Java Installation Kit/Workspace/Flipkart/Driver/chromedriver.exe");
		driver = new ChromeDriver();}
	else if (Browser.equals("Firefox")){
		System.setProperty("webdriver.gecko.driver",
					"C:/Users/ASWIN/Desktop/Java Installation Kit/Workspace/Flipkart/Driver/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	return driver;
	
}

}
