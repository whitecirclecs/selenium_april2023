package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyTitleApple {
	
	public static void main(String[] args) {
		//	1) Open the browser		
		ChromeDriver driver = new ChromeDriver();		
		
		//	2) Navigate to application
		driver.get("https://www.apple.com");
		
		//	3) Verify title is Apple
		String expectedTitle = "Apple";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test Case Passed");
		}
		
		else {
			System.out.println("Test Case Failed");
		}
		
		//	4) Close the browser
		driver.quit();
	}

}
