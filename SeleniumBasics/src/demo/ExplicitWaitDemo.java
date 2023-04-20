package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
		
		//	4) Click on Start button
		driver.findElement(By.id("start")).click();
		
		//	5) Wait for the text 'Hello World!' to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));		
		
		//	6) Verify text 'Hello World!' is visible on the page
		String expectedText = "Hello World!";
		String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
		
		System.out.println("Expected text = " + expectedText);
		System.out.println("Actual text = " + actualText);
		
		if(expectedText.equals(actualText)) {
			System.out.println("Test Case passed");
		}
		else {
			System.out.println("Test Case failed");
		}
		
		// 7) Close the browser
		driver.quit();
	}

}
