package stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Steps1 {
	static WebDriver driver;
	@Given("The user is in add customer plan page")
	public void the_user_is_in_add_customer_plan_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bidisha\\eclipse-workspace5\\Cucumber6\\driver\\chromedriver.exe");
		driver.get("http://demo.guru99.com/telecom/");
	    	}

	@Given("Go inside the add customer page")
	public void go_inside_the_add_customer_page() {
	   driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("The user fill the form")
	public void the_user_fill_the_form(DataTable datatable) {
		List<Map<String, String>> cust = datatable.asMaps(String.class, String.class);
	   driver.findElement(By.xpath("//label[text()='Done']")).click();
	   driver.findElement(By.id("fname")).sendKeys(cust.get(1).get("fname"));
	   driver.findElement(By.id("lname")).sendKeys(cust.get(0).get("lname"));
	   driver.findElement(By.id("email")).sendKeys(cust.get(3).get("email"));
	   driver.findElement(By.name("addr")).sendKeys(cust.get(2).get("address"));
	   driver.findElement(By.name("telephoneno")).sendKeys(cust.get(4).get("phnno"));
	}

	@When("The user submits the add customer plan form")
	public void the_user_submits_the_add_customer_plan_form() {
	   driver.findElement(By.name("submit")).click();
	   }

	@Then("I validate the outcome")
	public void i_validate_the_outcome() {
	    Assert.assertTrue(driver.findElement(By.xpath("//table//h3")).isDisplayed());
	}


}
