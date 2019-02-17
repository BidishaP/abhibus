package stepdefinition2;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import objectrepository2.AccessPage2;

public class AccessPageStep2 {
	@Then("I vrify success in step")
	public void i_vrify_success_in_step() {
		AccessPage2 ac=new AccessPage2();
		Assert.assertTrue(ac.getText().isDisplayed());
}
}