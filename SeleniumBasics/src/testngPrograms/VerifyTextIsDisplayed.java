package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTextIsDisplayed {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		//	1) Open the browser
		driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://facebook.com");
	}
	
	@Test
	public void textVerification() {
		//	4) Verify the text - 'Facebook helps you connect and share with the people in your life.' is displayed on the web-page.
//		boolean expectedTextStatus = true;
//		boolean actualTextStatus = driver.findElement(By.xpath("//h2[contains(@class,'eso')]")).isDisplayed();
//		Assert.assertEquals(actualTextStatus, expectedTextStatus);	
		
		boolean actualTextStatus = driver.findElement(By.xpath("//h2[contains(@class,'eso')]")).isDisplayed();
		Assert.assertTrue(actualTextStatus);
	}


//	5) Close the browser
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
