package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/addcust50.feature",glue= {"stepdefinition"}, plugin= {"html:target"}, monochrome=true, dryRun=false)

public class TestRunner1 {
	
}
