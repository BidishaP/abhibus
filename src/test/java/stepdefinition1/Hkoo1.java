package stepdefinition1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hkoo1 {
public static WebDriver driver;
	@Before
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bidisha\\eclipse-workspace5\\Cucumber6\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
//@After
//public void afterMethod() {
	//driver.close();
	//driver.quit();
	}

