package org.greens.Cucumber6;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class CustInsurance {
	static WebDriver driver;
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Bidisha\\eclipse-workspace5\\Cucumber6\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/insurance/v1/index.php");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

	@When("I complete action")
	public void i_complete_action(DataTable datatable) {
		
		Map<String, String> custDetails = datatable.asMap(String.class, String.class);
		Select se=new Select(driver.findElement(By.name("title")));
		se.selectByVisibleText(custDetails.get("title"));
		driver.findElement(By.name("firstname")).sendKeys(custDetails.get("fname"));
		driver.findElement(By.name("lastname")).sendKeys(custDetails.get("lname"));
		driver.findElement(By.name("phone")).sendKeys(custDetails.get("phnno"));
		Select s=new Select(driver.findElement(By.name("year")));
		s.selectByVisibleText("1991");
		Select si=new Select(driver.findElement(By.name("month")));
		si.selectByValue("4");
		Select sl=new Select(driver.findElement(By.name("date")));
		sl.selectByValue("3");
		driver.findElement(By.xpath("//label[text()='Provisional']")).click();
		 
	}

	@When("some other action")
	public void some_other_action(DataTable details) {
		Map<String, String> insurance = details.asMap(String.class, String.class);
		Select st=new Select(driver.findElement(By.id("user_licenceperiod"))); 
		st.selectByVisibleText("4");
		Select sc=new Select(driver.findElement(By.name("occupation")));
		sc.selectByVisibleText("Doctor");
		driver.findElement(By.name("street")).sendKeys(insurance.get("address"));
		driver.findElement(By.name("city")).sendKeys(insurance.get("city"));
		driver.findElement(By.name("county")).sendKeys(insurance.get("county"));
		driver.findElement(By.name("post_code")).sendKeys(insurance.get("pin"));
		driver.findElement(By.name("email")).sendKeys(insurance.get("email"));
		driver.findElement(By.name("password")).sendKeys(insurance.get("pwd"));
		driver.findElement(By.name("c_password")).sendKeys(insurance.get("cpwd"));
  
	}

	@When("yet another action")
	public void yet_another_action() {
		driver.findElement(By.name("submit")).click();  
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	   
	}


}
