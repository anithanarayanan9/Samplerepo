package testscripts;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constant;
import pages.Homepage;
import pages.Loginpage;
import utilities.Excelutility;


	public class Logintest extends Base {
		Loginpage login;
		Homepage home;
		@Test
		public void verifyUserloginwithValidCredentials() throws IOException {
			String username=Excelutility.readStringData(1,0,"loginpage"); 
			String password=Excelutility.readStringData(1,1,"loginpage"); 
			login =new Loginpage(driver);
			login.enterUsername(username).enterPassword(password); 
					
			home=login.clickOnSignInButton();
			 
			 
			 boolean isHomepageload=login.isHomePageLoaded();
			 Assert.assertTrue(isHomepageload,Constant.lp_verifyloginwithvalidcredentials);
				System.out.println(isHomepageload);	
		}
		@Test
		public void veriyloginwithvalidusernameandinvalidpwd() throws IOException
		{
			String username=Excelutility.readStringData(2, 0, "loginpage");
			String password=Excelutility.readStringData(2, 1, "loginpage");
			login =new Loginpage(driver);
					login.enterUsername(username).enterPassword(password); 
					home=login.clickOnSignInButton();
				boolean alert=login.isalermessagediaplayed();
					Assert.assertTrue(alert,Constant.lp_veriyloginwithvalidusernameandinvalidpwd);
				System.out.println(alert);			
		}
		@Test
		public void verifyUserLoginWithIncorrectUsernameWithCorrectPassword() throws IOException {
			login =new Loginpage(driver);
			String username=Excelutility.readStringData(3, 0, "loginpage");
			String password=Excelutility.readStringData(3, 1, "loginpage");
		
			
			login.enterUsername(username).enterPassword(password); 
			home=login.clickOnSignInButton();
			boolean alert=login.isalermessagediaplayed();
			Assert.assertTrue(alert,Constant.lp_verifyUserLoginWithIncorrectUsernameWithCorrectPassword);
		System.out.println(alert);		
		}
		@Test
		public void verifyUserLoginWithIncorrectUsernameWithInCorrectPassword() throws IOException {
			login =new Loginpage(driver);
			String username=Excelutility.readStringData(4, 0, "loginpage");
			String password=Excelutility.readStringData(4, 1, "loginpage");
		
			
			login.enterUsername(username).enterPassword(password); 
			home=login.clickOnSignInButton();
			boolean alert=login.isalermessagediaplayed();
			Assert.assertTrue(alert,Constant.lp_verifyUserLoginWithIncorrectUsernameWithInCorrectPassword);
		System.out.println(alert);	
		}
	}
		
//		public void loginwithexcelread() throws IOException
//		{
//			Loginpage login=new Loginpage(driver);
//			login.loginbyusingexceldata();
//		}*/
		
//}
