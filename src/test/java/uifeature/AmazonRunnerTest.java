package uifeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\uifeature"},
		
		glue = {"uifeature"},
		
		plugin = {"pretty", "html:target/cucumber-reports/AmazonTestResults.html"},
		
		publish = true
		
		)

public class AmazonRunnerTest extends AbstractTestNGCucumberTests
{

}
