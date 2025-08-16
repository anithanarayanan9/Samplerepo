package testscripts;

import java.io.IOException;
import org.testng.Assert;

import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constant;
import pages.Homepage;
import pages.Loginpage;
import pages.Managenews;
import utilities.Excelutility;

public class Managenewstest extends Base {

	@Test

	public void addnewnews() throws IOException {
		Loginpage login;
		Homepage home;
		Managenews mngnews;
		String username = Excelutility.readStringData(1, 0, "loginpage");
		String password = Excelutility.readStringData(1, 1, "loginpage");
		login = new Loginpage(driver);
		login.enterUsername(username).enterPassword(password);
		// home=new Homepage(driver);
		home = login.clickOnSignInButton();
		// news.clickonnewbutton();
		// login.loginbyusingexceldata();

		mngnews = home.clickonmanagenews().clickonnewbutton().enternews(Constant.news).save();
		// Managenews mngnews=new Managenews(driver);
		// mngnews.clickonnewbutton();
		// mngnews.enternews(Constant.news);
		// mngnews.save();
		boolean alert = mngnews.newscreatedsuccessfully();
		Assert.assertTrue(alert, Constant.np_addnewnews);
		System.out.println(alert);

	}
}