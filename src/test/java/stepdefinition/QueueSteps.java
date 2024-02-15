package stepdefinition;

import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.QueuePage;
import utilities.LoggerLoad;

public class QueueSteps {

	QueuePage queue = new QueuePage();
	HomePage home = new HomePage();

	@When("The user clicks Get Started button below Queue")
	public void the_user_clicks_get_started_button_below_Queue() {

		home.getStartedForModule("Queue");
		LoggerLoad.info("User is in queue page");
	}

	@When("The user clicks Implementation of Queue in Python link") 
	public void the_user_clicks_implementation_of_queue_in_python_link() {

		queue.implementationQueueClick();
		LoggerLoad.info("User clicked on Implementation of Queue in Python Page ");
	}

	@When("The user clicks Implementation using collections.deque link")
	public void the_user_clicks_implementation_using_collections_deque_link() {

		queue.collectionsDequeClick();
		LoggerLoad.info("User clicked on Implementation using collections deque page ");
	}

	@When("The user clicks Implementation using array link")
	public void the_user_clicks_implementation_using_array_link() {

		queue.implementationArrayClick();
		LoggerLoad.info("User clicked on Implementation using array link ");
	}

	@When("The user clicks Queue Operations link")
	public void the_user_clicks_queue_operations_link() {

		queue.queueOperationsClick();
		LoggerLoad.info("User clicked on Queue Operations link");
	}
}
