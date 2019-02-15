package stepdefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.AddCustomerPage;

public class AddCustomerPageSteps {
	@When("The user fill th form")
	public void the_user_fill_th_form(DataTable customerDetails) {
		List<Map<String, String>> cust = customerDetails.asMaps(String.class, String.class);
		AddCustomerPage pages = new AddCustomerPage();
		pages.getRdo().click();
		pages.getFname().sendKeys(cust.get(0).get("fname"));
		pages.getLanme().sendKeys(cust.get(0).get("lanme"));
		pages.getMail().sendKeys(cust.get(0).get("email"));
		pages.getAddres().sendKeys(cust.get(0).get("address"));
		pages.getPhnono().sendKeys(cust.get(0).get("phno"));

	}

	@When("The user submit the add customer plan form")
	public void the_user_submit_the_add_customer_plan_form() {
		AddCustomerPage pages = new AddCustomerPage();
		pages.getSub().click();
	}
}
