package stepdefinition;

//import java.io.IOException;

import pageobjects.DataStructurePage;
import pageobjects.HomePage;
import utilities.LoggerLoad;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureSteps {
	
	HomePage home = new HomePage();
	DataStructurePage data = new DataStructurePage();
	
	@When("The user clicks on the Get Started button below Data Structures")
	public void the_user_clicks_on_the_get_started_button_below_data_structures() {
	    
		home.getStartedForModule("Datastructures");
		LoggerLoad.info("User is in Datastructures page");
	}

	@When("The user clicks on the Time Complexity link")
	public void the_user_clicks_on_the_time_complexity_link() {
	   
		data.timeComplexity();
		LoggerLoad.info("User is in Time Complexity page");
	}


}

