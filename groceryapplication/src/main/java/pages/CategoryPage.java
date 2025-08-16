package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.GeneralUtilities;

public class CategoryPage {
	public WebDriver driver;
	WebDriverWait wait;

	FileUploadUtility file = new FileUploadUtility();
	GeneralUtilities gen = new GeneralUtilities();

	public CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@id='category']")
	WebElement newcategoryfield;
	@FindBy(xpath = "//span[text()='discount']")
	WebElement discount;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement addimage;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebutton;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchbtn;
	@FindBy(xpath = "//input[@class='form-control']")
	WebElement category;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement searchcategory;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertsuccess;
	@FindBy(xpath = "//center[text()='.........RESULT NOT FOUND.......']")
	WebElement notfound;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement edit;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement categoryupdated;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/category/delete?del=2741&page_ad=1']")
	WebElement delete;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-danger btncss']")
	WebElement confirmdelete;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement categoryalreadyexist;
	@FindBy(xpath = "//div[@class='card-header']")
	WebElement searchlist;

	// new category
	public CategoryPage deletealert() {
		confirmdelete.click();
		return this;
	}

	public CategoryPage clickonnewbutton() {
		newbutton.click();
		return this;
	}

	public CategoryPage entercategory(String name) {
		newcategoryfield.clear();
		newcategoryfield.sendKeys(Constant.category);
		return this;
	}
	public CategoryPage entercategory2(String name) {
		newcategoryfield.clear();
		newcategoryfield.sendKeys(Constant.category2);
		return this;
	}

	public CategoryPage adddiscount() {

		discount.click();
		return this;
	}

	public CategoryPage fileupload() {
		// addimage.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\images\\fried-bakes-recipe-2138150-hero-01-62db8a304bfe4b78bad439ebb60f4ac9.jpg");
		file.sendkeys(addimage, Constant.image1);
		return this;
	}

	public CategoryPage clicksavebutton() {
		savebutton.click();
		return this;
	}

	// search category
	public CategoryPage clickonsearchgbutton() {
		searchbtn.click();
		return this;
	}

	public CategoryPage searchcategory(String name) {
		category.sendKeys(name);
		return this;
	}

	public CategoryPage searchcategoryfinal() {
		searchcategory.click();
		return this;
	}

	public CategoryPage editcategory() {
		edit.click();
		return this;
	}

	public boolean isalertmessagedisplayed() {
		try {
			wait.until(driver -> alertsuccess.isDisplayed());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean resultnotfound() {
		try {
			wait.until(driver -> notfound.isDisplayed());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean CategoryAlreadyExist() {
		try {
			wait.until(driver -> categoryalreadyexist.isDisplayed());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean Categoryupdated() {
		try {
			wait.until(driver -> categoryupdated.isDisplayed());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean searchlistcategory() {
		try {
			wait.until(driver -> searchlist.isDisplayed());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public CategoryPage deletecategory() {
		delete.click();
		return this;
	}
	// TODO Auto-generated method stub

}
