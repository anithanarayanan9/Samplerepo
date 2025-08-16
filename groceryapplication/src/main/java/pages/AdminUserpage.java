package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserpage{
	public WebDriver driver;

	public AdminUserpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']")
	WebElement newadminusersbutton;
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement usertypedropdown;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement savebutton;
	@FindBy(xpath = "//option[@value='staff']")
	WebElement usertypedropdownele;
	public void clickOnNewbutton() {
		newadminusersbutton.click();
	}

	public void enterUserNameOnUsernameField(String newuser) {
		username.sendKeys(newuser);
	}

	public void enterPasswordOnPasswordField(String newpass) {
		password.sendKeys(newpass);
	}


	public AdminUserpage clickOnUserTypeDropDown() {
		usertypedropdown.click();
		Select select=new Select(usertypedropdownele);
		select.selectByIndex(1);
		return this;
		
	}

	public void clickOnSaveButton() {
		savebutton.click();

	}

}