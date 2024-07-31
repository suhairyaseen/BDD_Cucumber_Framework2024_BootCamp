package Step_definition_files;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tutorialninja.Pages.Home_Page;
import com.tutorialninja.Pages.Product_page;
import com.tutorialninja.Utilities.ConfigerReader;
import com.tutorialninja.driver_Factory.DriverFactoryCode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	
	public WebDriver driver;
	public Home_Page homepage;
	public Properties prop;
	public  Product_page productpage;
		
	@Given("user navigate to home page")
	public void user_navigate_to_home_page() {
		driver = DriverFactoryCode .getDriver();
		
		
	}
	@When("user enter valid product in search box") 
	public void user_enter_valid_product_in_search_box() throws Exception {
		prop = ConfigerReader.intializePropertiesFile();
		homepage = new Home_Page(driver);
		homepage.insertValidProductInSearchField(prop.getProperty("product"));
	}
	@And("click on search button")
	public void click_on_search_button() {
		homepage = new Home_Page(driver);
		productpage = homepage.clickOnSearchButton();
		
	}
	@Then("user should find right product in product page")
	public void user_should_find_right_product_in_product_page () {
		productpage = new Product_page(driver);
		Assert.assertTrue(productpage.displayedvalidProductSearch());
		
	}
	
}
