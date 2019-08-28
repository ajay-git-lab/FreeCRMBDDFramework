package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Personal Documents\\Ajay\\AjayEclipseWS\\FreeCRMBDDFramework\\src\\main\\java\\Features\\deals.feature"
		,glue= {"stepDefinitions"},
		plugin = {"pretty","html:test-output","json:json-output/cucumber_json_rpt.json","junit:junit-output/cucumber_junit_rpt.xml"},
		dryRun = false,
		strict = true,
		monochrome = true
		)

public class TestRunner {

		
	
}
