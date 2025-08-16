package automationcore;

	import java.io.FileInputStream;
import java.io.IOException;
//import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constant;

import utilities.Screenshotutility;

import utilities.Waitutilities;

public class Base {
	Properties prop;
	FileInputStream file;
	public WebDriver driver;
	Waitutilities wait=new Waitutilities();
	
	@BeforeMethod
	@Parameters("browser")
	
	public void initializebrowser(String browser) throws Exception {
		prop=new Properties();
		file=new FileInputStream(Constant.Configfile);
		prop.load(file);
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			throw new Exception("Invalid Browser");
		}
		
//		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	

	@AfterMethod
	public void driverQuit(ITestResult iTestResult) throws IOException
	{
	if(iTestResult.getStatus()==ITestResult.FAILURE)
	{
		Screenshotutility screenShot=new Screenshotutility();
	screenShot.getScreenshot(driver, iTestResult.getName());
	}
	//driver.quit();

	}
	}
//	public void quitbrowser()
//	{
//		driver.quit();
//	}
	


