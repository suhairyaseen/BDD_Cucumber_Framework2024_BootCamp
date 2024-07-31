package com.tutorialninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Page {
public WebDriver driver;
	

	
	@FindBy(xpath = "//td[@class = 'text-center']/following::img")
	private WebElement RightProduct;
	
	@FindBy(linkText = "Checkout")
	private WebElement checkoutButton;
	
	public AddToCart_Page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver , this);
	}
	
	public boolean displayedRightProduct() {
		boolean product = RightProduct.isDisplayed();
		return product;
	}
	public void clickOncheckoutButton() {
		checkoutButton.click();
	}
}
