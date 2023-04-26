package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleValidations {
	
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
		
	//	4) Verify user sees the title - Facebook -log in or sign up
	@Test(priority=0)
	public void verifyTitle() {
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}	
	
	//	5) Verify user sees the text - "Facebook helps you connect and share with the people in your life."
	@Test(priority=1)
	public void verifyText() {
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		String actualText = driver.findElement(By.xpath("//h2[contains(@class,'eso')]")).getText();
		Assert.assertEquals(actualText, expectedText);
	}
		
	
	//	6) Verify "Log in" button is blue in color
	@Test(priority=2, enabled = false)
	public void verifyLoginBtnColor() {
		String expectedColor = "rgba(24, 119, 242, 1)";
		String actualColor = driver.findElement(By.name("login")).getCssValue("background-color");
		Assert.assertEquals(actualColor, expectedColor);
	}	
	
	//	7) Verify "Create new account" button is enabled.
	@Test(priority=3)
	public void verifyCreateNewAccBtnIsEnabled() {
		 boolean btnStatus= driver.findElement(By.linkText("Create new account")).isEnabled(); 
		 Assert.assertTrue(btnStatus);
	}
	
	//	8) Close the browser
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
