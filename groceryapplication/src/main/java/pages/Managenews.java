package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;


public class Managenews {
	
public WebDriver driver;
	
	public  Managenews(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']" ) WebElement newbutton;
	@FindBy(xpath = "//textarea[@id='news']") WebElement newsentryfield;
	@FindBy(xpath = "//button[@type='submit']") WebElement savenews;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement NewsCreated;

	
	public Managenews clickonnewbutton() {
		newbutton.click();
		return this;
		}
	public Managenews enternews(String news) {
		newsentryfield.sendKeys(Constant.news);
		return this;
	}
	public Managenews save() {
		savenews.click();
		return this;
	}
	public boolean  newscreatedsuccessfully() {
		return NewsCreated.isDisplayed();
	}
	
	
	
	

}
