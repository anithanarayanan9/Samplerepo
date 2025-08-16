package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constant;
import pages.Homepage;
import pages.Loginpage;
import utilities.Excelutility;

public class Hometest extends Base {
	Homepage home;
	Loginpage login;
	@Test
	public void verifyUserIsAbletoSuccessfullyLogout() throws IOException {

		String username = Excelutility.readStringData(1, 0, "loginpage");
		String password = Excelutility.readStringData(1, 1, "loginpage");
		 login= new Loginpage(driver);
		login.enterUsername(username).enterPassword(password);
		home=login.clickOnSignInButton().pagelogout();

		 
		boolean alert=home.loginpagediaplayed();
		Assert.assertTrue(alert,Constant.hp_verifyUserIsAbletoSuccessfullyLogout);
	System.out.println(alert);
	}

}
