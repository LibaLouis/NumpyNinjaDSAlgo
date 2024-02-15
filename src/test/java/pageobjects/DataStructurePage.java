package pageobjects;


//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import Utilities.configReader;
import hooks.DriverManager;

public class DataStructurePage {

	public static WebDriver driver = DriverManager.getdriver();
	


	@FindBy(xpath = "//a[text()='Time Complexity']")
	WebElement timeComplexity;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestions;

	public DataStructurePage() {

		PageFactory.initElements(driver, this);
	}


	public void timeComplexity() {

		timeComplexity.click();
	}


	public void practiceQuestions() {

		practiceQuestions.click();
	}

}
