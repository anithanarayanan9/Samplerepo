package testscripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import automationcore.Base;

import pages.AdminUserpage;
import pages.CategoryPage;
import pages.Homepage;

import pages.Loginpage;

import utilities.Excelutility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
	Loginpage login;
	Homepage home;
	CategoryPage category;
	AdminUserpage adminuserpage;

	@Test
	public void addnewcategorywithValidDetails() throws IOException {

		String username = Excelutility.readStringData(1, 0, "loginpage");
		String password = Excelutility.readStringData(1, 1, "loginpage");

		login = new Loginpage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnSignInButton();

		home = new Homepage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,340)", "");
		WebElement adminuser = driver
				.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']"));
		js.executeScript("arguments[0].click();", adminuser);
		// home.clickonadminuser();

		adminuserpage = new AdminUserpage(driver);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js1.executeScript("window.scrollBy(400,0)", "");
		WebElement newadminusersbutton = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		js1.executeScript("arguments[0].click();", newadminusersbutton);
		// adminuserpage.clickOnNewbutton();

		FakerUtility faker = new FakerUtility();
		String Uname = faker.Username();
		String Pswd = faker.Password();

		adminuserpage.enterUserNameOnUsernameField(Uname);
		adminuserpage.enterPasswordOnPasswordField(Pswd);
		adminuserpage.clickOnUserTypeDropDown();
		adminuserpage.clickOnSaveButton();

//		boolean successalertmessagedisplayed=adminuserpage.isAdminUsersInformationsavedDisplayed();
//		Assert.assertTrue(successalertmessagedisplayed, "Success message not displayed after user is created.");
//		Assert.assertTrue(successalertmessagedisplayed,Messages.ADMINUSERCREATION_ERROR);

	}
}
