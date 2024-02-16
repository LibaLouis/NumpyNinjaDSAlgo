package stepdefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.GenericPage;
import pageobjects.HomePage;
import pageobjects.StackPage;
import utilities.LoggerLoad;

public class StackSteps {

	StackPage Stackpage = new StackPage();
	HomePage home= new HomePage();
	GenericPage commonActions = new GenericPage();
	String expectedMsg;
	
	//02
	@When("The user selects Stack item from the drop down menu")
	public void the_user_selects_stack_item_from_the_drop_down_menu() {
	   Stackpage.clickOnGetStartInStackPage();
	   LoggerLoad.info("User select Stack from Data Structure dropdown ");
	}

	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
		LoggerLoad.info("User redirected to Stack Data Structure Page ");
		String Title = Stackpage.getStackPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, "Stack", "Title do not match");
	}

	//03
	@When("The user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() {
		Stackpage.clickOnOperationsInstackpage();
	}

	@Then("The user should then be directed to {string} Page")
	public void the_user_should_then_be_directed_to_page(String string) {
		LoggerLoad.info("User redirected to Stack DataStructure Page ");
		String Title = Stackpage.getStackPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Operations in Stack", "Title do not match");
	}

	//04
	@When("The user clicks {string} button in {string} page")
	public void the_user_clicks_button_in_page(String string, String string2) {
		commonActions.click_Tryhere();	
		LoggerLoad.info("User clicked on Try here Button");
	}

	//06
	@When("The user clicks on the Implementation button")
	public void the_user_clicks_on_the_implementation_button() {
		Stackpage.ClickimplementationLink();
	}

	@Then("The user should be directed to Implementation Page")
	public void the_user_should_be_directed_to_implementation_page() {
		LoggerLoad.info("User redirected to Stack Implementation Page ");
		String Title = Stackpage.getStackPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Implementation", "Title do not match");
	}

	//9
	@When("The user clicks on the Applications button")
	public void the_user_clicks_on_the_applications_button() {
		Stackpage.ClickApplicationLink();
		LoggerLoad.info("User redirected to Stack Applications Page ");
	}

	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {
		String Title = Stackpage.getStackPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Applications", "Title do not match");
	}

	//12
	@When("The user clicks on the Practice Questions button")
	public void the_user_clicks_on_the_practice_questions_button() {
		Stackpage.ClickApplicationLink();
		Stackpage.ClickPracticeQuestionLink();
		LoggerLoad.info("User redirected to Practice Questions  Page ");
	}

	@Then("The user should be directed to Practice Questions  Page")
	public void the_user_should_be_directed_to_practice_questions_page() {
		String Title = Stackpage.getStackPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Practice Questions", "Title do not match");
		LoggerLoad.info("NO questions found ");
	}


}
