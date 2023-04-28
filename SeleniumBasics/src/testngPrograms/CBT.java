package testngPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBT {
	
	WebDriver driver; // global object

	@BeforeTest
	@Parameters("browser")
	public void launchApplication(String browser) {
		
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver(); // Class object = new Class();
		}
		
		else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}

		else if(browser.equals("Edge")) {
			driver = new EdgeDriver();
		}		
		
		// 2) Navigate to the application.
		driver.get("https://linkedin.com");
	}

	@Test(groups="regression")
	public void titleVerification() {
		String expectedTitle = "LinkedIn: Log In or Sign Up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
