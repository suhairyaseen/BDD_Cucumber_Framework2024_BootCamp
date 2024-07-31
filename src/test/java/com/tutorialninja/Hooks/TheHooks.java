package com.tutorialninja.Hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.tutorialninja.Utilities.ConfigerReader;
import com.tutorialninja.Utilities.Utility_stampTime;
import com.tutorialninja.driver_Factory.DriverFactoryCode;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TheHooks {
	
	
	public WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		Properties prop = ConfigerReader.intializePropertiesFile();
		DriverFactoryCode. intializeBrowser(prop.getProperty("browser"));
		driver = DriverFactoryCode.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility_stampTime.implicitWait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility_stampTime.pageLoadWait));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Utility_stampTime.scriptWait));
		//driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}

