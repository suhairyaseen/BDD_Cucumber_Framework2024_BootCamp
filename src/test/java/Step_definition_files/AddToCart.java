package Step_definition_files;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.tutorialninja.Pages.AddToCart_Page;
import com.tutorialninja.Pages.Home_Page;
import com.tutorialninja.Pages.Product_page;
import com.tutorialninja.Utilities.ConfigerReader;
import com.tutorialninja.driver_Factory.DriverFactoryCode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	
	public WebDriver driver;
	public Properties prop;
	public Home_Page homepage;
	public Product_page productpage;
	public AddToCart_Page addtocartpage;

	
	
	 @Given("user navigate to product page")
	 public void  user_navigate_to_product_page() throws Exception {
		 prop = ConfigerReader.intializePropertiesFile();
	     driver = DriverFactoryCode .getDriver();
	     homepage = new Home_Page(driver);
	     homepage.insertValidProductInSearchField(prop.getProperty("product"));
	     productpage = homepage.clickOnSearchButton();
		 
	 }
	 @When("user click on AddToCart button")
	 public void user_click_on_AddToCart_button() {
		 productpage = new Product_page (driver);
		 addtocartpage = productpage.clickOnAddToCartButton();
	 }
	 @And("user click on ShoppingCart button")
	 public void user_click_on_ShoppingCart_button() {
		 productpage = new Product_page (driver);
		 productpage.clickOnShoppingCartbutton();
	 }
	 @And("user should find the right product in shoppingcart")
	 public void user_should_find_the_right_product_in_shoppingcart() {
		 addtocartpage = new AddToCart_Page(driver);
		 addtocartpage .displayedRightProduct();
	 }
	 @Then("click on CheckOut button")
	 public void click_on_CheckOut_button() {
		 addtocartpage = new AddToCart_Page(driver);
		 addtocartpage.clickOncheckoutButton();
	 }
}
