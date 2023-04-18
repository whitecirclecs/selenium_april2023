package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextOnLinkedIn {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://linkedin.com");
		
		//	4) Verify the text "Welcome to your professional community" is visible to the visitor.
		boolean textStatus = driver.findElement(By.xpath("//h1[contains(@data-test-id,'hero__headline')]")).isDisplayed();
		if (textStatus) {
			System.out.println("Text is visible");
		}
		
		else {
			System.out.println("Text is not visible");
		}
		
		//	5) Close the browser
		driver.quit();
	}

}
