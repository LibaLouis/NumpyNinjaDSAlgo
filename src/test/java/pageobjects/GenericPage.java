package pageobjects;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.DriverManager;
import utilities.AppUtils;
import utilities.ConfigReader;

public class GenericPage {

	public static WebDriver driver = DriverManager.getdriver();
	AppUtils appUtil = new AppUtils();
	
	String tryEditorURL=ConfigReader.tryEditorURL();
	

	@FindBy(xpath = "//a[text()='Try here>>>']") //try editor button
	WebElement tryHere;

	@FindBy(xpath = "//*[@class=' CodeMirror-line ']") //try editor input
	WebElement editorInput; 

	@FindBy(xpath = "//button[text()='Run']") //run button
	WebElement run;

	@FindBy(xpath = "//pre[@id='output']") //try editor output
	WebElement output;
	
	public GenericPage() {

		PageFactory.initElements(driver, this);
	}
	public void click_Tryhere() {
		//Loggerload.info("click on " + string1 + " button on " + string2);
		tryHere.click();
	}

	public void navigateTotryEditor() {
		driver.get(tryEditorURL);
		
	}
	
	public void click_Run() {
		run.click();
	}
	
	public void enterCodeToExecute(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String code = appUtil.getCodefromExcel(sheetName, rowNum);
		appUtil.enterCode(code, editorInput);
		
	}

	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = appUtil.readResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

	public String getErrorMessage() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;
		
	}
	public String getActualResult() {
		appUtil.waitForElement(output);
		return output.getText();
	}
	
	public void reusableMethod(String string) {

		String page_name = string.replaceAll("\\s+", "");
		String urlName = ConfigReader.getUrl(page_name);
		driver.get(urlName);
	}
	
}
