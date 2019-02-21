package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\ksr02\\eclipse-workspace\\CucumberEx\\src\\test\\java\\test\\features\\CRMLogin.feature", 
glue={"StepDefinitions"},
format= {"pretty","html:test-outout"}, 
dryRun= false  )
public class TestRunner {
}
