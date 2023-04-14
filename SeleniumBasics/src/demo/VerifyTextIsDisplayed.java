package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextIsDisplayed {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//	2) Maximize it
		driver.manage().window().maximize();
		
		//	3) Navigate to application
		driver.get("https://facebook.com");
		
		//	4) Verify the text 'Facebook helps you connect and share with the people in your life.' is displayed to the visitor of the page.
		boolean textStatus = driver.findElement(By.xpath("//h2[contains(@class,'eso')]")).isDisplayed();
		if (textStatus == true) {
			System.out.println("Test case passed");
		}
		
		else {
			System.out.println("Test Case failed");
		}
		
		//	5) Close the browser
		driver.quit();
	}

}
