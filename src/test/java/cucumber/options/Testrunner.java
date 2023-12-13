package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = { "stepDefination",
		"helper" }, tags = "@Reg1", plugin = "html:target/htmlReports/test.html")

public class Testrunner {
	
//Fake Automation
	// Late Automation
	// Early Automation
	// Test Cyprus

	

}


