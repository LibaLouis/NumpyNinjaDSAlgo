package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.DriverManager;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class GraphPage {

	
	public static WebDriver driver = DriverManager.getdriver();
	
	String URL=ConfigReader.getApplicationUrl();
	String homepage = ConfigReader.getHomePageUrl();
	
	@FindBy(xpath="//a[@class='list-group-item'][@href='graph']")
	WebElement graphGpage;
	
	@FindBy(xpath="//a[@href='graph-representations']")
	WebElement graphrepresentationpage;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestions;

	
	public GraphPage() {

		PageFactory.initElements(driver, this);
	}
	
	public String getGraphPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public void navigateToHomePage() {
		driver.get(homepage);
		LoggerLoad.info("user is in the home page");
	}
	
	public void navigateTo(String pagename) {
		String urlName = ConfigReader.getUrl(pagename);
		driver.get(urlName);
	}

	public void clickOnGraphLink() {
		graphGpage.click();
		LoggerLoad.info("User clicked on the Graph link");
	}
	
	public void clickOnGraphRepresentationsLink() {
		graphrepresentationpage.click();
		LoggerLoad.info("User clicked on the Graph Representations link");
	}
	
	public void clickOnGraphPracQuesLink() {
		practiceQuestions.click();
		LoggerLoad.info("User clicked on the Practice Questions link");
	}
	
}
