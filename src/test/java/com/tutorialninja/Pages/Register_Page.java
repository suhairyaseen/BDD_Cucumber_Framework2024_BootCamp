package com.tutorialninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameFiled;
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameFiled;
	
	@FindBy(id = "input-email")
	private WebElement emailFiled;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneFiled;
	
	@FindBy(id = "input-password")
	private WebElement passwordFiled;
	
	@FindBy(id = "input-confirm" )
	private WebElement ConfirmPasswod;
	
	@FindBy(xpath = "//input[@name = 'newsletter'][@value = '0']")
	private WebElement newsletterBox;
	
	@FindBy(xpath = "//input[@name = 'agree']")
	private WebElement PolicyBox;
	
	@FindBy(xpath = "//input[@value = 'Continue']")
	private WebElement continueButton;
	
public Register_Page(WebDriver driver) {
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
}
public void enterFirstname(String Fname) {
	 firstNameFiled.sendKeys(Fname);
}
public void enterLastName(String Lname) {
	lastNameFiled.sendKeys(Lname);
}
public void enterEmail(String emailaddress) {
	emailFiled.sendKeys(emailaddress);
}
public void enterTelephone(String tele) {
	 telephoneFiled.sendKeys(tele);
}
public void enterPassword(String Passwordcode) {
	passwordFiled.sendKeys(Passwordcode);
}
public void enterConfirmPassword(String Conpassword) {
	ConfirmPasswod.sendKeys(Conpassword);
}
public void checkNesLetterBox() {
	newsletterBox.click();

}
public void checkPolicyBox() {
	PolicyBox.click();
}
public Account_Page clickOnContinueButton() {
	continueButton.click();
	return new Account_Page(driver); 
}

}


