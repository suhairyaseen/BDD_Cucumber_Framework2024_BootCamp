package com.tutorialninja.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
/*
public class Extent_Reporter {

	
	
	public static ExtentReports createExtentReborter() throws Exception {
		ExtentReports extent = new ExtentReports();
		
		
		File extentreportfile = new File(System.getProperty("user.dir") + "\\test-output\\ExtentReportBDD\\tutorialninjaCucumber.html");
		
		ExtentSparkReporter spark = new ExtentSparkReporter( extentreportfile);
		
		
		spark.config().setReportName("Boot Camp BDD Exam");
		spark.config().setDocumentTitle("Valid Credentials Test");
		spark.config().setTimeStampFormat(" MM/dd/YYYY : hh:mm:ss");
		
		
		extent.attachReporter(spark);
		
		Properties prop = new Properties();
		FileInputStream ip = new  FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\configer\\config.properties");
		
		extent.setSystemInfo("Web application", prop.getProperty("url"));
		extent.setSystemInfo("browser name", prop.getProperty("browser"));
		extent.setSystemInfo("email", prop.getProperty("validEmail"));
		extent.setSystemInfo("password", prop.getProperty("validPassword"));
		extent.setSystemInfo("Tester", "Suhair yaseen");
		extent.setSystemInfo("opration system",System.getProperty( "os.name"));
		extent.setSystemInfo("java version",System.getProperty("java.specification.version"));
		
		
		return extent;
	}
}
*/