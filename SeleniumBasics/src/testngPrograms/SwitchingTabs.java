package testngPrograms;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchingTabs {

	WebDriver driver;

	@BeforeTest
	public void launchApplication() {
		// 1) Open the browser
		driver = new ChromeDriver();

		// 2) Maximize it
		driver.manage().window().maximize();

		// 3) Navigate to application
		driver.get("https://facebook.com");
	}

	@Test
	public void switchFocusOnNewTab() throws InterruptedException {
		// 4) Click on Instagram
		driver.findElement(By.linkText("Instagram")).click();	

		// 5) Switch focus on new tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		// Wait for next page to get loaded completely
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		// 6) Write ab@gmail.com in the email-textbox
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");

	}

}
