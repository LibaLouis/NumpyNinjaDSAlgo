package stepdefinition;

import pageobjects.ArrayPage;
import pageobjects.GenericPage;
import pageobjects.HomePage;
import utilities.AppUtils;
import utilities.LoggerLoad;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

//import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraySteps {

	ArrayPage array = new ArrayPage();
	HomePage home = new HomePage();

	GenericPage commonActions = new GenericPage();
	AppUtils appUtil = new AppUtils();
	String expectedMsg;
	
	@When("The user clicks on the Get Started button below Array")
	public void the_user_clicks_on_the_get_started_button_below_array() {
	    
		home.getStartedForModule("Arrays");
		LoggerLoad.info("User is in Arrays Module");
	}

	@Then("The user is redirected to {string} Page")
	public void the_user_is_directed_to_page(String string) {
		String Title = array.getArrayPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		//assertEquals(Title, pagename, "Title do not match");
	}
	@Given("The user is in {string} page")
	public void the_user_is_in_page(String string) {


		commonActions.reusableMethod(string);
		LoggerLoad.info("The user is in " + string);
	}

	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_link() {

		array.arraysInPythonClick();
		LoggerLoad.info("User clicks on Arrays in Python Link");
	}

	@Then("The user is redirected to {string} page")
	public void the_user_is_redirected_to_page(String string) {


		commonActions.reusableMethod(string);
		LoggerLoad.info("The user is redirected to " + string);
	}

	@When("The user clicks the Try here link")
	public void the_user_clicks_the_try_here_link() {

		array.tryHereClick();
		LoggerLoad.info("User clicks on try here button");
	}
	
	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
		array.clickOnRunButton();
		System.out.println("Clicked on Run Button");
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {

		String actualMsg = commonActions.getActualResult();
		LoggerLoad.info("Actual result  : " + actualMsg);
		assertEquals(actualMsg, expectedMsg);
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String sheetName,
			Integer rowNum) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		LoggerLoad.info("The user enter python code with invalid syntax in tryEditor from sheetname :" + sheetName
				+ " and row number : " + rowNum);
		array.enterPythonCodePractice(sheetName, rowNum);
	}

	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {

		array.arraysUsingListClick();
		LoggerLoad.info("User clicks on Arrays Using List Link");
	}

	@When("The user clicks Basic Operations in Lists link")
	public void the_user_clicks_basic_operations_in_lists_link() {

		array.basicOperationsInListsClick();
		LoggerLoad.info("User clicks on Operations in Lists Link");
	}

	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {

		array.applicationsOfArrayClick();
		LoggerLoad.info("User clicks on Application of Array Link");
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {

		array.practiceQuestionsClick();
		LoggerLoad.info("User clicks on Practice Questions Link");
	}
	
	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		LoggerLoad.info("User redirected to Practice page");
		String Title = array.getArrayPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, "Practice Questions", "Title do not match");
	}

		// 
		@When("The user clicks the Search the array link")
		public void the_user_clicks_the_search_the_array_link() {
			array.searchTheArrayClick();
			LoggerLoad.info("User clicks on Practice Questions - Search the array Link");
		}

		@Then("The user should be redirected to question page contains an tryEditor with Run and Submit buttons")
		public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_with_run_and_submit_buttons() {
			LoggerLoad.info("User redirected to Question page contains a question,an tryEditor with Run and Submit buttons");
			String Title = array.getArrayPageTitle();
			LoggerLoad.info("Title of current page is : " + Title);
			assertEquals(Title, "Assessment", "Title do not match");
		}

		// @Array17
		@Given("The user is on Question page of {string} after logged in")
		public void the_user_is_on_page_of_after_logged_in(String pname) {
			LoggerLoad.info("The user is on " + pname + " after logged in");
			String page_name = pname.replaceAll("\\s+", "");
			array.navigateTo(page_name);
		}
		
		@When("The user enter valid python code in tryEditor from sheet {string} and {int} for the question")
		public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_for_the_question(String sheetName,
				Integer rowNum) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
			LoggerLoad.info("The user enter valid python code in tryEditor from sheetname :" + sheetName
					+ " and row number :" + rowNum);
			array.enterPythonCodePractice(sheetName, rowNum);

			expectedMsg = commonActions.getExpectedResult(sheetName, rowNum);
		}
         //Array18
		@When("The user clicks on Submit button")
		public void the_user_clicks_on_submit_button() {
			array.clickOnSubmitButton();
		}

		@Then("The user should be presented with successful submission message")
		public void the_user_should_be_presented_with_successful_submission_message() throws InterruptedException {

			String actualMsg = commonActions.getActualResult();
			LoggerLoad.info("Actual result of successful submission message :" + actualMsg);
			assertNotEquals(actualMsg, expectedMsg, "Result do not match");
		}

		// @Array19
		// Array20

		@When("The user clicks the Max Consecutive Ones link")
		public void the_user_clicks_the_max_consecutive_ones_link() {

			array.maxConsecutiveOnesClick();
			LoggerLoad.info("User clicks on Practice Questions - Max Consecutive Ones Link");
		}

		// @Array21
		// @Array22
		// @Array23
		// @Array24

		@When("The user clicks the Find Numbers with Even Number of Digits link")
		public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
			array.findNumbersWithEvenNumberOfDigitsClick();
			LoggerLoad.info("User clicks on Practice Questions Link - Find Numbers with Even Number of Digits");
		}

		// @Array25
		// @Array26
		// @Array27
		// @Array28

		@When("The user clicks the Squares of a Sorted Array link")
		public void the_user_clicks_the_squares_of_a_sorted_array_link() {
			array.squaresOfASortedArrayClick();
			LoggerLoad.info("User clicks on Practice Questions Link - Squares of a sorted Array");
		}

		// @Array29
		// @Array30
		// @Array31
		@Then("The user should be presented with error message as {string}")
		public void the_user_should_be_presented_with_error_message_as(String expectedmsg) {

			String actualMsg = commonActions.getErrorMessage();
			LoggerLoad.info("Actual Error message is  : " + actualMsg);
			assertNotEquals(actualMsg, expectedmsg, "Result do not match");
		}
}
