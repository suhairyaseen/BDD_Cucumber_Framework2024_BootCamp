package Step_definition_files;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tutorialninja.Pages.Account_Page;
import com.tutorialninja.Pages.Home_Page;
import com.tutorialninja.Pages.Login_Page;
import com.tutorialninja.driver_Factory.DriverFactoryCode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	public WebDriver driver;
	public Home_Page homepage;
    public Login_Page loginpage;
    public Account_Page accountpage ;
		
	
	
	@Given("User navigate To Login page")

	public void User_navigate_To_Login_page() {
		driver = DriverFactoryCode .getDriver();
		homepage = new  Home_Page(driver);
	    homepage.clickOnMyAccountDropdown();
		loginpage = new Login_Page(driver);
		loginpage = homepage.clickOnLoginDropdown();
		
	}
	@When("^User enters valid email (.+)$")
	public void User_enters_valid_email(String emailaddress)  {
		
		loginpage = new  Login_Page(driver);
		loginpage.enterEmailInTextBox(emailaddress);
		
	}
	
	@And("^user enters valid password (.+)$")
	public void user_enters_valid_password(String passwordtext)  {
	
		loginpage = new Login_Page(driver);
		loginpage.enterPasswordInTextBox(passwordtext);
		
		
	}
	
	@And("user Clicks on the login button")
	public void user_Clicks_on_the_login_button() {
		loginpage = new Login_Page(driver);
		accountpage =loginpage.clickOnLoginButton();
		
		
		
	}
	@Then("User is Rediract to Account Page")
	public void User_is_Rediract_to_Account_Page() {
	    accountpage = new Account_Page(driver);
		Assert.assertTrue(accountpage.displayModifyWishList());
		
	}
	}
	
	