package pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
    public WebDriver driver;
    WebDriverWait wait;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); 
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    
    
    @FindBy(xpath = "//input[@placeholder='Username']") WebElement usernamefield;
    @FindBy(xpath = "//input[@placeholder='Password']") WebElement passwordfield;
    @FindBy(xpath = "//button[@class='btn btn-dark btn-block']") WebElement signinbutton;
    @FindBy(xpath = "//div[@class='content-header']") WebElement homepageOpen;
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']") WebElement alertmessage;
  
    public Loginpage  enterUsername(String username) {
                usernamefield.sendKeys(username);
                return this;
    }

    public Loginpage enterPassword(String password) {
              passwordfield.sendKeys(password);
              return this;
    }
    public Homepage clickOnSignInButton() {
        signinbutton.click();
	 return new Homepage(driver);
		
    }

//    public void loginAs(String username, String password) {
//        enterUsername(username);
//        enterPassword(password);
//        clickOnSignInButton();
//    }

    public boolean isHomePageLoaded() {
        try {
            wait.until(driver -> homepageOpen.isDisplayed());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
        public boolean isalermessagediaplayed()
        {
        	try {
                wait.until(driver -> alertmessage.isDisplayed());
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        }
    
   
    
    
    

