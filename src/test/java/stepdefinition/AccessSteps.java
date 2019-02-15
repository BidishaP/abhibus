package stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.Then;

import objectrepository.AccessPage;

public class AccessSteps {
	
	@Then("I validat the outcome")
	public void i_validat_the_outcome() {
		AccessPage steps=new AccessPage();
		Assert.assertTrue(steps.getCustid().isDisplayed());
}}
