package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Features"},
		glue = {"testScripts"},
		plugin= {"pretty","html:target/cucumber-reports"},
		tags = {"@smoke"}
		
		
		)

public class SmokeRun {
	
}
