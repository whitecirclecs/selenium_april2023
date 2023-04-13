package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyTitle {
	
	public static void main(String[] args) {
		//	1) Open the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");		
		ChromeDriver driver = new ChromeDriver(options); //Class object = new Class();
		
		//	2) Navigate to the application.
		driver.get("https://linkedin.com"); //object.method()
		
		//	3) Verify user sees the title - LinkedIn: Log In or Sign Up
		String expectedTitle = "LinkedIn: Log In or Sign Up";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Case Passed");
		}
		
		else {
			System.out.println("Test Case Failed");
		}
		
		//	4) Close the browser
		driver.quit();
	}

}
