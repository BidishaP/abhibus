package stepdefinition;

import cucumber.api.java.en.Given;
import objectrepository.HomePage;

public class HomePageSteps {
	@Given("The user is add customer plan page")
	public void the_user_is_add_customer_plan_page() {
	    Hook.driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("Go insid the add customer page")
	public void go_insid_the_add_customer_page() {
	    HomePage home=new HomePage();
	    home.getLnk_addCustomer().click();
}
}