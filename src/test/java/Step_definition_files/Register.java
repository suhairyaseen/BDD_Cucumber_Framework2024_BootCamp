package Step_definition_files;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tutorialninja.Pages.Account_Page;
import com.tutorialninja.Pages.Home_Page;
import com.tutorialninja.Pages.Register_Page;
import com.tutorialninja.Utilities.Utility_stampTime;
import com.tutorialninja.driver_Factory.DriverFactoryCode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	public WebDriver driver;
	public Home_Page homepage;
    public Register_Page registerpage ;
    public Account_Page accountpage; 
    
	
	@Given("user navigate to register page")
	public void user_navigate_to_register_page() throws Exception {
		driver =  DriverFactoryCode.getDriver();
		homepage = new Home_Page(driver);
		homepage.clickOnMyAccountDropdown();
		registerpage = new Register_Page(driver);
		registerpage = homepage.clickOnRegisertDropdown();
	   
		
	}
	
	@When("user enters below mandatory fileds")
	public void user_enter_First_Name(io.cucumber.datatable.DataTable dataTable) {
		Map<String , String> map = dataTable.asMap(String.class , String.class);
	    registerpage = new Register_Page(driver);
		registerpage.enterFirstname(map.get("FirstName"));
		registerpage.enterLastName(map.get("LastName"));
		registerpage.enterEmail(Utility_stampTime.emailStampTime());
		registerpage.enterTelephone(map.get("Telephone"));
		registerpage.enterPassword(map.get("Password"));
		registerpage.enterConfirmPassword(map.get("ConfirmPassword"));
		
	}
	
	
	@And("check the newsletter box")
	public void check_the_newsletter_box() {
		registerpage = new Register_Page(driver);	
		registerpage.checkNesLetterBox();
	}
	
	
	@And("user check the agree box")
	public void user_check_the_agree_box() {
		registerpage = new Register_Page(driver);	
		registerpage.checkPolicyBox();
	}
	@And("user Click on continue button")
	public void user_Click_on_continue_button() {
		registerpage = new Register_Page(driver);
		 registerpage.clickOnContinueButton();
	}
	@Then("user successfuly create account")
	public void user_successfuly_create_account () {
		accountpage = new Account_Page(driver);
		Assert.assertTrue(accountpage.displaySuccessfulMessage().contains("Congratulations! Your new account has been successfully created!"));
		
	
	}
	
	}
	
	
	
	
	
	

