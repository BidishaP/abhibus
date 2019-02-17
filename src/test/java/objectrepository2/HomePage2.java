package objectrepository2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition2.Hook1;

public class HomePage2 {
	public HomePage2(){
		PageFactory.initElements(Hook1.driver, this);	
		}
	@FindBy(id="source")
	private WebElement from;
	@FindBy(id="destination")
	private WebElement to;
	@FindBy(name="journey_date")
	private WebElement dte;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;
	public WebElement getNext() {
		return next;
	}
	public WebElement getDate1() {
		return date1;
	}
	@FindBy(xpath="(//a[text()='11'])[2]")
	private WebElement date1;
	
	public WebElement getFrom() {
		return from;
	}
	public WebElement getTo() {
		return to;
	}
	public WebElement getDte() {
		return dte;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getRetrun() {
		return retrun;
	}
	@FindBy(xpath="//a[text()='Search']")
	private WebElement search;
	@FindBy(id="tomorrowdiv")
	private WebElement date;
@FindBy(name="journey_rdate")
private WebElement retrun;



}
