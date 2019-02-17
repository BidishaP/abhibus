package objectrepository2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition2.Hook1;

public class AccessPage2 {
	public AccessPage2() {
		PageFactory.initElements(Hook1.driver, this);
		}
	@FindBy(xpath="//div//h1")
	private WebElement text;
	public WebElement getText() {
		return text;
	}

}
