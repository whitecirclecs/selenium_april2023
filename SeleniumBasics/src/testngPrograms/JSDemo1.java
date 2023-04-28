package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JSDemo1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}
	
	@Test
	public void enterUsername() {
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@data-testid,'login')]"));		
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("arguments[0].click()", loginBtn);
		
	}

}
