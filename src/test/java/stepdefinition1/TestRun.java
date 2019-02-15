package stepdefinition1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/Ticket.feature",glue= {"stepdefinition1"}, plugin= {"html:target"}, monochrome=true, dryRun=false)

public class TestRun {
	
}
