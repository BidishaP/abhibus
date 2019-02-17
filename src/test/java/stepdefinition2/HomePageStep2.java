package stepdefinition2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import objectrepository2.HomePage2;


public class HomePageStep2 {
		@Given("I wnt to write a step with book ticket")
		public void i_wnt_to_write_a_step_with_book_ticket() {
			Hook1.driver.get("https://www.abhibus.com/");
		}
		@When("I chck for the inside step {string}, {string}, {string}, {string}")
		public void i_chck_for_the_inside_step(String FromNa, String ToNa, String ToDate, String retnDate) throws AWTException, InterruptedException {
	HomePage2 hom=new HomePage2();
	hom.getFrom().sendKeys(FromNa);
	Robot r=new Robot();
	Thread.sleep(2000);	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	hom.getTo().sendKeys(ToNa);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	hom.getDte().click();
	hom.getDate().click();
	Thread.sleep(3000);
	hom.getRetrun().click();
	hom.getNext().click();
	hom.getDate1().click();
	hom.getSearch().click();
		}
}

