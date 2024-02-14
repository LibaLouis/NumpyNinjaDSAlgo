package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.GenericPage;
import pageobjects.GraphPage;
import pageobjects.HomePage;
import pageobjects.LinkedListPage;
import pageobjects.LoginPage;
import utilities.LoggerLoad;
import utilities.ConfigReader;

public class GenericSteps {

	LoginPage loginPage= new LoginPage();
	HomePage home=new HomePage();
	GraphPage graph=new GraphPage();
	LinkedListPage linkListPage=new LinkedListPage();
	GenericPage commonActions = new GenericPage();
	
	String Excelpath = ConfigReader.getExcelFilePath();
	String expectedMsg;
	
	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_login_page_of_ds_algo_portal() {
		LoggerLoad.info("The user is on Signin page of DS Algo portal");
		loginPage.gotoLoginPage();
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_eneter_valid_and(String username, String password) {
		loginPage.signIn(username, password);
		LoggerLoad.info("User enters Username and Password");
	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
		LoggerLoad.info("User clicks on login button");
		loginPage.clickLogin();
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		String Title = home.getPageTitle();
		LoggerLoad.info("Title of current page is" + Title);
		assertEquals(Title, "NumpyNinja", "The user is in the homepage now");
	}
	
	//User on home page
	@Given("The user is on the Home page after logged in")
	public void the_user_is_on_the_home_page_after_logged_in() {
		String Title = home.getPageTitle();
		LoggerLoad.info("Title of current page is " + Title);
	}
	
	//User is on the module page
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String pagename) {
		String page_name = pagename.replaceAll("\\s+", "");
		graph.navigateTo(page_name);
		LoggerLoad.info("The user is on the " + pagename + " after logged in");		
	}

// Try Editor URL Valid and Invalid scenarios
	@Given("The user is in a page having an Editor with a Run button to test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
		LoggerLoad.info("The user is in a page having an tryEditor with a Run button to test");
		commonActions.navigateTotryEditor();
		String Title = graph.getGraphPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);    
	}

	@When("The user enters valid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_editor_from_sheet_and(String sheetName, Integer rowNum)throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		commonActions.enterCodeToExecute(sheetName, rowNum);
		expectedMsg = commonActions.getExpectedResult(sheetName, rowNum);
	}

	@When("clicks run button")
	public void clicks_run_button() {
		commonActions.click_Run();
		LoggerLoad.info("User clicks on Run button");
		}
	
	@Then("The user is presented with the result after run button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() throws InterruptedException {
		String actualMsg = commonActions.getActualResult();
		LoggerLoad.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, expectedMsg, "Result do not match");
	}
	
	@When("The user enters invalid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet_and(String sheetName,
			Integer rowNum) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		LoggerLoad.info("The user enter python code with invalid syntax in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		commonActions.enterCodeToExecute(sheetName, rowNum);
	}
	
	@Then("The user gets an error message as {string}")
	public void the_user_gets_an_error_message_as(String string) {
		String actualMsg = commonActions.getErrorMessage();
		LoggerLoad.info("Actual Error message is  : " + actualMsg);
		assertEquals(actualMsg,"NameError: name 'String' is not defined on line 1", "Result do not match");
	}	
}
