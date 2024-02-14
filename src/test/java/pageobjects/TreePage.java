package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.DriverManager;
import utilities.ConfigReader;
import utilities.LoggerLoad;
public class TreePage {
	public static WebDriver driver =DriverManager.getdriver();
	String URL=ConfigReader.getApplicationUrl();
	String homepage = ConfigReader.getHomePageUrl();
	
	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement getstart_datastructures;
	@FindBy(xpath = "//a[@href='tree']")
	WebElement getstart_tree;
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]//a[contains(text(), 'Data Structures')]")
	WebElement dropdown;
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[contains(@href, '/tree')]")
	WebElement dropdown_tree;

	@FindBy(xpath = "//*[@href='overview-of-trees']")
	WebElement overviewOfTreesLink;
	@FindBy(xpath = "//*[@href='terminologies']")
	WebElement terminologiesLink;
	@FindBy(xpath = "//*[@href='types-of-trees']")
	WebElement typesoftreesLink;
	@FindBy(xpath = "//*[@href='tree-traversals']")
	WebElement treetraversalsLink;
	@FindBy(xpath = "//*[@href='traversals-illustration']")
	WebElement trav_illustrationsLink;
	@FindBy(xpath = "//*[@href='binary-trees']")
	WebElement binarytreesLink;
	@FindBy(xpath = "//*[@href='types-of-binary-trees']")
	WebElement typesofBinaryTreesLink;
	@FindBy(xpath = "//a[@href='implementation-in-python']")
	WebElement implementationInPythonLink;
	@FindBy(xpath = "//a[@href='binary-tree-traversals']")
	WebElement binaryTreeTraversalsLink;
	@FindBy(xpath = "//a[@href='implementation-of-binary-trees']")
	WebElement implementationOfBinaryTreesLink;
	@FindBy(xpath = "//a[@href='applications-of-binary-trees']")
	WebElement applicationsOfBinaryTreesLink;
	@FindBy(xpath = "//a[@href='binary-search-trees']")
	WebElement binarySearchTreesLink;
	@FindBy(xpath = "//a[@href='implementation-of-bst']")
	WebElement implementationOfBSTLink;
	@FindBy(xpath = "//a[@href='/tree/practice']")
	WebElement practiceQuestionLink;

	public TreePage() {
		PageFactory.initElements(driver, this);
	}

	public void dropdown_Tree() {
		LoggerLoad.info("click " + dropdown.getText() + "on the drop down");
		dropdown.click();
		LoggerLoad.info("click " + dropdown_tree.getText() + "from the the drop down");
		dropdown_tree.click();
	}
	
	public void clickOnGetStartInTreePage() {
		System.out.println(getstart_tree);
		System.out.println(driver);
		getstart_tree.click();
	}

	public String getTreePageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void clickOnoverviewOfTreesPage() {
		LoggerLoad.info("click " + overviewOfTreesLink.getText() + " On the Trees page");
		overviewOfTreesLink.click();
		LoggerLoad.info(" Title of the page" + driver.getTitle());
	}


	public void clickOnTerminologiesLink() {
		LoggerLoad.info("click " + terminologiesLink.getText() + " On the tree page");
		terminologiesLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void clickOnTypesOfTreesPage() {
		LoggerLoad.info("click " + typesoftreesLink.getText() + " On the tree page");
		typesoftreesLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void clickOnTreeTraversalsLink() {
		LoggerLoad.info("click " + treetraversalsLink.getText() + " On the tree page");
		treetraversalsLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void clickOnTrav_illus_Link() {
		LoggerLoad.info("click " + trav_illustrationsLink.getText() + " On the tree page");
		trav_illustrationsLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void clickOnBinaryTreesLink() {
		LoggerLoad.info("click " + binarytreesLink.getText() + " On the tree page");
		binarytreesLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void clickOnTypesOfBTLink() {
		LoggerLoad.info("click " + typesofBinaryTreesLink.getText() + " On the tree page");
		typesofBinaryTreesLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void click_implementationinPython() {
		LoggerLoad.info("click " + implementationInPythonLink.getText() + " On the tree page");
		implementationInPythonLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void click_binaryTreeTraversals() {
		LoggerLoad.info("click " + binaryTreeTraversalsLink.getText() + " On the tree page");
		binaryTreeTraversalsLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void click_implementationOfBinaryTrees() {
		LoggerLoad.info("click " + implementationOfBinaryTreesLink.getText() + " On the tree page");
		implementationOfBinaryTreesLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void click_applicationsOfBinaryTrees() {
		LoggerLoad.info("click " + applicationsOfBinaryTreesLink.getText() + " On the tree page");
		applicationsOfBinaryTreesLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void click_binarySearchTrees() {
		LoggerLoad.info("click " + binarySearchTreesLink.getText() + " On the tree page");
		binarySearchTreesLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void click_implementationOfBST() {
		LoggerLoad.info("click " + implementationOfBSTLink.getText() + " On the tree page");
		implementationOfBSTLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void click_practiceQuestion() {
		LoggerLoad.info("click " + practiceQuestionLink.getText() + " On the tree page");
		practiceQuestionLink.click();
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}
	public void navigateToHomePage() {
		driver.get(homepage);
		LoggerLoad.info("user is in the home page");
	}
	
	public void navigateTo(String pagename) {
		String urlName = ConfigReader.getUrl(pagename);
		driver.get(urlName);
	}
}
