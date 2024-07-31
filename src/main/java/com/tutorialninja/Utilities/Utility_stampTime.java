package com.tutorialninja.Utilities;

import java.util.Date;

public class Utility_stampTime {
	
	public static String emailStampTime() {
		
		Date date = new Date();
        String StampTime = date.toString().replace(":" , "_").replace(" ","_");
        return "sosocat" +  StampTime + "@gmail.com";
	}
	
	public static final int implicitWait = 10;
	public static final int pageLoadWait = 200;
	public static final int scriptWait = 2000;
	

}
