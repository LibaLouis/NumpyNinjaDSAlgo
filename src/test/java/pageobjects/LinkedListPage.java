package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.AppUtils;
import utilities.configReader;
import hooks.DriverManager;

public class LinkedListPage {
	
	WebDriver driver=DriverManager.getdriver();

	AppUtils appUtil = new AppUtils();
	
	HomePage home= new HomePage();
	
			// LinkedListPage
		@FindBy (xpath="//a[@href='introduction']")WebElement introductionLink;  
		@FindBy (xpath="//a[@href='creating-linked-list']")WebElement creatinglinkedlistLink; 
		@FindBy (xpath="//a[@href='types-of-linked-list']")WebElement typesOfLLLink;  
		@FindBy (xpath="//a[@href='implement-linked-list-in-python']")WebElement implementLLInPythonLink; 
		@FindBy (xpath="//a[@href='traversal']")WebElement traversalLink; 
		@FindBy (xpath="//a[@href='insertion-in-linked-list']")WebElement insertionLink; 
		@FindBy (xpath="//a[@href='deletion-in-linked-list']")WebElement deletionLink; 
		@FindBy (xpath="//a[@href='/linked-list/practice']")WebElement practiceQuestionLink; 
		
	
		public LinkedListPage() {

			PageFactory.initElements(driver, this);
		}
		
		public void navigateTo(String page_name) {
			String page=configReader.getUrl(page_name);
			driver.get(page);
			
		}

		public void dropdown_LinkedList() {
				
			home.getStartedForModule("Linked List");
		}
		
		public String getLinkedListPageTitle() {
			String title = driver.getTitle();
			return title;
		}

		public void click_introduction() {
			//Loggerload.info("click " + introductionLink.getText());
			introductionLink.click();
			//Loggerload.info(" Title of the page " + driver.getTitle());
			
		}

		public void click_creatingLinkedList() {
			//Loggerload.info("click " + creatinglinkedlistLink.getText() + " On linked list page");
			creatinglinkedlistLink.click();
			//Loggerload.info(" Title of the page " + driver.getTitle());
			
		}
		public void click_typesOflLinkedList() {
			//Loggerload.info("click " + typesOfLLLink.getText() + " On linked list page");
			typesOfLLLink.click();
			//Loggerload.info(" Title of the page " + driver.getTitle());
		}

		public void click_implementlinkedListInPython() {
			//Loggerload.info("click " + implementLLInPythonLink.getText() + " On linked list page");
			implementLLInPythonLink.click();
			//Loggerload.info(" Title of the page " + driver.getTitle());
		}

		public void click_traversal() {
			//Loggerload.info("click " + traversalLink.getText() + " On linked list page");
			traversalLink.click();
			//Loggerload.info(" Title of the page " + driver.getTitle());
		}

		public void click_insertion() {
			//Loggerload.info("click " + insertionLink.getText() + " On linked list page");
			insertionLink.click();
			//Loggerload.info(" Title of the page " + driver.getTitle());
		}

		public void click_deletion() {
			//Loggerload.info("click " + deletionLink.getText() + " On linked list page");
			deletionLink.click();
			//Loggerload.info(" Title of the page " + driver.getTitle());
		}

		public void click_practiceQuestion() {
			//Loggerload.info("click " + practiceQuestionLink.getText() + " On linked list page");
			practiceQuestionLink.click();
			//Loggerload.info(" Title of the page " + driver.getTitle());
		}
		
		public String getpageTitle() {
			String title = driver.getTitle();
			return title;
		}


		public String getErrormsg() {
			String errormsg = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			return errormsg;
		}

	}
