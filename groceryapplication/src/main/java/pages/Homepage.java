package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	public WebDriver driver;
	WebDriverWait wait;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")
	WebElement managecategory;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")
	WebElement manangenews;
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath ="//i[@class='nav-icon fas fa-fa fa-address-book-o']")
	WebElement managecontact;
	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")
	WebElement logout;
	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	WebElement adminuser;
	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/login']")
	WebElement loginpage;
	

	public CategoryPage clickonmanagecategory() {
		managecategory.click();
		return new CategoryPage(driver);
	}

	public Managenews clickonmanagenews() {
		manangenews.click();
		return new Managenews(driver);
	}

	

	public AdminUserpage clickonadminuser() {
		adminuser.click();
		return new AdminUserpage(driver);
	}

	public Homepage pagelogout() {
		admin.click();
		logout.click();
		return this;
	}
	public boolean loginpagediaplayed()
    {
    	try {
            wait.until(driver -> loginpage.isDisplayed());
            return true;
        } catch (Exception e) {
            return false;
        }
}
}