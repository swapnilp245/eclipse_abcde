package testrunners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/resources/AppFeatures/UserRegistration.feature"},
		glue = {"stepdefinitions"}	
//		plugin= {"pretty", "json:target/MyReports/report.json",
//				"junit:target/MyReports/report.xml"},
//		monochrome = true,	
//	//	publish = true
//		dryRun=true
		
		)


public class UserRegTest {

}