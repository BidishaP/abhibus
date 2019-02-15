package org.greens.Cucumber6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariff {
	static WebDriver driver;

	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bidisha\\eclipse-workspace5\\Cucumber6\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	@When("The user fill the plan details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_the_plan_details(String MonthRent,String Freeloc,String FreeInt,String Freesms,
		String LocCharges,String IntCharges,String SMSCharges) {
		driver.findElement(By.id("rental1")).sendKeys(MonthRent);
		driver.findElement(By.id("local_minutes")).sendKeys(Freeloc);
		driver.findElement(By.id("inter_minutes")).sendKeys(FreeInt);
		driver.findElement(By.id("sms_pack")).sendKeys(Freesms);
		driver.findElement(By.id("minutes_charges")).sendKeys(LocCharges);
		driver.findElement(By.id("inter_charges")).sendKeys(IntCharges);
		driver.findElement(By.id("sms_charges")).sendKeys(SMSCharges);
	}

	@When("The user submits the add tariff plan form")
	public void the_user_submits_the_add_tariff_plan_form() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the success message")
	public void the_user_should_see_the_success_message() {
		Assert.assertEquals("Congratulation you add Tariff Plan",
				driver.findElement(By.xpath("//section[@id='main']//h2")).getText());
	}

}
