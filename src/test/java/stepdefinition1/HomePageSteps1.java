package stepdefinition1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import objectrepository1.HomePage1;

public class HomePageSteps1 {
	@Given("I want to write a step with")
	public void i_want_to_write_a_step_with() {
		Hkoo1.driver.get("https://www.abhibus.com/");
	}
	@When("I check for the in step {string}, {string}, {string}")
	public void i_check_for_the_in_step(String FromNa, String ToNa, String Date ) throws AWTException, InterruptedException {
HomePage1 home=new HomePage1();
home.getFrom().sendKeys(FromNa);
Thread.sleep(2000);
Robot r=new Robot();
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
home.getTo().sendKeys(ToNa);
Thread.sleep(2000);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
home.getDte().click();
home.getNxt().click();
home.getDate1().click();
home.getSearch().click();
	}
}