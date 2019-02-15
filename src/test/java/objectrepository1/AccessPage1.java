package objectrepository1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition1.Hkoo1;

public class AccessPage1 {
public AccessPage1() {
	PageFactory.initElements(Hkoo1.driver, this);
	}
@FindBy(xpath="//div//h1")
private WebElement text;
public WebElement getText() {
	return text;
}

}
