package com.tutorialninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class Account_Page {
	
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//a[text() ='Modify your wish list']")
	private WebElement ModifywishList;
	
	@FindBy(xpath = "//p[text() = 'Congratulations! Your new account has been successfully created!']")
	private WebElement successfulmessage;
	
	@FindBy(xpath = "//a[@class = 'list-group-item']/following::a[@class = 'list-group-item'][text() = 'Logout']")
	private WebElement logoutButton;
	
	@FindBy(xpath = "//h1[text() = 'Account Logout']")
	private WebElement logoutMessage;
	
	@FindBy(xpath = "//h1[text() = 'Account Logout']//following::a[1]")
	private WebElement continueButtonToLogout;
	
	public Account_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public boolean displayModifyWishList() {
		boolean ModifyMyWishList = ModifywishList.isDisplayed();
		return ModifyMyWishList;
	}
	public String displaySuccessfulMessage() {
		String Successmessage = successfulmessage.getText();
		return  Successmessage;
}
	
	public void clickOnLogoutButton() {
		logoutButton.click();
		
	}
	public boolean displayLogoutMessage() {
		boolean message = logoutMessage.isDisplayed();
		return message;
	}
	
	public Home_Page clickOnContinueButtonToLogout() {
		continueButtonToLogout.click();
		return new Home_Page(driver);
		
	}
}




