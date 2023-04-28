package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkedInColorCode {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://linkedin.com");
	}
	
	@Test
	public void verifyTextColorCode() {
		String expectedColorCode = "rgba(143, 88, 73, 1)";
		String actualColorCode = driver.findElement(By.xpath("//h1[contains(@data-test-id,'hero__headline')]")).getCssValue("color");
		Assert.assertEquals(actualColorCode, expectedColorCode);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	

}
