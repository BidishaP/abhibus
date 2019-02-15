package stepdefinition1;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import objectrepository1.HomePage1;

public class HomePageSteps1 {
	@Given("I want to write a step with")
	public void i_want_to_write_a_step_with_name() {
		Hkoo1.driver.get("https://www.abhibus.com/");
	}
	@When("I check for the in step {string}, {string}, {string}")
	public void i_check_for_the_in_step(String FromNa, String ToNa, String Date ) {
HomePage1 home=new HomePage1();
home.getFrom().sendKeys(FromNa);
home.getTo().sendKeys(ToNa);
JavascriptExecutor js=(JavascriptExecutor)Hkoo1.driver;
js.executeScript("arguments[0].setAttribute('value','Date')",home.getDate());
home.getSearch().click();
}
}