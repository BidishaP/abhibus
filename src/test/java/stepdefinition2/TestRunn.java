package stepdefinition2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/ticket.feature",glue= {"stepdefinition1", "stepdefinition2"}, plugin= {"html:target"}, monochrome=true, dryRun=false)

public class TestRunn {

}
