package com.tutorialninja.driver_Factory;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactoryCode {
	
	
	
	public static WebDriver driver;
	public static ChromeOptions option;
public static FirefoxOptions options;
	
	public static void  intializeBrowser(String browsername) {
		if(browsername.equals("Chrome")) {
		option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		}
	
		else {
			System.out.println("The Browser doesn't match Any browser above");
		}
	
		}
		
		
	public static WebDriver getDriver(){
		return driver;
	}
}

