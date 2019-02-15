package stepdefinition1;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import objectrepository1.AccessPage1;

public class AccessSteps1 {
	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
AccessPage1 acc=new AccessPage1();
	Assert.assertTrue(acc.getText().isDisplayed());
	}
}
