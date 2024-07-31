package com.tutorialninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;

	@FindBy(id = "input-email")
	private WebElement emailTextBox;

	@FindBy(id = "input-password")
	private WebElement passwordTextBox;

	@FindBy(css = "input.btn.btn-primary")
	private WebElement loginButton;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterEmailInTextBox(String emailaddress) {
		emailTextBox.sendKeys(emailaddress);
	}

	public void enterPasswordInTextBox(String password) {
		passwordTextBox.sendKeys(password);
	}

	public Account_Page clickOnLoginButton() {
		loginButton.click();
		return new Account_Page (driver);
	}

	
	}

