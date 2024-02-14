package stepdefinition;
import static org.testng.Assert.assertEquals;

import pageobjects.TreePage;
import pageobjects.GenericPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;
import utilities.ConfigReader;

public class TreeSteps {
	
	TreePage treepage = new TreePage();
	String Excelpath = ConfigReader.getExcelFilePath();

	GenericPage commonActions  = new GenericPage();
	

@When("The user selects Tree item from the drop down menu")
public void the_user_selects_tree_item_from_the_drop_down_menu() throws InterruptedException {
	treepage.clickOnGetStartInTreePage();
	Thread.sleep(1000);   
	LoggerLoad.info("User is in the tree page");
}

@Then("The user should be directed to the {string} Page")
public void the_user_should_be_directed_to_the_page(String string) {
	LoggerLoad.info("User redirected to Tree Data Structure Page ");
	String Title = treepage.getTreePageTitle();
	LoggerLoad.info("Title of current page is : " + Title);
	assertEquals(Title,"Tree", "Title do not match");   
}

@When("The user clicks on the Overview of Trees link")
public void the_user_clicks_on_the_overview_of_trees_link() {
	treepage.clickOnoverviewOfTreesPage();
	LoggerLoad.info("User clicked on the overview of Trees link");
}

@Then("The user should be directed to the {string} of tree Page")
public void the_user_should_be_directed_to_the_of_tree_page(String string) {
	String Title = treepage.getTreePageTitle();
	LoggerLoad.info("Title of current page is : " + Title);   
}

@When("The user clicks {string} button in a {string} page")
public void the_user_clicks_button_in_a_page(String string, String string2) {
	commonActions .click_Tryhere();
	LoggerLoad.info("User clicks Try here Button");   
}

@Then("The user should be redirected to a page having tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_try_editor_with_a_run_button_to_test() {
	String Title = treepage.getTreePageTitle();
	LoggerLoad.info("Title of current page is :" + Title);   
}

@When("The user clicks on the Terminologies button")
public void the_user_clicks_on_the_terminologies_button() {
	treepage.clickOnTerminologiesLink();   
	LoggerLoad.info("User clicked on the Terminologies link");
}

@When("The user clicks on the Types of Trees button")
public void the_user_clicks_on_the_types_of_trees_button() {
    treepage.clickOnTypesOfTreesPage();
	LoggerLoad.info("User clicked on the Types of Trees link");
	}

@When("The user clicks on the Tree Traversals button")
public void the_user_clicks_on_the_tree_traversals_button() {
	treepage.clickOnTreeTraversalsLink();  
	LoggerLoad.info("User clicked on the Trees Traversals link");
}

@When("The user clicks on the Traversal illustration button")
public void the_user_clicks_on_the_traversal_illustration_button() {
	treepage.clickOnTrav_illus_Link();   
	LoggerLoad.info("User clicked on the Traversals Illustration link");
}

@When("The user clicks on the binary trees button")
public void the_user_clicks_on_the_binary_trees_button() {
	treepage.clickOnBinaryTreesLink();  
	LoggerLoad.info("User clicked on the Binary Trees link");
}

@When("The user clicks on the types of binary trees button")
public void the_user_clicks_on_the_types_of_binary_trees_button() {
	treepage.clickOnTypesOfBTLink();   
	LoggerLoad.info("User clicked on the Binary Trees link");
}

@When("The user clicks on the Implementation in Python button")
public void the_user_clicks_on_the_implementation_in_python_button() {
	treepage.click_implementationinPython();   
	LoggerLoad.info("User clicked on the Implementation in Python link");
}

@When("The user clicks on the binary tree traversals button")
public void the_user_clicks_on_the_binary_tree_traversals_button() {
	treepage.click_binaryTreeTraversals();  
	LoggerLoad.info("User clicked on the Binary Trees Traversals link");
}

@When("The user clicks on the Implementation of Binary Trees button")
public void the_user_clicks_on_the_implementation_of_binary_trees_button() {
	treepage.click_implementationOfBinaryTrees(); 
	LoggerLoad.info("User clicked on the Implementation of Binary Trees link");
}

@When("The user clicks on the Applications of Binary Trees button")
public void the_user_clicks_on_the_applications_of_binary_trees_button() {
	treepage.click_applicationsOfBinaryTrees();  
	LoggerLoad.info("User clicked on the Applications Binary Trees link");
}

@When("The user clicks on the Binary Search Trees button")
public void the_user_clicks_on_the_binary_search_trees_button() {
	treepage.click_binarySearchTrees();    
	LoggerLoad.info("User clicked on the Binary Search Trees link");
}

@When("The user clicks on the Implementation of BST button")
public void the_user_clicks_on_the_implementation_of_bst_button() {
	treepage.click_implementationOfBST();
	LoggerLoad.info("User clicked on the Implementation of BST link ");
}

@When("The user clicks on the Practice Questions in Overview of Trees")
public void the_user_clicks_on_the_practice_questions_in_overview_of_trees() {
    treepage.click_practiceQuestion();
    LoggerLoad.info("User clicked on the Practice Questions Link ");
}

@Then("The user should be directed to Practice Questions of tree page Page")
public void the_user_should_be_directed_to_practice_questions_of_tree_page_page() {
	String Title = treepage.getTreePageTitle();
	LoggerLoad.info("Title of current page is :" + Title);
	LoggerLoad.info("No questions found on the practice page");
}

}
