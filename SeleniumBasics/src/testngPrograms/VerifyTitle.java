package testngPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {
	ChromeDriver driver; // global object

	@BeforeTest
	public void launchApplication() {
		// 1) Open the browser
		driver = new ChromeDriver(); // Class object = new Class();

		// 2) Navigate to the application.
		driver.get("https://linkedin.com");
	}

	@Test
	public void titleVerification() {
		String expectedTitle = "LinkedIn: Log In or Sign Upp";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
