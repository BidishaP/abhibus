package stepdefinition2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Hook1 {
	public static WebDriver driver;
	@Before
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bidisha\\eclipse-workspace5\\Cucumber6\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}

}
