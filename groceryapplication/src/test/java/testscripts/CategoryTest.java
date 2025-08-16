package testscripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import automationcore.Base;
import constants.Constant;
//import automationcore.Baseclass;
import pages.CategoryPage;
import pages.Homepage;
import pages.Loginpage;
import utilities.Excelutility;
import utilities.GeneralUtilities;

public class CategoryTest extends Base {

	Loginpage login;
	Homepage home;
	CategoryPage category;

	@Test(priority=0)

	public void addnewcategory() throws IOException {
		login = new Loginpage(driver);
		String username = Excelutility.readStringData(1, 0, "loginpage");
		String password = Excelutility.readStringData(1, 1, "loginpage");
		login.enterUsername(username).enterPassword(password);
		home = login.clickOnSignInButton();

		// CategoryPage categorypage = new CategoryPage(driver);
		category = home.clickonmanagecategory().clickonnewbutton().entercategory(Constant.category).adddiscount()
				.fileupload();
		// String Category = Excelutility.readStringData(1, 0, "category");

		WebElement savebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		// categorypage.clicksavebutton();
		GeneralUtilities.clickJavaScriptExecutor(savebutton, driver);
		
		SoftAssert soft = new SoftAssert();
//		boolean alert = category.CategoryAlreadyExist();
//		Assert.assertTrue(alert, Constant.cp_CategoryAlreadyExist);
//		System.out.println(alert);

		boolean alert2 = category.isalertmessagedisplayed();
		Assert.assertTrue(alert2, Constant.cp_addnewcategory);
		System.out.println(alert2);
		soft.assertAll();
	}

	@Test(priority=1)

	public void searchcategory() throws IOException {

		// Loginpage loginpage=new Loginpage(driver);
		login = new Loginpage(driver);

		String username = Excelutility.readStringData(1, 0, "loginpage");
		String password = Excelutility.readStringData(1, 1, "loginpage");
		login.enterUsername(username).enterPassword(password);
		home = login.clickOnSignInButton();

		category = home.clickonmanagecategory().clickonsearchgbutton().searchcategory(Constant.category)
				.searchcategoryfinal();
		// String Category = Excelutility.readStringData(1, 0, "category");

		boolean alert = category.searchlistcategory();
		Assert.assertTrue(alert, Constant.cp_searchlistcategory);
		System.out.println(alert);

//		boolean alert2 = categorypage.resultnotfound();
//		Assert.assertTrue(alert2, Constant.cp_searchcategory);
//		System.out.println(alert);
	}

	@Test(priority=2)

	public void Editcategory() throws IOException {

//Loginpage loginpage=new Loginpage(driver);
		login = new Loginpage(driver);

		String username = Excelutility.readStringData(1, 0, "loginpage");
		String password = Excelutility.readStringData(1, 1, "loginpage");
		login.enterUsername(username).enterPassword(password);
		home = login.clickOnSignInButton();

		category = home.clickonmanagecategory().clickonsearchgbutton().searchcategory(Constant.category)
				.searchcategoryfinal().editcategory().entercategory2(Constant.category2).fileupload();

		WebElement savebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		GeneralUtilities.clickJavaScriptExecutor(savebutton, driver);

		boolean alert = category.Categoryupdated();
		Assert.assertTrue(alert, Constant.cp_Editcategory);
		System.out.println(alert);
	}

	@Test(priority=4)

	public void Deletecategory() throws IOException {

		login = new Loginpage(driver);

		String username = Excelutility.readStringData(1, 0, "loginpage");
		String password = Excelutility.readStringData(1, 1, "loginpage");
		login.enterUsername(username).enterPassword(password);
		home = login.clickOnSignInButton();

		category = home.clickonmanagecategory().clickonsearchgbutton().searchcategory(Constant.category2)
				.searchcategoryfinal();
		// String Category = Excelutility.readStringData(2, 0, "category");

		WebElement deletecategory = driver.findElement(By.xpath("//i[@class='fas fa-trash-alt']"));
		GeneralUtilities.clickJavaScriptExecutor(deletecategory, driver);

		// js.executeScript("arguments[0].click();", deletecategory);
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		// categorypage.deletecategory();

//boolean alert=categorypage.resultnotfound();
//Assert.assertTrue(alert,Constant.cp_searchcategory);
//System.out.println(alert);	
	}
}
