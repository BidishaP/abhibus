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
private WebElement dte;
@FindBy(xpath="//span[text()='Next']")
private WebElement nxt;
public WebElement getNxt() {
	return nxt;
}
public WebElement getDte() {
	return dte;
}
@FindBy(xpath="(//a[@class='ui-state-default'])[34]")
private WebElement date1;
public WebElement getDate1() {
	return date1;
}
public WebElement getDate2() {
	return date2;
}
public WebElement getDate3() {
	return date3;
}
public WebElement getDate4() {
	return date4;
}
@FindBy(xpath="//a[@class='ui-state-default'])[35]")
private WebElement date2;
@FindBy(xpath="//a[@class='ui-state-default'])[36]")
private WebElement date3;
@FindBy(xpath="//a[@class='ui-state-default'])[37]")
private WebElement date4;
public WebElement getFrom() {
	return from;
}
public WebElement getTo() {
	return to;
}
public WebElement getSearch() {
	return search;
}
@FindBy(xpath="//a[text()='Search']")
private WebElement search;
}
