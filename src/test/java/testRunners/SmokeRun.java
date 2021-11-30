package testRunners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Features"},
		glue = {"testScripts"},
		plugin= { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, //"pretty","html:target/cucumber-reports",
		tags = {"@smoke"}
		
		
		)

public class SmokeRun {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
	
}
