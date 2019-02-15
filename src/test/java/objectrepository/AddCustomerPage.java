package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class AddCustomerPage {
public AddCustomerPage(){
	PageFactory.initElements(Hook.driver, this);
}
@FindBy(xpath="//label[@for='done']")
private WebElement rdo;
@FindBy(id="fname")
private WebElement fname;
@FindBy(id="lname")
private WebElement lanme;
@FindBy(id="email")
private WebElement mail;
@FindBy(name="addr")
private WebElement addres;
public WebElement getRdo() {
	return rdo;
}
public WebElement getFname() {
	return fname;
}
public WebElement getLanme() {
	return lanme;
}
public WebElement getMail() {
	return mail;
}
public WebElement getAddres() {
	return addres;
}
public WebElement getPhnono() {
	return phnono;
}
public WebElement getSub() {
	return sub;
}
@FindBy(name="telephoneno")
private WebElement phnono;
@FindBy(name="submit")
private WebElement sub;

}
