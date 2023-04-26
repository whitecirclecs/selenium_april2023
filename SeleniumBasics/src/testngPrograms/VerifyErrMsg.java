package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyErrMsg {

	ChromeDriver driver;

	@BeforeTest(alwaysRun=true)
	public void launchApplication() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		// 2) Navigate to application
		driver.get("https://facebook.com");
	}

	@Test(groups="regression")
	public void verifyErrMsg() {
		// 3) Enter invalid email address in the email textbox
		driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com");

		// 4) Enter invalid password in password textbox
		driver.findElement(By.id("pass")).sendKeys("password@123");

		// 5) Click on Log in button
		driver.findElement(By.name("login")).click();

		// 6) Verify an error message - 'The email address you entered isn't connected
		// to an account. Find your account and log in.' is displayed.
		String expectedErrMessage = "The email address you entered isn't connected to an account. Find your account and log in.";
		String actualErrMessage = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		Assert.assertEquals(actualErrMessage, expectedErrMessage);
	}

	@AfterTest(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
	}

}
