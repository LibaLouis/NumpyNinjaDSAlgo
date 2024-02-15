package pageobjects;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AppUtils;
import utilities.LoggerLoad;
import utilities.ConfigReader;
import hooks.DriverManager;

public class ArrayPage {

	public static WebDriver driver = DriverManager.getdriver();
	
	HomePage home = new HomePage();

	AppUtils appUtil = new AppUtils();

	@FindBy(xpath = "//a[text()='Arrays in Python']")
	WebElement arraysInPython;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHere;

	@FindBy(xpath = "//a[text()='Arrays Using List']")
	WebElement arraysUsingList;

	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	WebElement basicOperationsInLists;

	@FindBy(xpath = "//a[text()='Applications of Array']")
	WebElement applicationsOfArray;
	
	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestions;

	@FindBy(xpath = "//a[text()='Search the array']")
	WebElement searchTheArray;

	@FindBy(xpath = "//a[text()='Max Consecutive Ones']")
	WebElement maxConsecutiveOnes;

	@FindBy(xpath = "//a[text()='Find Numbers with Even Number of Digits']")
	WebElement findNumbersWithEvenNumberOfDigits;

	@FindBy(xpath = "//a[text()='Squares of  a Sorted Array']")
	WebElement squaresOfASortedArray;
	
	@FindBy (xpath="//*[@id='answer_form']/button")
	WebElement runButton;
	
	@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;
	
	@FindBy (xpath="//*[@id='answer_form']")WebElement answerform;

	@FindBy (xpath="//*[@class='button']")
	WebElement submitButton;

	public ArrayPage() {

		PageFactory.initElements(driver, this);
	}
	
	public void arrayClick() {
		
		home.getStartedForModule("Arrays");
	}

	public void getUrlOf(String pagename) {
		String urlName = ConfigReader.getUrl(pagename);
		driver.get(urlName);
	}

	public void arraysInPythonClick() {

		arraysInPython.click();
	}

	public void arraysUsingListClick() {

		arraysUsingList.click();
	}

	public void basicOperationsInListsClick() {

		basicOperationsInLists.click();
	}

	public void applicationsOfArrayClick() {

		applicationsOfArray.click();
	}
	
	public void tryHereClick() {

		tryHere.click();
	}
	
	public void practiceQuestionsClick() {

		practiceQuestions.click();
	}
	public void searchTheArrayClick() {

		searchTheArray.click();
	}

	public void maxConsecutiveOnesClick() {

		maxConsecutiveOnes.click();
	}

	public void findNumbersWithEvenNumberOfDigitsClick() {

		findNumbersWithEvenNumberOfDigits.click();
	}

	public void squaresOfASortedArrayClick() {

		squaresOfASortedArray.click();
	}
	
	public String getArrayPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickOnSubmitButton() {
		LoggerLoad.info("Click on Submit button");
		submitButton.click();
	}
	
	public void clickOnRunButton() {
		LoggerLoad.info("Click on Run button");
		runButton.click();
	}
		
	public void enterPythonCodePractice(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		
		
		
		appUtil.waitForElement(answerform);
		String code = appUtil.getCodefromExcel(sheetname, rownumber);
		appUtil.enterCodePractice(code, editorInput);
	}
	
	public void navigateTo(String pagename) {
		String urlName = ConfigReader.getUrl(pagename);
		driver.get(urlName);
	}
}

