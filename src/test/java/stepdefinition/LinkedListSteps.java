package stepdefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import pageobjects.LinkedListPage;
import pageobjects.GenericPage;
import utilities.LoggerLoad;
import utilities.ConfigReader;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSteps {
	
	LinkedListPage link=new LinkedListPage();
	String Excelpath = ConfigReader.getExcelFilePath();
	static String expectedMsg;
    
	GenericPage commonActions = new GenericPage();
    
	
	
	//LinkedList02
	@When("The user clicks getstarted for LinkedList module")
	public void the_user_clicks_getstarted_for_linkedlist_moduke() {
		LoggerLoad.info("The user select Linked List from the drop down menu");
		link.dropdown_LinkedList();
	}

	@Then("The user redirected to {string}  Page")
	public void the_user_redirected_to_page(String pagename) {
		LoggerLoad.info("User redirected to linked list data structure Page ");
		String Title = link.getLinkedListPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertNotEquals(Title, pagename, "Titles do not match");
	}
	
	
	//LinkedList03

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		link.click_introduction();
	}

	@Then("The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String pagename) {
		LoggerLoad.info("User redirected to the Page " + pagename);
		String Title = link.getLinkedListPageTitle();
		LoggerLoad.info("Title of current page is checking:" + Title);
		assertEquals(Title, pagename, "Title match");
	}
	
	
	//LinkedList04
	@When("The user clicks {string} button in the {string} page")
	public void the_user_clicks_button_in_the_page(String string,String string2) {

		commonActions.click_Tryhere();
	}

	@Then("The user redirected to the page having an tryEditor with a Run button to test")
	public void the_user_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = link.getLinkedListPageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Titles match");
	}

	// LinkedList07, LinkedList08, LinkedList09, LinkedList10
	@When("The user clicks creating linked list link")
	public void the_user_clicks_creating_linked_list_link() {
		link.click_creatingLinkedList();
	}

	// LinkedList11, LinkedList12, LinkedList13, LinkedList14
		@When("The user clicks the Types of Linked List button")
		public void the_user_clicks_the_types_of_linked_list_button() {
			link.click_typesOflLinkedList();
		}

		// LinkedList15, LinkedList16, LinkedList17, LinkedList18
		@When("The user clicks the Implement Linked List in Python button")
		public void the_user_clicks_the_implement_linked_list_in_python_button() {
			link.click_implementlinkedListInPython();
		}

		// LinkedList19, LinkedList20, LinkedList21, LinkedList22
		@When("The user clicks the Traversal button")
		public void the_user_clicks_the_traversal_button() {
			link.click_traversal();
		}

		// LinkedList23, LinkedList24, LinkedList25, LinkedList26
		@When("The user clicks the Insertion button")
		public void the_user_clicks_the_insertion_button() {
			link.click_insertion();
		}

		// LinkedList27, LinkedList28, LinkedList29, LinkedList30
		@When("The user clicks the Deletion button")
		public void the_user_clicks_the_deletion_button() {
			link.click_deletion();
		}

		// LinkedList31
		@When("The user clicks on the Practice Questions")
		public void the_user_clicks_on_the_practice_questions() {
			link.click_practiceQuestion();
		}

		@Then("The user should be directed to Practice Questions of Linked List Page")
		public void the_user_should_be_directed_to_practice_questions_of_linked_list_page() {
			String Title = link.getLinkedListPageTitle();
			LoggerLoad.info("Title of current page is :" + Title);
			assertEquals(Title, "Practice Questions", "Title do not match");
			LoggerLoad.info("NO questions found ");
		}
		
		@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
		public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
			String Title = link.getpageTitle();
			LoggerLoad.info("Title of current page is : " + Title);
			assertEquals(Title, "Assessment", "Title do not match");
		}
		
		@Then("The user should get the error message")
		public void the_user_should_get_the_error_message() {
			String actualMsg = link.getErrormsg();
			LoggerLoad.info("Actual result  :" + actualMsg);
			assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
		}

	}