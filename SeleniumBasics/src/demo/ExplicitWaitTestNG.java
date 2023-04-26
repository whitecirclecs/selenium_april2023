package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWaitTestNG {

	ChromeDriver driver;

	@BeforeTest(alwaysRun = true)
	public void launchApplication() {
		driver = new ChromeDriver();

		// 2) Maximize it
		driver.manage().window().maximize();

		// 3) Navigate to application
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
	}

	@Test(groups = "regression")
	public void explicitWait() {
//		4) Click on Start button
		driver.findElement(By.id("start")).click();

		// 5) Wait for the text 'Hello World!' to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));

		// 6) Verify text 'Hello World!' is visible on the page
		String expectedText = "Hello World!";
		String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();

		Assert.assertEquals(actualText, expectedText);
	}

	@AfterTest(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}

}
