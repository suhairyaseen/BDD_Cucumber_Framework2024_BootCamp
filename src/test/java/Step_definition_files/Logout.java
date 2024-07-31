package Step_definition_files;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tutorialninja.Pages.Account_Page;
import com.tutorialninja.Pages.Home_Page;
import com.tutorialninja.Pages.Login_Page;
import com.tutorialninja.Utilities.ConfigerReader;
import com.tutorialninja.driver_Factory.DriverFactoryCode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	public WebDriver driver;
	public Home_Page homepage;
    public Login_Page loginpage;
    public Account_Page accountpage ;
    public Properties prop;
    public String emailaddress;
    
	
	
	@Given("user is logged in")
	public void user_is_logged_in() throws Exception {
		prop = ConfigerReader.intializePropertiesFile();
		driver = DriverFactoryCode .getDriver();
		homepage = new  Home_Page(driver);
	    homepage.clickOnMyAccountDropdown();
		loginpage = new Login_Page(driver);
		loginpage = homepage.clickOnLoginDropdown();
		loginpage.enterEmailInTextBox(prop.getProperty("validemail"));
		loginpage.enterPasswordInTextBox(prop.getProperty("validpassword"));
		accountpage =loginpage.clickOnLoginButton();
	}
	@When("user click on the logout button")
	public void user_click_on_the_logout_button() {
		accountpage = new Account_Page(driver);
		accountpage.clickOnLogoutButton();
		
	}

	@And("user should get massage saying Account logout")
	public void user_should_get_massage_saying_Account_logout() {
		accountpage = new Account_Page(driver);
		Assert.assertTrue(accountpage.displayLogoutMessage());
	}
	@Then("user click on countinue button to navigate to homepage")
		public void user_click_on_countinue_buttonto_navigate_to_homepage() {
		accountpage = new Account_Page(driver);
		homepage =accountpage.clickOnContinueButtonToLogout();
	}
	}
