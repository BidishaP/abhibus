package objectrepository1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition1.Hkoo1;

public class HomePage1 {
	public HomePage1(){
	PageFactory.initElements(Hkoo1.driver, this);	
	}
@FindBy(id="source")
private WebElement from;
@FindBy(id="destination")
private WebElement to;
@FindBy(name="journey_date")
private WebElement date;
public WebElement getFrom() {
	return from;
}
public WebElement getTo() {
	return to;
}
public WebElement getDate() {
	return date;
}
public WebElement getSearch() {
	return search;
}
@FindBy(xpath="//a[@title='Search Buses']")
private WebElement search;
}
