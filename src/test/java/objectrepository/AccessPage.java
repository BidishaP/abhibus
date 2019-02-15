package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class AccessPage {
	public AccessPage(){
		PageFactory.initElements(Hook.driver, this);
	}
@FindBy(xpath="(//table//h3")
	private WebElement custid;
public WebElement getCustid() {
	return custid;
}
}
