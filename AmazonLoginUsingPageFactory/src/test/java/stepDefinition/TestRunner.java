package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) //Cucumber Annotations - Need JUnit for this
@CucumberOptions(features="src/test/resources/Feature", glue= {"stepDefinition"}, monochrome = true, 
plugin = {"pretty", "junit:target/JUNITReports/JUNITReport.xml", 
					"json:taret/JSONReports/JSONReport.json",
					"html:target/HTMLReports"})

public class TestRunner {

}
