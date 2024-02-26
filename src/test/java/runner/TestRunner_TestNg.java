package runner;
 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ConfigReader;
 
//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"stepdefinition","hooks"},
plugin={"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"html:test-output/cucumber-reports/dsalgo.html","json:target/jsonReports/report.json",
		"html:test-output/jsonReports/report2.json","junit:target/jsonReports/report1.json",
		"timeline:test-output-thread/"}
//,
//tags= "@Array"
		)

public class TestRunner_TestNg extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=false)
	public Object[][]scenarios() {
		return super.scenarios();
	}
	
	@BeforeTest
	@Parameters({"browserType"})

	public void defineBrowser(String browser) throws Throwable {
		ConfigReader.loadConfig();
		ConfigReader.setBrowserType(browser);


	}
}
