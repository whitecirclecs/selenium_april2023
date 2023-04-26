package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyBtnStatus {
	
	ChromeDriver driver;
	
	@BeforeTest(alwaysRun=true)
	public void launchApplication() {
		//	1) Open the browser
		driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://letcode.in/buttons");
	}
	
	@Test(groups = "regression")
	public void verifyBtnStatus() {
		//	4) Verify button with 'Disable' text is disabled
		boolean btnStatus = driver.findElement(By.id("isDisabled")).isEnabled();
		Assert.assertFalse(btnStatus);
	}

//	5) Close the browser
	@AfterTest(alwaysRun=true)
	public void closeBrowser() {
		driver.quit();
	}

}
