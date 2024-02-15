package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

import utilities.configReader;
import hooks.DriverManager;



public class LoginPage {
	
	public static WebDriver driver=DriverManager.getdriver();
	String loginurl=configReader.getLoginPageUrl();
	String loginhome=configReader.getHomePageUrl();
	
	@FindBy (xpath="//input[@id='id_username']") WebElement username;
	@FindBy(xpath="//input[@id='id_password']")WebElement password;
	@FindBy(xpath="//*[@value='Login']")WebElement login;
	@FindBy(xpath = "//div[@class='alert alert-primary']")WebElement InvalidNameandPassword;
	@FindBy(xpath = "//div[@class='alert alert-primary']")WebElement loggedInMessage;
	@FindBy(xpath = "//a[@href='/logout']")WebElement signout;
	@FindBy(xpath = "//div[@class='alert alert-primary']")WebElement signoutMessage;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void gotoLoginPage() {
		driver.get(loginurl);
	}
	
	public void signIn(String uname,String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public String invalidMessage() {

		String getMesg = InvalidNameandPassword.getText();
		
		return getMesg;
	}

	public String loggedInVerify() {

		String validationMsg = loggedInMessage.getText();
		return validationMsg;
	}
	
	public void signoutClick() {
		
        driver.get(loginhome);
		signout.click();
	}
	
	public String signedOutMsg() {
		String msg=signoutMessage.getText();
		return msg;
	}
	
	
	

}

