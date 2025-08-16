package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitutilities {
	public static int fluentwaitduration = 3;
	public static int explicitduration = 20;
	public static int implicitlyWaitduration = 15;

	public void fluentWaitElements(WebDriver driver, WebElement element, String attribute, String attributeValue,
			int total) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(total))
				.pollingEvery(Duration.ofSeconds(fluentwaitduration)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));

	}

	public void waitForWebElementAlert(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitduration));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void waituntilelementisvisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitduration));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waituntiltitleisvisible(WebDriver driver, String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitduration));
		wait.until(ExpectedConditions.titleContains(title));
	}

//	public void waituntiltitleisvisible(WebDriver driver,String title ) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(explicitduration));
//		wait.until(ExpectedConditions.);
//	}
	public void setImplicitWait(WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(implicitlyWaitduration));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void setImplicitWaitwaituntilelementisvisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(implicitlyWaitduration));
		wait.until(ExpectedConditions.visibilityOf(element));

	}
}
