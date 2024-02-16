package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.DriverManager;

public class QueuePage {

	public static WebDriver driver = DriverManager.getdriver();

	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	WebElement implementationOfQueue;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHere;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestions;

	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	WebElement collectionsDeque;

	@FindBy(xpath = "//a[text()='Implementation using array']")
	WebElement implementationArray;

	@FindBy(xpath = "//a[text()='Queue Operations']")
	WebElement queueOperations;

	public QueuePage() {

		PageFactory.initElements(driver, this);
	}

	public void implementationQueueClick() {

		implementationOfQueue.click();
	}

	public void tryHereClick() {

		tryHere.click();
	}

	public void practiceQuestionsClick() {

		practiceQuestions.click();
	}

	public void collectionsDequeClick() {

		collectionsDeque.click();
	}

	public void implementationArrayClick() {

		implementationArray.click();
	}

	public void queueOperationsClick() {

		queueOperations.click();
	}
	
}
