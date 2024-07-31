package com.tutorialninja.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigerReader {
	
	public static Properties prop;
	public static FileInputStream ip;
	
	public static Properties intializePropertiesFile() throws Exception {
		
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\configer\\config.properties");
		prop.load(ip);
		return prop;
	}
	
	
	

}
