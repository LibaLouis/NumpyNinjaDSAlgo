package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import pageobjects.LoginPage;
import utilities.LoggerLoad;
//import pageobjects.registerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	LoginPage loginPage =new LoginPage();
	
	

	//@TS_signin_01
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		loginPage.gotoLoginPage();
	    LoggerLoad.info("User is on signin page");
	}
	
	@When("The user clicks Login with empty username {string} and valid password {string}")
	public void the_user_clicks_login_with_empty_username_and_valid_password(String string, String string2) {
		loginPage.signIn(string, string2);
		loginPage.clickLogin();
	    LoggerLoad.info("User clicks Login with empty username and valid password ");
	}

	
	//@TS_signin_02
	@When("The user clicks Login with username {string} and empty password {string}")
	public void the_user_clicks_login_with_username_and_empty_password(String string, String string2) {
		loginPage.signIn(string, string2);
		loginPage.clickLogin();
	    LoggerLoad.info("User clicks Login with valid username and empty password ");
	}
	
//@TS_signin_03
	@When("The user clicks Login with invalid username {string} and invalid password {string}")
	public void the_user_clicks_login_with_invalid_username_and_invalid_password(String string, String string2) {
		loginPage.signIn(string, string2);
		loginPage.clickLogin();
		 LoggerLoad.info("User clicks Login with invalid username and password ");
	}
	
	@Then("It will display an error message {string}")
	public void it_will_display_an_error_message(String string) {
		
			assertEquals(loginPage.invalidMessage(), string);
			LoggerLoad.info("It displays an error message");			
	}
	
	//@TS_signin_04
	@When("The user clicks Login with valid username {string} and invalid password {string}")
	public void the_user_clicks_login_with_valid_username_and_invalid_password(String string, String string2) {
		loginPage.signIn(string, string2);
		loginPage.clickLogin();
		 LoggerLoad.info("User clicks Login with valid username and invalid password ");
	}
	
	@Then("It should display an error message {string} password not valid")
	public void it_should_display_an_error_message_password_not_valid(String string) {
			Assert.assertNotEquals(loginPage.invalidMessage(), string);
	}

	//@TS_signin_05
	@When("The user clicks Login with valid username  {string} and valid password {string}")
	public void the_user_clicks_login_with_valid_username_and_valid_password(String string, String string2) {
		loginPage.signIn(string, string2);
		loginPage.clickLogin();
	    LoggerLoad.info("User clicks Login with valid username and password ");
	}

	@Then("It should display {string} message with username in top right corner")
	public void it_should_display_message_with_username_in_top_right_corner(String string) {
			assertEquals(loginPage.loggedInVerify(), string);		
	}

	@Given("The user is logged in")
	public void the_user_is_logged_in() {
		loginPage.gotoLoginPage();
		loginPage.signIn("numpyarshsquashers@gmail.com", "Thankgmail123");
	    //log.loginClick();
	    LoggerLoad.info("User login using mentioned credentials ");
	}

	@When("The user clicks on Sign-Out link")
	public void the_user_clicks_on_sign_out_link() {
		loginPage.signoutClick();
	    LoggerLoad.info("User clicks on Signout ");
	}

	@Then("The user gets the message {string}")
	public void the_user_gets_the_message_logged_out_successfully(String string) {
		try {
			assertEquals(loginPage.loggedInVerify(), string);
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		LoggerLoad.info("User gets the message as Logged out successfully ");
	}

}

	
