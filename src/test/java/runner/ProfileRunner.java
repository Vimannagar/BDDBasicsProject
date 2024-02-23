package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Profile.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"},
		
		tags = "(@sanity or @functional) and (not @regression)"

		)


public class ProfileRunner extends AbstractTestNGCucumberTests
{
	
	

}
